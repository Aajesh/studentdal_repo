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

	@Test
	public void testfindById(){
		Student student = repo.findById(6l).get();

		System.out.println(student);
	}

	@Test
	public void testUpdateStudent(){
		Student student = repo.findById(6l).get();
		student.setFee(40d);
		repo.save(student);
		//System.out.println(student);
	}


	@Test
	public void testDeleteStudent(){
		Student student = repo.findById(11l).get();
		repo.delete(student);
		//System.out.println(student);
	}

}
