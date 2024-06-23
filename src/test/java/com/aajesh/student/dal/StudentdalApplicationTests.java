package com.aajesh.student.dal;

import com.aajesh.student.dal.model.Student;
import com.aajesh.student.dal.repo.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	StudentRepository repo;

	@Test
	void contextLoads() {
		System.out.println("inserting the data");

		Student student = new Student();
		student.setName("Aajesh");
		student.setCourse("java");
		student.setFee(55d);
		repo.save(student);
		System.out.println("inserting the data successful");

	}

}
