package com.titanium.example.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.titanium.example.bean.User;

@RequestMapping(value="/index")
@RestController
public class IndexController {
	
	
	
	// @RequestParam 简单类型的绑定，可以出来get和post
	@RequestMapping(value="/get")
	public Map<String, Object> get(@RequestParam String name){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", name);
		map.put("age", 19);
		map.put("address", "上海市宝山区");
		map.put("快乐", "心电感应808");
		return map;
	}
	
	// @PathVariable 获得请求url中的动态参数
	@RequestMapping(value="/get/{id}/{name}")
	public User getUser(@PathVariable int id,@PathVariable String name){
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setDate(new Date());
		user.setAge(20);
		user.setAddress("北京");
		return user;
	}
}
