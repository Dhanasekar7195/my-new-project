package com.autoMobile.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autoMobile.dao.BikeDao;
import com.autoMobile.entity.Bike;



@Service
public class BikeService {
	@Autowired
	BikeDao bd;

	public String setObj(Bike b) {
		return bd.setObj(b);
	}
	public String setAllObj(List<Bike> b) {
		return bd.setAllObj(b);
	}
	public List<Bike> getAllObj() {
		return bd.getAllObj();
	}
	public Bike getById(int b) {
		return bd.getById(b);
	}
	public Bike getMaxObj() {
		List<Bike>x = getAllObj();
		Bike y = x.stream().max(Comparator.comparing(Bike::getPrice)).get();
				return y;
	}
	public Bike getMiniObj() {
		List<Bike>x = getAllObj();
		Bike y = x.stream().min(Comparator.comparing(Bike::getPrice)).get();
		return y;
	}
	
	
	public List<Bike> getByBrand(String b) {
		return bd.getByBrand(b);
	}
	public List<Bike> getByRange(int c, int d) {
		return bd.getByRange(c,d);
	}
	public List<String> getBrands() {
		return bd.getBrands();
	}
	public Bike getMaxiObj() {
		return bd.getMaxiObj();
	}
	
		
	}


