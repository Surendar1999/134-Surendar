package com.java.Technology.repository;

import org.springframework.stereotype.Repository;

import com.java.Technology.entity.TechEntity;

@Repository
public interface TechRepo {

	TechEntity getTechnologyById(long id);

}
