package com.autoMobile.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.autoMobile.entity.Car;
import com.autoMobile.repository.CarRepository;
@Repository
public class CarDao {
	@Autowired
	CarRepository cr;

	public String setObj(Car c) {
		cr.save(c);
		return "saved";
	}

	public String setAllObj(List<Car> c) {
		cr.saveAll(c);
		return "saved successfully";
	}

	public List<Car> getAllObj() {
		return cr.findAll();
	}

	public Car getById(int a) {
		return cr.findById(a).get();
	}



}
