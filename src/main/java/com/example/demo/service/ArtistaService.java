package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Artista;
import com.example.demo.repository.ArtistaRepository;

@Service
public class ArtistaService {
	@Autowired
	private ArtistaRepository artistaRepository;
	
	
	public Artista create (Artista artista) {
		return artistaRepository.save(artista);
	}
	
	public List<Artista> getAllArtistas (){
		return artistaRepository.findAll();
	}
	
	public void delete (Artista artista) {
		artistaRepository.delete(artista);
	}
	
	public Optional<Artista> findById (Long id) {
		return artistaRepository.findById(id);
	}
}
