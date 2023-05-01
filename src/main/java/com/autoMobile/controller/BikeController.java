package com.autoMobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autoMobile.entity.Bike;
import com.autoMobile.service.BikeService;

@RestController
@RequestMapping(value="/bike")
public class BikeController {
	@Autowired
	BikeService bs;
	@PostMapping(value="/setObj")
	public String setObj(@RequestBody Bike b) {
		return bs.setObj(b);
		}
	@PostMapping(value="/setAllObj")
	public String setAllObj(@RequestBody List<Bike> b) {
		return bs.setAllObj(b);
		}
	@GetMapping(value="/getAllObj")
	public List<Bike> getAllObj() {
		return bs.getAllObj();
	}
	@GetMapping(value="/getById/{b}")
	public Bike getById(@PathVariable int b) {
		return bs.getById(b);
	}
	@GetMapping(value="/getMaxObj")
	public Bike getMaxObj() {
		return bs.getMaxObj();
	}
	@GetMapping(value="/getMiniObj")
	public Bike getMiniObj() {
		return bs.getMiniObj();
	}
	
	
	@GetMapping(value="/getByBrand/{b}")
	public List<Bike> getByBrand(@PathVariable String b) {
		return bs.getByBrand(b);
	}
	@GetMapping(value="/getByRange/{c}/{d}")
	public List<Bike> getByRange(@PathVariable int c,@PathVariable int d) {
		return bs.getByRange(c, d);
	}
	@GetMapping(value="/getBrands")
	public List<String> getBrands() {
		return bs.getBrands();
	}
	@GetMapping(value="/getMaxiObj")
	public Bike getMaxiObj() {
		return bs.getMaxiObj();
	}
	
	

}
