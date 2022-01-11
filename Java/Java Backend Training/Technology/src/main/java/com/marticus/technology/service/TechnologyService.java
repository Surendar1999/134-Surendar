package com.marticus.technology.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.marticus.technology.entity.TechnologyEntity;
import com.marticus.technology.repository.TechnologyRepo;


@Service
public class TechnologyService {

	@Autowired
	TechnologyRepo technologyRepo;
	
	
	public void saveTechnology(TechnologyEntity technologyEntity) {
		// TODO Auto-generated method stub
		technologyRepo.save(technologyEntity);
	}
		
	
	public TechnologyEntity findTechnologyById(int id)
	{
		return technologyRepo.findTechnologyById(id);
		
	}


	


	
}