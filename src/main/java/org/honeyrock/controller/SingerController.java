package org.honeyrock.controller;

import java.util.Collection;

import org.honeyrock.domain.Singer;
import org.honeyrock.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/neo4j")
public class SingerController {

	@Autowired
	SingerService singerService;
	
	@GetMapping
	public Collection<Singer> getAll(){
		
		return singerService.getAll();
		
	}
	
}
