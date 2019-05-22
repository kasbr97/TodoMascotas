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
@Table(name = "Evento")
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CEvento")
	private int id;
	
	@Column(name = "NEvento")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="CUsuario_Creador", nullable = false)
	private Usuario usuario;
	
	@Column(name="TResenia")
	private String resenia;
	
	@ManyToOne
	@JoinColumn(name="CEstablecimiento", nullable = false)
	private Establecimiento establecimiento;
	
	
	
}
