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
@Table(name = "Establecimiento")
public class Establecimiento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CEstablecimiento")
	private int id;
	
	@Column(name="NEstablecimiento")
	private String nombre;
	
	@Column(name = "RUC")
	private String RUC;
	
	@ManyToOne
	@JoinColumn(name="CEspecialidad",nullable = false)
	private Especialidad especialidad;
	
	@ManyToOne
	@JoinColumn(name="CDistrito",nullable = false)
	private Distrito distrito;
	
	@Column(name="NCalle")
	private String nombre_calle;
	
	@Column(name="NumCalle")
	private int numero_calle;
	
}
