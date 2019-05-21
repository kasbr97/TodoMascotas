package com.todomascotas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CUsuario")
	private int id;
	
	@Column(name = "NUsuario")
	private String nombre;
	
	@Column(name="CContrasenia")
	private String contrasenia;
	
	@Column(name="NumTelefono")
	private String telefono;
	
	@Column(name="Email")
	private String email;
	
	
	
}
