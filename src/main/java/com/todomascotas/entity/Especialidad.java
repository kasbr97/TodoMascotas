package com.todomascotas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Especialidad")
public class Especialidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CEspecialidad")
	private int id;
	
	@Column(name = "NEspecialidad")
	private String nombre;
	
	@Column(name = "TDescripcion")
	private String descripcion;
	
	
	
}