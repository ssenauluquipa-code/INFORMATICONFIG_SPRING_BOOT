package sena.springbootapp.model;
import java.math.BigDecimal;

public record UserPatch(
		String name,
		BigDecimal salary
		) {}
