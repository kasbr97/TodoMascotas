package com.todomascotas.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "UsuariosCanal")
public class UsuariosCanal {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "CUsuario")
	private Usuario usuario;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "CCanal")
	private Canal canal;	
	
	
}