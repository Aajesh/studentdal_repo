package com.aajesh.student.dal.repo;

import com.aajesh.student.dal.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {

}
