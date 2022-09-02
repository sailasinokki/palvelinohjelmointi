package com.example.Bookstore.controller;

import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


public class BookController {
	@GetMapping("/index")
	
	public String greeting(@RequestParam(value="name") String name, @RequestParam(name="age") int age,  Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "hello";


	}
}
