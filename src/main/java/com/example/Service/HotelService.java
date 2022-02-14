package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Repository.HotelRepository;
import com.example.domain.Hotel;

@Service
@Transactional
public class HotelService {
	@Autowired
	private HotelRepository hotelRepository;

	public List<Hotel> searchByLessThanPrice(Integer price) {
		return hotelRepository.searchByLessThanPrice(price);
	}

}
