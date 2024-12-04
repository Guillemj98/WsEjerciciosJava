package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UserPassV2 {

	public static void main(String[] args) throws IOException  {
		File file = new File("usuarioPass.txt");
		if(file.exists()) {
			System.out.println("El fichero existe");
		}else {
			System.out.println("El fichero no existe creando....");
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(fw);
		br.write("Goku/1234");
		br.newLine();
		br.write("Begeta/4321");
		br.newLine();
		br.write("Picolo/1111");
		br.newLine();
		
		br.close();
		fw.close();
		FileReader fr = new FileReader(file);
		BufferedReader brw = new BufferedReader(fr);
		String nombre ="";
		String password ="";
		
		 String[]separado = null;
		 String linea = brw.readLine();
		 while(linea != null) {
			 separado = linea.split("/"); 
			 if(separado.length ==2) {
				  nombre = separado[0];
				  password = separado[1]; 
			 }
			 
			 	if(nombre.equalsIgnoreCase("Goku") && password.equals("1234")) {
			 		System.out.println("Bienvenute");
			 	}
			
			 linea = brw.readLine();
			
		 }
		
		
		
		
		
		
	

	}

}
