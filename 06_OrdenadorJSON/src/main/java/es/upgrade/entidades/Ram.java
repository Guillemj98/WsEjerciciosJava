package es.upgrade.entidades;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Scope("prototype")
public class Ram {
	
	private String marca;
	private String tipo;
	private int capacidad;
	private int hz;
	private int cl;

}
