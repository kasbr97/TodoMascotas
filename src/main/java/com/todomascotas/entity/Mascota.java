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
@Table(name="Mascota")
public class Mascota {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CMascota")
	private Integer id;
	
	@Column(name="NMascota",length=50,nullable=false)
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="CRaza")
	private Raza raza;
	
	@ManyToOne
	@JoinColumn(name="CDueño")
	private Persona dueño;
	
	@Column(name="TDescripcion",length=100,nullable=false)
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name="CTipo_Mascota")
	private Tipo_Mascota tipo_mascota;
}
