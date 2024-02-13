package com.tripsner.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tripsner.model.Trip;
import com.tripsner.repository.TripRepository;

@Service
public class TripService {

    private final TripRepository tripRepository;

    TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public List<Trip> getAllTrips() {
        return tripRepository.findAll();
    }

    public Trip getTripById(int id) {
        return tripRepository.findById(id).orElse(null);
    }

    public Trip createTrip(Trip trip) {
        return tripRepository.save(trip);
    }

    public Trip updateTrip(int id, Trip trip) {
        if (tripRepository.existsById(id)) {
            trip.setId(id);
            return tripRepository.save(trip);
        }
        return null;
    }

    public void deleteTrip(int id) {
        tripRepository.deleteById(id);
    }
}
