package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "estudiante")
public class Estudiante {
	@Id
	private String id;

	private String usuario;
	private String contrasena;

	private String tipoDocumento;
	private String numeroDocumento;
	private String primerApellido;
	private String segundoApellido;
	private String primerNombre;
	private String segundoNombre;
	private String correoElectronico;
	private String numeroTelefonico;
	private String numeroRegistro;

	private int puntaje;
	private String nivelSaberPro;
	private int comunicacionEscrita;
	private String nivelComunicacionEscrita;
	private int razonamientoCuantitativo;
	private String nivelRazonamientoCuantitativo;
	private int lecturaCritica;
	private String nivelLecturaCritica;
	private int competenciasCiudadanas;
	private String nivelCompetenciasCiudadanas;
	private int ingles;
	private String nivelIngles;
	private String nivelDeIngles;
	private int formulacionProyectosIngenieria;
	private String nivelFormulacionProyectosIngenieria;
	private int pensamientoCientifico;
	private String nivelPensamientoCientifico;
	private int diseñoSoftware;
	private String nivelDiseñoSoftware;

	public Estudiante() {
		super();
	}

	

	public Estudiante(String id, String usuario, String contrasena, String tipoDocumento, String numeroDocumento,
			String primerApellido, String segundoApellido, String primerNombre, String segundoNombre,
			String correoElectronico, String numeroTelefonico, String numeroRegistro, int puntaje, String nivelSaberPro,
			int comunicacionEscrita, String nivelComunicacionEscrita, int razonamientoCuantitativo,
			String nivelRazonamientoCuantitativo, int lecturaCritica, String nivelLecturaCritica,
			int competenciasCiudadanas, String nivelCompetenciasCiudadanas, int ingles, String nivelIngles,
			String nivelDeIngles, int formulacionProyectosIngenieria, String nivelFormulacionProyectosIngenieria,
			int pensamientoCientifico, String nivelPensamientoCientifico, int diseñoSoftware,
			String nivelDiseñoSoftware) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.correoElectronico = correoElectronico;
		this.numeroTelefonico = numeroTelefonico;
		this.numeroRegistro = numeroRegistro;
		this.puntaje = puntaje;
		this.nivelSaberPro = nivelSaberPro;
		this.comunicacionEscrita = comunicacionEscrita;
		this.nivelComunicacionEscrita = nivelComunicacionEscrita;
		this.razonamientoCuantitativo = razonamientoCuantitativo;
		this.nivelRazonamientoCuantitativo = nivelRazonamientoCuantitativo;
		this.lecturaCritica = lecturaCritica;
		this.nivelLecturaCritica = nivelLecturaCritica;
		this.competenciasCiudadanas = competenciasCiudadanas;
		this.nivelCompetenciasCiudadanas = nivelCompetenciasCiudadanas;
		this.ingles = ingles;
		this.nivelIngles = nivelIngles;
		this.nivelDeIngles = nivelDeIngles;
		this.formulacionProyectosIngenieria = formulacionProyectosIngenieria;
		this.nivelFormulacionProyectosIngenieria = nivelFormulacionProyectosIngenieria;
		this.pensamientoCientifico = pensamientoCientifico;
		this.nivelPensamientoCientifico = nivelPensamientoCientifico;
		this.diseñoSoftware = diseñoSoftware;
		this.nivelDiseñoSoftware = nivelDiseñoSoftware;
	}



	public String getNivelDeIngles() {
		return nivelDeIngles;
	}



	public void setNivelDeIngles(String nivelDeIngles) {
		this.nivelDeIngles = nivelDeIngles;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public String getNivelSaberPro() {
		return nivelSaberPro;
	}

	public void setNivelSaberPro(String nivelSaberPro) {
		this.nivelSaberPro = nivelSaberPro;
	}

	public int getComunicacionEscrita() {
		return comunicacionEscrita;
	}

	public void setComunicacionEscrita(int comunicacionEscrita) {
		this.comunicacionEscrita = comunicacionEscrita;
	}

	public String getNivelComunicacionEscrita() {
		return nivelComunicacionEscrita;
	}

	public void setNivelComunicacionEscrita(String nivelComunicacionEscrita) {
		this.nivelComunicacionEscrita = nivelComunicacionEscrita;
	}

	public int getRazonamientoCuantitativo() {
		return razonamientoCuantitativo;
	}

	public void setRazonamientoCuantitativo(int razonamientoCuantitativo) {
		this.razonamientoCuantitativo = razonamientoCuantitativo;
	}

	public String getNivelRazonamientoCuantitativo() {
		return nivelRazonamientoCuantitativo;
	}

	public void setNivelRazonamientoCuantitativo(String nivelRazonamientoCuantitativo) {
		this.nivelRazonamientoCuantitativo = nivelRazonamientoCuantitativo;
	}

	public int getLecturaCritica() {
		return lecturaCritica;
	}

	public void setLecturaCritica(int lecturaCritica) {
		this.lecturaCritica = lecturaCritica;
	}

	public String getNivelLecturaCritica() {
		return nivelLecturaCritica;
	}

	public void setNivelLecturaCritica(String nivelLecturaCritica) {
		this.nivelLecturaCritica = nivelLecturaCritica;
	}

	public int getCompetenciasCiudadanas() {
		return competenciasCiudadanas;
	}

	public void setCompetenciasCiudadanas(int competenciasCiudadanas) {
		this.competenciasCiudadanas = competenciasCiudadanas;
	}

	public String getNivelCompetenciasCiudadanas() {
		return nivelCompetenciasCiudadanas;
	}

	public void setNivelCompetenciasCiudadanas(String nivelCompetenciasCiudadanas) {
		this.nivelCompetenciasCiudadanas = nivelCompetenciasCiudadanas;
	}

	public int getIngles() {
		return ingles;
	}

	public void setIngles(int ingles) {
		this.ingles = ingles;
	}

	public String getNivelIngles() {
		return nivelIngles;
	}

	public void setNivelIngles(String nivelIngles) {
		this.nivelIngles = nivelIngles;
	}

	public int getFormulacionProyectosIngenieria() {
		return formulacionProyectosIngenieria;
	}

	public void setFormulacionProyectosIngenieria(int formulacionProyectosIngenieria) {
		this.formulacionProyectosIngenieria = formulacionProyectosIngenieria;
	}

	public String getNivelFormulacionProyectosIngenieria() {
		return nivelFormulacionProyectosIngenieria;
	}

	public void setNivelFormulacionProyectosIngenieria(String nivelFormulacionProyectosIngenieria) {
		this.nivelFormulacionProyectosIngenieria = nivelFormulacionProyectosIngenieria;
	}

	public int getPensamientoCientifico() {
		return pensamientoCientifico;
	}

	public void setPensamientoCientifico(int pensamientoCientifico) {
		this.pensamientoCientifico = pensamientoCientifico;
	}

	public String getNivelPensamientoCientifico() {
		return nivelPensamientoCientifico;
	}

	public void setNivelPensamientoCientifico(String nivelPensamientoCientifico) {
		this.nivelPensamientoCientifico = nivelPensamientoCientifico;
	}

	public int getDiseñoSoftware() {
		return diseñoSoftware;
	}

	public void setDiseñoSoftware(int diseñoSoftware) {
		this.diseñoSoftware = diseñoSoftware;
	}

	public String getNivelDiseñoSoftware() {
		return nivelDiseñoSoftware;
	}

	public void setNivelDiseñoSoftware(String nivelDiseñoSoftware) {
		this.nivelDiseñoSoftware = nivelDiseñoSoftware;
	}

}
