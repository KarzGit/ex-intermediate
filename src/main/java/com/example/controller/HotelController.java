package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Service.HotelService;

@Controller
@RequestMapping("/hotel")
public class HotelController {
	@Autowired
	private HotelService hotelService;

	@RequestMapping("")
	public String result(Integer price, Model model) {
		model.addAttribute("hotelList", hotelService.searchByLessThanPrice(price));

		return "hotelSearch";
	}

}
