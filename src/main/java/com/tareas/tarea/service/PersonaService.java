package com.tareas.tarea.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tareas.tarea.model.Persona;
import com.tareas.tarea.repository.PersonaRepository;

@Service
public class PersonaService {
	
	@Autowired
	PersonaRepository personaRepository;
	
	public List<Persona> getAllPersona(){
		List<Persona> personas = new ArrayList<Persona>();
		personaRepository.findAll().forEach(p->personas.add(p));
		return personas;
	}
	
	public List<Persona> savePersona(Persona persona){
		personaRepository.save(persona);
		return getAllPersona();
	}
	
	public Persona getPersonaById(int id) 
	{
	return personaRepository.findById(id).get();
	}
}
