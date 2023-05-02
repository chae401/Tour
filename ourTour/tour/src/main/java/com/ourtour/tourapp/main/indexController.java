package com.ourtour.tourapp.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class indexController {
	@RequestMapping("/main")
	public String index() {
		return "views/index";
	}
}

