package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.model.Vehicle;

public interface VehicleRepository  extends JpaRepository<Vehicle, Integer> {

}
