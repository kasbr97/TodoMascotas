package com.todomascotas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Distrito")
public class Distrito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CDistrito")
	private int id;
	
	@Column(name = "NDistrito")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "CCiudad", nullable = false)
	private Ciudad ciudad;
	
	
}