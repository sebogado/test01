package com.sebastian.bogado.campiste.reservation.repository;

import com.sebastian.bogado.campiste.reservation.model.Reserve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReserveRepository extends JpaRepository<Reserve, Long> {
}
