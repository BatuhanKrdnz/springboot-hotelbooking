package com.batuhankaradeniz.hotelbooking.repository;

import com.batuhankaradeniz.hotelbooking.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    Reservation findById(int resId);
    Collection<Reservation> findAllByUserId(int userId);
}
