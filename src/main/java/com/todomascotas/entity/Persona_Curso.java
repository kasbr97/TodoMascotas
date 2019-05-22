package com.todomascotas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Persona_Curso")
public class Persona_Curso {
	@ManyToOne
	@JoinColumn(name="CPersona")
	private Persona persona;
	
	@ManyToOne
	@JoinColumn(name="CCurso")
	private Curso curso;
	
	@Column(name="NVez")
	private Integer vez;
}
