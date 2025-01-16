package es.upgrade.entidades;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class TarjetaGrafica {
	private String marca;
	private String modelo;
	private int cudas;

}
