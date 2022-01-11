package com.marticus.technology.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.marticus.technology.entity.TechnologyEntity;

public interface TechnologyRepo extends JpaRepository<TechnologyEntity, Integer> {
	
	TechnologyEntity findTechnologyById(int id);

	TechnologyEntity findTechnologyByName(String name);

}
