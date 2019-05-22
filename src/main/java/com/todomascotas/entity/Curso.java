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
@Table(name = "Curso")
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CCurso")
	private int id;
	
	@Column(name = "NCurso")
	private String nombre;
	
	@Column(name="TDescripcion")
	private String descripcion;
	
	@Column(name="NVacantes")
	private int vacantes;
	
	@ManyToOne
	@JoinColumn(name="CNivel")
	private Nivel nivel;
	
	@ManyToOne
	@JoinColumn(name="CEstablecimiento")
	private Establecimiento establecimiento;
	
}