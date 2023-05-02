package com.ourtour.main;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class StartController {
	@RequestMapping("/main.do")
	public String main() {
		return "main/main";
	}
}
