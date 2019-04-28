package com.sebastian.bogado.campiste.reservation.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class Reserve {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Column(unique = true)
	private String uuid;
	@NotNull
	private String email;
	@NotNull
	private LocalDate reserveDate;
	@NotNull
	@Min(1)
	@Max(3)
	private Integer days;
	@NotNull
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

}
