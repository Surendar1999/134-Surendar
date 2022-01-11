package com.java.Project.repository;

import org.springframework.stereotype.Repository;

import com.java.Project.entity.ProEntity;

@Repository
public interface ProRepo {

	ProEntity findProjectById(long id);

}
