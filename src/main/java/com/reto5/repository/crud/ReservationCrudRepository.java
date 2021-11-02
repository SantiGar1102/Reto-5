package com.reto5.repository.crud;

// importaciones

import com.reto5.modelo.Reservation;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Santiago Garcia
 */
public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}