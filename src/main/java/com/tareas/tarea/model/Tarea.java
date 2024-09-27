package com.tareas.tarea.model;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tarea")
public class Tarea {
	
	@Id
	@Column
	private int idTarea;
	
	@Column
	private String nombreTarea;
	
	@Column
	private ArrayList<String> personas;

	public String getNombreTarea() {
		return nombreTarea;
	}

	public void setNombreTarea(String nombreTarea) {
		this.nombreTarea = nombreTarea;
	}

	public int getIdtarea() {
		return idTarea;
	}

	public void setIdtarea(int idtarea) {
		this.idTarea = idtarea;
	}

	public ArrayList<String> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<String> personas) {
		this.personas = personas;
	}

	

	
	
}
