package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Repository.TeamRepository;
import com.example.domain.Team;

@Service
@Transactional
public class TeamService {
	@Autowired
	private TeamRepository teamRepository;

	public List<Team> showList() {
		return teamRepository.findAll();
	}

	public Team showDetail(Integer id) {
		return teamRepository.load(id);
	}

}
