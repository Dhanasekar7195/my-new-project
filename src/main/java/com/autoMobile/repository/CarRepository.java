package com.autoMobile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autoMobile.entity.Car;

public interface CarRepository extends JpaRepository<Car,Integer> {

}
