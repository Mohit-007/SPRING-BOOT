package com.spring.boot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.spring.boot.app.Alien;

public interface AlienDao extends CrudRepository<Alien, Integer>
{
	List<Alien> findByTech(String tech);
	List<Alien> findByAidGreaterThan(int aid);
	
	@Query("from Alien  where tech=?1 order by aname")
	List<Alien> findByTechSorted(String tech);
}
