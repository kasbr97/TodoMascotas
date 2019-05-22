package com.todomascotas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tipo_Canal")
public class TipoCanal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CTipoCanal")
	private int id;
	
	@Column(name = "NTipoCanal")
	private String nombre;
	
	
	
	
}