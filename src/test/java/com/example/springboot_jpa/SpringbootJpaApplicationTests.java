package com.example.springboot_jpa;

import com.example.springboot_jpa.sequence.service.SequenceService;
import com.example.springboot_jpa.user.entity.Student;
import com.example.springboot_jpa.user.entity.User;
import com.example.springboot_jpa.user.repository.StudentRepository;
import com.example.springboot_jpa.user.repository.UserRepository;
import com.example.springboot_jpa.user.service.StudentService;
import com.example.springboot_jpa.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@EnableTransactionManagement
@SpringBootTest
public class SpringbootJpaApplicationTests {
	@Autowired
	private StudentRepository studentRepository;
	@Test
	public void contextLoads() {
		Student s = studentRepository.findOne(1L);
		studentRepository.updateNameById("helloabc",1L,0L);



	}

}
