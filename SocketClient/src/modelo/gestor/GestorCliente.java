package modelo.gestor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class GestorCliente {
	
	private static final String IP_SERVER = "localhost";
	private static final int PUERTO = 2077;

	public String enviarOperacionNumero(String operacion, String num1, String num2) {
		String resultado = null;
		InetSocketAddress direccionServidor = new InetSocketAddress(IP_SERVER, PUERTO);
		try(Socket socketAlServidor = new Socket();){
			
			System.out.println("CLIENTE: Esperando a que el servidor acepte la conexi�n");
			socketAlServidor.connect(direccionServidor);			
			System.out.println("CLIENTE: Conexion establecida... a " + IP_SERVER 
					+ " por el puerto " + PUERTO);	
			
			PrintStream salida = new PrintStream(socketAlServidor.getOutputStream());
			salida.println(operacion + "_" + num1 + "_" + num2);
			
			InputStreamReader entrada = new InputStreamReader(socketAlServidor.getInputStream());
			BufferedReader bf = new BufferedReader(entrada);
			resultado = bf.readLine();
			
		
			
		}catch (UnknownHostException e) {
			System.err.println("CLIENTE: No encuentro el servidor en la dirección" + IP_SERVER);
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("CLIENTE: Error de entrada/salida");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("CLIENTE: Error -> " + e);
			e.printStackTrace();
		}
		return resultado;
		
	}

}
