package com.sebastian.bogado.campiste.reservation.rest.controller;

import com.sebastian.bogado.campiste.reservation.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/v1/reserve")
public class ReservationRestController {
	@Autowired
	private ReserveService reserveService;

	@GetMapping("/{uuid}")
	public List<Object> getReserveByUuid(@PathVariable("uuid") String uuid) {
		return Collections.emptyList();
	}
}
