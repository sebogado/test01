package com.sebastian.bogado.campiste.reservation.service;

import com.sebastian.bogado.campiste.reservation.dao.ReserveDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReserveDayServiceImpl implements ReserveService {
	@Autowired
	private ReserveDao reserveDao;
}
