package ejercicio1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class usuarioBinario {

	public static void main(String[] args) {
		
		
		File file = new File("objetos.dat");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Persona p1 = new Persona();
		
		p1.setNombre("Guillermo Magro Jaén");
		
		Videojuegos vj = new Videojuegos();
		
		
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));){
			
			os.writeObject(p1);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));){
			Persona p =(Persona) ois.readObject();
			
			System.out.println(p);
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
