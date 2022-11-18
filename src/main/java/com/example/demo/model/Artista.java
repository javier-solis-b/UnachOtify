package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Artistas") 
public class Artista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nombre;
	private String GeneroMusical;
	private	int edad;
	private String popularidad;
	private String FacebookURL;
	private String imagenURL;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGeneroMusical() {
		return GeneroMusical;
	}
	public void setGeneroMusical(String generoMusical) {
		GeneroMusical = generoMusical;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPopularidad() {
		return popularidad;
	}
	public void setPopularidad(String popularidad) {
		this.popularidad = popularidad;
	}
	public String getFacebookURL() {
		return FacebookURL;
	}
	public void setFacebookURL(String facebookURL) {
		FacebookURL = facebookURL;
	}
	public String getImagenURL() {
		return imagenURL;
	}
	public void setImagenURL(String imagenURL) {
		this.imagenURL = imagenURL;
	}
	public Artista(long id, String nombre, String generoMusical, int edad, String popularidad, String facebookURL,
			String imagenURL) {
		
		this.id = id;
		this.nombre = nombre;
		GeneroMusical = generoMusical;
		this.edad = edad;
		this.popularidad = popularidad;
		FacebookURL = facebookURL;
		this.imagenURL = imagenURL;
	}

}
