package com.tareas.tarea.repository;

import org.springframework.data.repository.CrudRepository;

import com.tareas.tarea.model.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {

}
