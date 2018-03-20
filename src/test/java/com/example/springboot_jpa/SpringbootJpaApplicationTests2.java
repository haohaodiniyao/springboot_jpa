package com.example.springboot_jpa;

import com.example.springboot_jpa.user.repository.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@RunWith(SpringRunner.class)
@EnableTransactionManagement
@SpringBootTest
public class SpringbootJpaApplicationTests2 {
	@Autowired
	private StudentRepository studentRepository;
	@Test
	public void contextLoads() {


	}

}
