package com.example.springboot_jpa;

import com.example.springboot_jpa.sequence.service.SequenceService;
import com.example.springboot_jpa.user.entity.User;
import com.example.springboot_jpa.user.repository.UserRepository;
import com.example.springboot_jpa.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@RunWith(SpringRunner.class)
@EnableTransactionManagement
@SpringBootTest
public class SpringbootJpaApplicationTests {
    @Autowired
	private UserService userService;
	@Autowired
	private SequenceService sequenceService;
	@Test
	public void contextLoads() {
//		User user = new User();
//		user.setName("tom");
//		user.setMount(99);
//		userService.save(user);
//
//		User user2 = new User();
//		user2.setName("jack");
//		user2.setMount(101);
//		userService.save(user2);
//		int line = userService.updateUser(200d,1);
		System.out.println("##################line:"+sequenceService.getSeqId());
	}

}
