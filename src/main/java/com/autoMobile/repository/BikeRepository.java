
package com.autoMobile.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.autoMobile.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike,Integer> {

	@Query(value = "select * from bike_details where brand like ?", nativeQuery = true)
	List<Bike> getByName(String b);

	@Query(value = "select * from bike_details where price> ? and price< ?", nativeQuery = true)
	List<Bike> getByRange(int c, int d);

	@Query(value = "select brand from bike_details", nativeQuery = true)
	List<String> getBrands();

	@Query(value = "select * from bike_details where price = (select max(price) from bike_details)", nativeQuery = true)
	Bike getMaxiObj();

}

