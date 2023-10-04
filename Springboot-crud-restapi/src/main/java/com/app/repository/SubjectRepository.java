package com.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject,String> {
	

}