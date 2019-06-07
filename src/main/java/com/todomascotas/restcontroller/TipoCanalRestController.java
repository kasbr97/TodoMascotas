package com.todomascotas.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todomascotas.service.TipoCanalService;

@RestController
@RequestMapping("/tipocanal")
public class TipoCanalRestController {

	@Autowired
	private TipoCanalService tipocanalservice;
	
	
}
