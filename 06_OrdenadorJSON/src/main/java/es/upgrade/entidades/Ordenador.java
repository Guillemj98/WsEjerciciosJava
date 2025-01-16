package es.upgrade.entidades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Scope("prototype")
public class Ordenador {
	private String nombre;
	private double precio;
	@Autowired
	private Procesador procesador;
	@Autowired
	private PlacaBase placa_base;
	@Autowired
	private List <Ram> listaRam;
	@Autowired
	private DiscoDuro disco_duro;
	@Autowired
	private FuenteAlimentacion fuente_alimentacion;
	@Autowired
	private TarjetaGrafica tarjeta_grafica;
	@Autowired
	private List<Periferico> listaPerifericos;
	

}
