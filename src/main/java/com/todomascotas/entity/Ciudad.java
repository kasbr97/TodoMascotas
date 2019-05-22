package com.todomascotas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ciudad")
public class Ciudad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CCiudad")
	private int id;
	
	@Column(name = "NCiudad")
	private String nombre;
	
	
	
	
}