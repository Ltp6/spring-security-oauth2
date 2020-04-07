package com.ltp;

import com.ltp.service.TbPermissionService;
import com.ltp.service.TbUserService;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class SpringSecurityOauth2ServerApplicationTests {
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@Autowired
	private TbUserService tbUserService;

	@Autowired
	private TbPermissionService tbPermissionService;

	@Test
	void contextLoads() {
		System.out.println(passwordEncoder.encode("123456"));
	}
	@Test
	void getUser(){
		System.out.println(tbUserService.getUserByUserName("admin"));
	}
	@Test
	void getPermission(){
		System.out.println(tbPermissionService.queryPermissionByUserId(37L));
	}
}
