package com.tripsner.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tripsner.model.Trip;

public interface TripRepository extends JpaRepository<Trip, Integer> {

}
