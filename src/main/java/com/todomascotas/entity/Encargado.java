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
@Table(name = "Encargado")
public class Encargado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CEncargado")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "CEstablecimiento")
	private Establecimiento establecimiento;	
	
	
}