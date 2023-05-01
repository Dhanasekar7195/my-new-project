package com.autoMobile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autoMobile.dao.CarDao;
import com.autoMobile.entity.Car;

@Service
public class CarService {

	@Autowired
	CarDao cd;
	public String setObj(Car c) {
		return cd.setObj(c);
	}
	public String setAllObj(List<Car> c) {
		return cd.setAllObj(c);
	}
	public List<Car> getAllObj() {
		return cd.getAllObj();
	}
	public Car getById(int a) {
		return cd.getById(a);
	}
	public Car getMaxObj() {
		List<Car>x=getAllObj();
		Car y =x.get(0);
		
		for(Car z:x) {
		if(z.getPrice()>=y.getPrice()) {
			
			y=z;
		}
	}
		return y;

}
	public Car getMinObj() {
		List<Car>x = getAllObj();
		Car y = x.get(0);
		for(Car z:x) {
			if(z.getPrice()<=y.getPrice()) {
				
				y=z;
			}
		}
		return y;
			}

	}

