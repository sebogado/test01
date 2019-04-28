package com.sebastian.bogado.campiste.reservation.dao;

import com.sebastian.bogado.campiste.reservation.repository.ReserveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReserveDao {
	@Autowired
	private ReserveRepository reserveRepository;
}
