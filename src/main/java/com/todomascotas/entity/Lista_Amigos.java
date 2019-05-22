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
@Table(name="Lista_Amigos")
public class Lista_Amigos {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CLista")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="CPersona1")
	private Persona persona1;
	
	@ManyToOne
	@JoinColumn(name="CPersona2")
	private Persona persona2;
}
