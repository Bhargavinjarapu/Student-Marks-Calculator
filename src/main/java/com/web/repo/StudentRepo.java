package com.web.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Student;
@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

}
