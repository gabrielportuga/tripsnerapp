package com.tripsner.service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

//USing BDD Mockito 
import static org.mockito.BDDMockito.verify;
import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.tripsner.model.Trip;
import com.tripsner.repository.TripRepository;

@ExtendWith(MockitoExtension.class)

class TripServiceTest {
    @Mock
    private TripRepository tripRepo;

    @InjectMocks
    private TripService tripService;

    @Test
    void getAllTrip() {
        // given
        Trip trip = new Trip(1, 1, 1, "Frist Title", "First Note", Date.valueOf(LocalDate.now()),
                Date.valueOf(LocalDate.now()));
        Trip trip2 = new Trip(2, 2, 2, "Second Title", "Second Note", Date.valueOf(LocalDate.now()),
                Date.valueOf(LocalDate.now()));
        // When
        given(tripRepo.findAll())
                .willReturn(List.of(trip, trip2));
        var tripList = tripService.getAllTrips();
        // Then
        assertThat(tripList).isNotNull().hasSize(2);
    }
}
