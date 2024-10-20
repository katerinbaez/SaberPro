package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.demo.entity.Coordinador;
import com.example.demo.entity.Estudiante;
import com.example.demo.exception.NotFoundException;
import com.example.demo.repositpry.CoordinadorRepository;
import com.example.demo.repositpry.EstudianteRepository;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "coordinador")
public class ControllerWebCoordinador {
    
    @Autowired
    private CoordinadorRepository coordinadorRepository;

    @Autowired
    private EstudianteRepository estudianteRepository;
    
    @GetMapping("/index")
    public String coordinadorIndexTemplate(Model model, HttpSession session) {
        // Obtener el usuario logeado de la sesión
    	Coordinador coordinador = (Coordinador) session.getAttribute("usuarioLogeado");
        
        // Verificar si el usuario está logeado antes de agregarlo al modelo
        if (coordinador != null) {
            model.addAttribute("usuario", coordinador.getUsuario());
            model.addAttribute("nombre", coordinador.getNombre());
        }
        
        return "index-coordinador";
    }
    
    @GetMapping("/login")
    public String coordinadorLoginTemplate(Model model) {
        return "login-coordinador";
    }
    
    @PostMapping("/logear")
    public String coordinadorLogearTemplate(@RequestParam String usuario, @RequestParam String contrasena, Model model, HttpSession session) {
        // Buscar al coordinador por nombre de usuario en la base de datos
        Coordinador coordinador = null;
        for (Coordinador c : coordinadorRepository.findAll()) {
            if (c.getUsuario().equals(usuario)) {
                coordinador = c;
                break;
            }
        }
        
        // Verificar si se encontró al coordinador y si la contraseña es correcta
        if (coordinador != null && coordinador.getContrasena().equals(contrasena)) {
            // Guardar el usuario logeado en la sesión
            session.setAttribute("usuarioLogeado", coordinador);
            // Si las credenciales son correctas, redirigir a la página de inicio
            return "redirect:/coordinador/index";
        } else {
            // Si las credenciales son incorrectas, mostrar un mensaje de error y volver al formulario de login
            model.addAttribute("error", true);
            return "login-coordinador";
        }
    }
    
    @GetMapping("/estudiante/crear")
    public String coordinadorCrearTemplate(Model model) {
		model.addAttribute("estudiante", new Estudiante());
        return "estudiante-form";
    }
	
	@GetMapping("/lista")
	public String asociacionListTemplate(Model model) {
		model.addAttribute("estudiantes", estudianteRepository.findAll());
		return "estudiante-lista";
	}

	@GetMapping("/estudiante/edit/{id}")
	public String coordinadorEditTemplate(@PathVariable("id") String id, Model model) {
		model.addAttribute("estudiante",
				estudianteRepository.findById(id).orElseThrow(() -> new NotFoundException("estudiante no encontrada")));
		return "estudiante-form";
	}

	@PostMapping("/estudiante/save")
	public String coordinadorSaveProcess(@ModelAttribute("estudiante") Estudiante estudiante) {
		if (estudiante.getId().isEmpty()) {
			estudiante.setId(null);
		}
		estudianteRepository.save(estudiante);
		return "redirect:/coordinador/index";
	}

	@GetMapping("/estudiante/delete/{id}")
	public String coordinadorDeleteProcess(@PathVariable("id") String id) {
		estudianteRepository.deleteById(id);
		return "redirect:/coordinador/lista";
	}
}
