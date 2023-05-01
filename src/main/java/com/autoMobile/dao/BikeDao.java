package com.autoMobile.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.autoMobile.entity.Bike;
import com.autoMobile.repository.BikeRepository;

@Repository
public class BikeDao {
	@Autowired
	BikeRepository br;

	public String setObj(Bike b) {
		br.save(b);
		return "saved";
	}

	public String setAllObj(List<Bike> b) {
		br.saveAll(b);
		return "saved successfully";
	}

	public List<Bike> getAllObj() {
		return br.findAll();
	}

	public Bike getById(int b) {
		return br.findById(b).get();
	}

	
	
	public List<Bike> getByBrand(String b) {
		return br.getByName(b);
	}

	public List<Bike> getByRange(int c, int d) {
		return br.getByRange(c,d);
	}

	public List<String> getBrands() {
		return br.getBrands();
	}

	public Bike getMaxiObj() {
		return br.getMaxiObj();
	}

	
	

}
