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
@Table(name = "Canal")
public class Canal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CCanal")
	private int id;
	
	@Column(name = "NCanal")
	private String nombre;
	
	@Column(name = "TDescripcion")
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name = "CTipoCanal", nullable = false)
	private TipoCanal tipo_canal;
	
	
}