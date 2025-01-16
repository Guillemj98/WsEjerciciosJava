package es.upgrade.entidades;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class PlacaBase {
	private String modelo;
	private String marca;
	private int slotsRam;

}
