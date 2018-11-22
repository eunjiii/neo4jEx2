package org.honeyrock.repository;

import java.util.Collection;

import org.honeyrock.domain.Singer;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface SingerRepository extends Neo4jRepository<Singer, Long> {

	@Query("MATCH (s:Singer)<-[r:SING]-(m:Music) RETURN s,r,m")
	Collection<Singer> getAllSinger();

}
