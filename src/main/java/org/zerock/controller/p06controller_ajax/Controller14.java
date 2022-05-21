package org.zerock.controller.p06controller_ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cont14")
public class Controller14 {
	
	@RequestMapping("/met01")
	@ResponseBody
	public String method01(@RequestParam("name") String name){
		System.out.println(name);
		return "hello";
	}
	
	@RequestMapping("/met03")
	@ResponseBody
	public String method03(String name, String city){
		System.out.println(name);
		System.out.println(city);
		return "hello";
	}
	
	@RequestMapping("/met04")
	@ResponseBody
	public String method04(String data1){
		System.out.println(data1);
		return "hello";
	}

}
