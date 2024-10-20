package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Coordinador;
import com.example.demo.entity.Estudiante;
import com.example.demo.repositpry.EstudianteRepository;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "estudiante")
public class ControllerWebEstudiante {
    
    @Autowired
    private EstudianteRepository estudianteRepository;
    
    @GetMapping("/resultadoTotal")
    public String estudianteResultadoTotalTemplate(Model model, HttpSession session) {
        // Obtener el usuario logeado de la sesión
        Estudiante estudiante = (Estudiante) session.getAttribute("usuarioLogeado");
        
        if (estudiante != null) {
            int total = estudiante.getPuntaje(); // Puntaje del estudiante
            String estado;
            int mediaNacional = 	125; // Media nacional establecida en 125
            
            // Determina el estado en base al puntaje total
            if (total == 0) {
                estado = "Anulado";
            } else if (total >= mediaNacional) {
                estado = "Aprobado";
            } else {
                estado = "Desaprobado";
            }

            // Determina el nivel en base al puntaje total
            String totalLevel;
            if (total < 100) {
                totalLevel = "Nivel 1";
            } else if (total < 125) {
                totalLevel = "Nivel 2";
            } else if (total < 150) {
                totalLevel = "Nivel 3";
            } else {
                totalLevel = "Nivel 4";
            }

            // Agregar atributos al modelo
            model.addAttribute("nombre", estudiante.getPrimerNombre());
            model.addAttribute("apellido", estudiante.getPrimerApellido());
            model.addAttribute("total", total);
            model.addAttribute("estado", estado);
            model.addAttribute("totalLevel", totalLevel);
        }

        return "estudiante-resultado-total";
    }
    
    @GetMapping("/resultadoUnico")
    public String estudianteResultadoUnicoTemplate(Model model, HttpSession session) {
        // Obtener el usuario logeado de la sesión
        Estudiante estudiante = (Estudiante) session.getAttribute("usuarioLogeado");
        
        if (estudiante != null) {
            model.addAttribute("nombre", estudiante.getPrimerNombre());
            model.addAttribute("apellido", estudiante.getPrimerApellido());
            model.addAttribute("comunicacion", estudiante.getComunicacionEscrita());
            model.addAttribute("comunicacionLevel", estudiante.getNivelComunicacionEscrita());
            model.addAttribute("razonamiento", estudiante.getRazonamientoCuantitativo());
            model.addAttribute("razonamientoLevel", estudiante.getNivelRazonamientoCuantitativo());
            model.addAttribute("lectura", estudiante.getLecturaCritica());
            model.addAttribute("lecturaLevel", estudiante.getNivelLecturaCritica());
            model.addAttribute("competencias", estudiante.getCompetenciasCiudadanas());
            model.addAttribute("competenciasLevel", estudiante.getNivelCompetenciasCiudadanas());
            model.addAttribute("ingles", estudiante.getIngles());
            model.addAttribute("inglesLevel", estudiante.getNivelIngles());
            model.addAttribute("levelIngles", estudiante.getNivelDeIngles());
            model.addAttribute("formulacion", estudiante.getFormulacionProyectosIngenieria());
            model.addAttribute("formulacionLevel", estudiante.getNivelFormulacionProyectosIngenieria());
            model.addAttribute("pensamiento", estudiante.getPensamientoCientifico());
            model.addAttribute("pensamientoLevel", estudiante.getNivelPensamientoCientifico());
            model.addAttribute("Diseno", estudiante.getDiseñoSoftware());
            model.addAttribute("DisenoLevel", estudiante.getNivelDiseñoSoftware());
        }

        return "estudiante-resultado";
    }
    
    @GetMapping("/index")
    public String estudianteIndexTemplate(Model model, HttpSession session) {
        // Obtener el usuario logeado de la sesión
        Estudiante estudiante = (Estudiante) session.getAttribute("usuarioLogeado");
        
        if (estudiante != null) {
            model.addAttribute("nombre", estudiante.getPrimerNombre());
            model.addAttribute("apellido", estudiante.getPrimerApellido());
        }

        return "index-estudiante";
    }
    
    @PostMapping("/logear")
    public String estudianteLogearTemplate(@RequestParam String usuario, @RequestParam String contrasena, Model model, HttpSession session) {
        // Buscar al estudiante por nombre de usuario en la base de datos
        Estudiante estudiante = null;
        for (Estudiante c : estudianteRepository.findAll()) {
            if (c.getUsuario().equals(usuario)) {
                estudiante = c;
                break;
            }
        }
        
        // Verificar si se encontró al estudiante y si la contraseña es correcta
        if (estudiante != null && estudiante.getContrasena().equals(contrasena)) {
            // Guardar el usuario logeado en la sesión
            session.setAttribute("usuarioLogeado", estudiante);
            return "redirect:/estudiante/index"; // Redirigir a la página de inicio
        } else {
            model.addAttribute("error", true);
            return "login-coordinador"; // Mostrar mensaje de error si las credenciales son incorrectas
        }
    }
    
    @GetMapping("/login")
    public String estudianteLoginTemplate(Model model) {
        return "login-estudiante";
    }
}
