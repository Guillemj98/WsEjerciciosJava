package es.upgrade;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.google.gson.Gson;

import es.upgrade.entidades.Ordenador;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		Ordenador o = context.getBean("ordenador", Ordenador.class);
		System.out.println(o);
		StringBuilder sb = new StringBuilder();
		
		try {
			FileReader fw = new FileReader("src/main/resources/index.json");
			BufferedReader lector = new BufferedReader(fw);
			String line = lector.readLine();
			while(line!=null) {
				sb.append(line);
				line = lector.readLine();
			}
			Gson gson = new Gson();
			String json = sb.toString();
			
			 o = gson.fromJson(json, Ordenador.class);
			System.out.println(o);
					
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
