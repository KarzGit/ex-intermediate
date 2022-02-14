package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Service.TeamService;

@Controller
@RequestMapping("/team")
public class TeamController {
	@Autowired
	private TeamService teamService;

	@RequestMapping("/showList")
	public String showList(Model model) {
		model.addAttribute("TeamList", teamService.showList());
		return "teamList";
	}

	@RequestMapping("/showDetail")
	public String showDetail(String id, Model model) {
		model.addAttribute("team", teamService.showDetail(Integer.parseInt(id)));
		return "teamDetail";
	}

}
