package org.honeyrock.domain;

import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Singer {

	private Long id;
	private String name;
	private String age;

	@Relationship(type="SING",direction=Relationship.INCOMING)
	private List<Music> musics;
	
	public List<Music> getNusics(){
		
		return musics;
	}
	
	public Singer() {
		
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}
	
}
