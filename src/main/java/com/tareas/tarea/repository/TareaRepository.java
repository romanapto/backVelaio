package com.tareas.tarea.repository;

import org.springframework.data.repository.CrudRepository;

import com.tareas.tarea.model.Tarea;

public interface TareaRepository extends CrudRepository<Tarea, Integer> {

}
