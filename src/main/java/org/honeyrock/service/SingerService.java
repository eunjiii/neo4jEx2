package org.honeyrock.service;

import java.util.Collection;

import org.honeyrock.domain.Singer;
import org.honeyrock.repository.SingerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SingerService {

	@Autowired
	SingerRepository singerRepository;
	
	public Collection<Singer> getAll(){
		
		return singerRepository.getAllSinger();
		
	}
	
}
