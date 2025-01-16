package es.upgrade.entidades;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class FuenteAlimentacion {
	private String marca;
	private String modelo;
	private int potencia;

}
