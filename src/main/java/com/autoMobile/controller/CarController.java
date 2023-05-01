package com.autoMobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.autoMobile.entity.Car;
import com.autoMobile.service.CarService;

@RestController
@RequestMapping(value="/car")
public class CarController {
	@Autowired
	CarService cs;
	@PostMapping(value="/setObj")
	public String setObj(@RequestBody Car c) {
		return cs.setObj(c);
		}
	@PostMapping(value="/setAllObj")
	public String setAllObj(@RequestBody List<Car> c) {
	    return cs.setAllObj(c);
	}
	@GetMapping(value="/getAllObj")
	public List<Car> getAllObj() {
		return cs.getAllObj();
	}
	@GetMapping(value="/getById/{a}")
	public Car getById(@PathVariable int a) {
		return cs.getById(a);
	}
	@GetMapping(value="/getMaxObj")
	public Car getMaxObj() {
		return cs.getMaxObj();
	}
	@GetMapping(value="/getMinObj")
	public Car getMinObj() {
		return cs.getMinObj();
	}
	}


