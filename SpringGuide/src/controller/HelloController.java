package controller;

import java.util.List;

import model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.UserDao;

@Controller
public class HelloController {
	@Autowired
	private UserDao dao;
	@RequestMapping("/hello")
	public String hello() {
		List<User> users = dao.getList();
		for(User user: users){
			System.out.println(user.getId());
		}
		System.out.println("hello");
		return "hello....";
	}
}
