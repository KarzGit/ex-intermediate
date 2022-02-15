package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Service.ClothesService;

@Controller
@RequestMapping("/clothes")
public class ClothesController {

	@Autowired
	private ClothesService clothesService;
	
	@RequestMapping("")
	public String search(String color, Integer gender, Model model) {
		model.addAttribute("clothesList", clothesService.searchByColorAndGender(color, gender));
		return "clothesSearch";
	}

}
