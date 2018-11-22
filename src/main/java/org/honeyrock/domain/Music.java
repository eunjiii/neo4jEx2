package org.honeyrock.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Music {

	@GraphId
	private Long id;
	private String title;
	private String genre;
	
	public Music() {
		
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}
	
	
	
}
