package sena.springbootapp.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public record User(
		Integer id,
		String name,
		String lastName,
		LocalDate birthDay,
		BigDecimal salary,
		boolean active
		) {}
