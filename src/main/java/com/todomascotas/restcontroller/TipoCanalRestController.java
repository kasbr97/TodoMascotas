package com.todomascotas.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todomascotas.entity.TipoCanal;
import com.todomascotas.service.TipoCanalService;

@RestController
@RequestMapping("/tipocanal")
public class TipoCanalRestController {

	@Autowired
	private TipoCanalService tipocanalservice;
	@GetMapping( produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity< List<TipoCanal> > fetchAll() {
		try {
			List<TipoCanal> tipocanal = tipocanalservice.findAll();
			return new ResponseEntity< List<TipoCanal> >(tipocanal, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity< List<TipoCanal> >(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
