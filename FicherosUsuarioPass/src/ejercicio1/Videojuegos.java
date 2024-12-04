package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Videojuegos {

	public static void main(String[] args) {
		File file = new File("usuarioSinGoku.txt");
		if (file.exists()) {
			System.out.println("El fichero existe");
		} else {
			System.out.println("El fichero no existe creando....");
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try (BufferedReader br = new BufferedReader(new FileReader("usuarioPass.txt"))) {

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));) {

				String linea = br.readLine();

				while (linea != null) {

					String[] lineas = linea.split("/");
					String nombre = lineas[0];
					

					if (!nombre.equals("Goku")) {
						bw.write(linea);	
						bw.newLine();
					}
					
					linea = br.readLine();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
