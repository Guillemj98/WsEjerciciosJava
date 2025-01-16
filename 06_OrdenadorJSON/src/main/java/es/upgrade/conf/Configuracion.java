package es.upgrade.conf;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.upgrade.entidades.Periferico;
import es.upgrade.entidades.Ram;


@Configuration
public class Configuracion {
	
	@Bean
	public Ram ram1() {
		Ram ram = new Ram();
		
		return ram;
		
	}
	@Bean
	public Ram ram2() {
		Ram ram = new Ram();
		
		return ram;
	}
	
	@Bean
	public ArrayList<Ram>listaRams(Ram ram1, Ram ram2){
		ArrayList<Ram>lista = new ArrayList<Ram>();
		
		return lista;
	}
	@Bean
	public Periferico periferico1() {
		Periferico per = new Periferico();
		
		return per;
	}
	@Bean
	public Periferico periferico2() {
		Periferico per = new Periferico();
	
		return per;
	}
	@Bean
	public Periferico periferico3() {
		Periferico per = new Periferico();
		
		return per;
	}
	
	@Bean
	public ArrayList<Periferico> listaPerifericos(Periferico periferico1, Periferico periferico2, Periferico periferico3){
		ArrayList<Periferico>lista = new ArrayList<Periferico>();
		lista.add(periferico1);
		lista.add(periferico2);
		lista.add(periferico3);
		return lista;
	}

}
