package org.zerock.controller.p06controller_ajax;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cont17")
public class Controller17 {
	
	@RequestMapping("/met02/{id}")
	public String method02(@PathVariable("id") Integer id){
		System.out.println("id");
		return "hello";
	}

}
