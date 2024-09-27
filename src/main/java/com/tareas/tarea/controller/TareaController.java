package com.tareas.tarea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tareas.tarea.model.Persona;
import com.tareas.tarea.model.Tarea;
import com.tareas.tarea.service.PersonaService;
import com.tareas.tarea.service.TareaService;

@CrossOrigin
@RestController
public class TareaController {

	@Autowired
	TareaService tareaService;
	
	@Autowired
	PersonaService personaService;
	
	@GetMapping("/tareas")
	public List<Tarea> getAllTarea(){
		return tareaService.getAllTareas();
	}
	
	@PostMapping("/tareas")
	public List<Tarea> saveTarea(@RequestBody Tarea tarea){
		return tareaService.saveTarea(tarea);
	}
	
	@PostMapping("/personas")
	public List<Persona> savePersona(@RequestBody Persona persona){
		return personaService.savePersona(persona);
	}
	
	@GetMapping("/personas")
	public List<Persona> getAllPersonas(){
		return personaService.getAllPersona();
	}
	
	@GetMapping("/Tareas/{idtarea}")
	private Tarea getBooks(@PathVariable("idTarea") int idTarea) 
	{
	return tareaService.getTareaById(idTarea);
	}
	
	
}
