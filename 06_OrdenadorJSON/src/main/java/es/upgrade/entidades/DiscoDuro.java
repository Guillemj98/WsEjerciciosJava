package es.upgrade.entidades;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class DiscoDuro {
	private String marca;
	private String tipo;
	private int capacidad;

}
