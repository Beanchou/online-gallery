package com.artgallery.onlineartgallery.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_obra")
@Setter
@Getter
@ToString
public class Obra {
	
	@Id
	private int id;
	
	private String nombre;
	
	private String estilo;
	
	private int precio;

	
}
