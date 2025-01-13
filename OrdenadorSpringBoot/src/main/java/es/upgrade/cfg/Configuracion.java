package es.upgrade.cfg;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.upgrade.entidad.Periferico;
import es.upgrade.entidad.RAM;

@Configuration
public class Configuracion {
	
		@Bean
		public RAM ram1 () {
			return new RAM();
		}
		@Bean
		public RAM ram2 () {
			return new RAM();
		}
		@Bean
		public RAM ram3 () {
			return new RAM();
		}
		
		@Bean
		public ArrayList<RAM>listaRams(RAM ram2, RAM ram3){
			ArrayList<RAM> lista = new ArrayList<>();
			lista.add(ram2);
			lista.add(ram3);
			return lista;
		}
		
		@Bean
		public Periferico teclado() {
			return new Periferico();
		}
		@Bean
		public Periferico raton() {
			return new Periferico();
		}
		@Bean
		public Periferico monitor() {
			return new Periferico();
		}
		@Bean
		public ArrayList<Periferico>listaPerifericos(Periferico teclado, Periferico raton, Periferico monitor){
			ArrayList<Periferico> lista = new ArrayList<>();
			lista.add(teclado);
			lista.add(raton);
			lista.add(monitor);
			return lista;
		}
		

}
