package com.todomascotas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Raza")
public class Raza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CRaza")
	private int id;
	
	@Column(name = "NRaza",length=50,nullable=false)
	private String nombre;
	
	@Column(name="TCaracteristica",length=100,nullable=false)
	private String caracteristica;
	
}
