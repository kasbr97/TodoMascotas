package com.todomascotas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Nivel")
public class Nivel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CNivel")
	private int id;
	
	@Column(name = "NNivel")
	private String nombre;
	
	@Column(name = "TDescripcion")
	private String descripcion;
	
	
	
}