package com.tareas.tarea.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tareas.tarea.model.Tarea;
import com.tareas.tarea.repository.TareaRepository;

@Service
public class TareaService {
	
	@Autowired
	TareaRepository tareaRepository;
	
	public List<Tarea> getAllTareas(){
		List<Tarea> tareas = new ArrayList<Tarea>();
		tareaRepository.findAll().forEach(t-> tareas.add(t));
		return tareas;
	}
	
	public List<Tarea> saveTarea(Tarea tarea){
		tareaRepository.save(tarea);
		return getAllTareas();
	}
	
	public Tarea getTareaById(int id) 
	{
	return tareaRepository.findById(id).get();
	}
	

}
