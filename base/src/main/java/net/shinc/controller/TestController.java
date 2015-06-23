package net.shinc.controller;

import net.shinc.orm.mybatis.mappers.ManageUserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Autowired
	private ManageUserMapper mapper;
	@RequestMapping("/test")
	public void test() {
		System.out.println(mapper.selectUserRole(null));
	}
}
