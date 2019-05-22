package com.todomascotas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tipo_Mascota")
public class Tipo_Mascota {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CTipo_Mascota")
	private Integer id;
	
	@Column(name="NTipo_Mascota",length=50,nullable=false)
	private String nombre;
}
