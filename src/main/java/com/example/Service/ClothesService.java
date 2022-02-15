package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Repository.ClothesRepository;
import com.example.domain.Clothes;

@Service
@Transactional
public class ClothesService {
	
	@Autowired
	private ClothesRepository clothesRepository;
	
	public List<Clothes> searchByColorAndGender(String color, Integer gender){
		return clothesRepository.searchByColorAndGender(color, gender);
	}

}
