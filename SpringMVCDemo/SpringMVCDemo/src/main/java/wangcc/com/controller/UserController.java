package wangcc.com.controller;

import java.util.HashMap;

import org.apache.commons.collections4.map.HashedMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import wangcc.com.util.Response;

@Controller
public class UserController {
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}
	@RequestMapping("/login")
	public Response login(String username,String password ) {
		if(username!=null&&username.equals("kobe")) {
			HashMap<String,String> map=new HashMap<>();
			map.put("err1", "错");
			map.put("err2", "错");
			return new Response(1, "",map );
		}
		else {
			return new Response(0, "系统已经向你的邮箱发送了一封邮件哦，验证后就可以登录啦~");

		}
	}
}
