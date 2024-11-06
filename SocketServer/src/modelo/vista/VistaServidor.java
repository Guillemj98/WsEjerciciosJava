package modelo.vista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import modelo.gestor.GestorServidor;

public class VistaServidor {
	public static final int PUERTO = 2077;
	
	public static void main(String[] args) {
		InputStreamReader entrada = null;
		PrintStream salida = null;
		Socket socketAlCliente = null;
		GestorServidor gestorServidor = new GestorServidor();
		InetSocketAddress direccion = new InetSocketAddress(PUERTO);
		System.out.println("╔════════════════════════════════╗");
	    System.out.println("║       Aplicación Servidor      ║");
	    System.out.println("╚════════════════════════════════╝");
	    try(ServerSocket serverSocket = new ServerSocket()){
	    	serverSocket.bind(direccion);
	    	
	    	while(true) {
	    		System.out.println("SERVIDOR: Esperando peticion por el puerto: " + PUERTO);
	    		socketAlCliente = serverSocket.accept();
	    		System.out.println("SERVIDOR: Petición recibida");
	    		
	    		entrada = new InputStreamReader(socketAlCliente.getInputStream());
				BufferedReader bf = new BufferedReader(entrada);
				
				String stringRecibido = bf.readLine();// operacion_num1_num2
				
				salida = new PrintStream(socketAlCliente.getOutputStream());
				salida.println(gestorServidor.realizarOperacion(stringRecibido));
				
				
	    	}
	    	
	    	
	    	
	    	
	    	
	    	
	    } catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("SERVIDOR: Error -> " + e);
			e.printStackTrace();
		}
	
	
	
	}

}
