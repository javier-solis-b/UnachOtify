package com.example.demo.rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Artista;
import com.example.demo.service.ArtistaService;

@RestController
@RequestMapping ("/api/artista/")
public class ArtistaRest {
	@Autowired
	private ArtistaService artistaService;
	
	@PostMapping
	private ResponseEntity<Artista> guardar (@RequestBody Artista artista){
		Artista temporal = artistaService.create(artista);
		
		try {
			return ResponseEntity.created(new URI("/api/artista"+temporal.getId())).body(temporal);
			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	@GetMapping
	private ResponseEntity<List<Artista>> listarTodosLosArtistas (){
		return ResponseEntity.ok(artistaService.getAllArtistas());
	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarArtista (@RequestBody Artista artista){
		artistaService.delete(artista);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping (value = "{id}")
	private ResponseEntity<Optional<Artista>> listarArtistasPorID (@PathVariable ("id") Long id){
		return ResponseEntity.ok(artistaService.findById(id));
	}

}
