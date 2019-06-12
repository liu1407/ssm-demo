package com.demo.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entity.User;

/**
 * Created by wwwwei on 17/3/18.
 */
@Controller
@RequestMapping("/userLogin")
public class UserController {
	@RequestMapping("/userLoginGet")
	@ResponseBody
	public User getUserMsg(User user){
		if(user.getPassWorld().equals("1111") && user.getUserName().equals("AAAA")){
			return user;
		}else{
			user.setUserName("2222");
			user.setPassWorld("BBBB");
			return user;
		}
		
	}
}
