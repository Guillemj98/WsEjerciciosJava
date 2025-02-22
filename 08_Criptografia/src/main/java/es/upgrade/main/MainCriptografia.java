package es.upgrade.main;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Scanner;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class MainCriptografia {
	private String fraseEncriptada = null;
    private SecretKey paloEspartano = null;
    private byte[] byteMessageEncryption = null;
    byte[]mensajeOriginalCifrado = null;
    String mensajeCifrado = null;
    PublicKey publicKey = null;
    PrivateKey privateKey= null;
    PublicKey clavePublica = null;
    PrivateKey clavePrivada= null;
    byte[] bytesMensajeCifrado=null;

	public static void main(String[] args) {
		MainCriptografia app = new MainCriptografia();
		app.menu();

	}
	public void menu()  {
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		while(!salir) {
			System.out.println("---------MENU---------");
			System.out.println("1. Encrypt a phrase");
			System.out.println("2. Show encrypted phrase");
			System.out.println("3. Decrypt phrase");
			System.out.println("4. We will encrypt a phrase with the objective of confidentiality");
			System.out.println("5. We will encrypt a phrase with the objective of authenticity");
			System.out.println("6. We will decrypt the confidential phrase (Option 4)");
			System.out.println("7. We will decrypt the phrase we want to authenticate (Option 5)");
			System.out.println("Select an option");
			int opcion = sc.nextInt();
			sc.nextLine();
			
			switch (opcion) {
			case 1:
				System.out.println("Enter a phrase, and I'll encrypt it for you, bro");
				String frase = sc.nextLine();
				try {
					// Aqui obtenemos el generador de escitalas espartanas
					KeyGenerator generate = KeyGenerator.getInstance("DES");
					// Aqui generamos la clave simetrica
					paloEspartano = generate.generateKey();
					// Ahora obtenemos el cifrador de que nos permite encriptar y desencriptar
					Cipher cipher = Cipher.getInstance("DES");
					// Ahora el cifrador lo configuramos pra que se use la clave simetrica
					cipher.init(Cipher.ENCRYPT_MODE, paloEspartano);
					byte[]byteMessageOriginal = frase.getBytes();
					byteMessageEncryption= cipher.doFinal(byteMessageOriginal);
					String messageEncrypt = new String(byteMessageEncryption);
					fraseEncriptada = messageEncrypt;
					
				} catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
					
					e.printStackTrace();
				}
				
				
				break;
			case 2:
				if(fraseEncriptada!=null) {
					System.out.println("This is your encrypted phrase:" +  fraseEncriptada);
				}else {
					System.out.println("Error ");
				}
				
				break;
			case 3:
				System.out.println("Decrypt mode, bro");
				try {
					Cipher decrypt = Cipher.getInstance("DES");
					decrypt.init(Cipher.DECRYPT_MODE, paloEspartano );
					byte[]bytesMessageDecrypt = decrypt.doFinal(byteMessageEncryption);
					System.out.println("This is your decrypted phrase: " + new String(bytesMessageDecrypt));
					
				} catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				break;
			case 4:
				System.out.println("Confidentiality mode, bro");
				System.out.println("Enter a phrase, and I'll encrypt it for you, bro");
				String fraseConfidencialidad = sc.nextLine();
				try {
					// Generador de claves
					KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
					// Obtenemos ahora el par de claves (publica y privada).
					// Solamente se generan una vez 
					KeyPair key = generator.generateKeyPair();
					privateKey = key.getPrivate();
					publicKey = key.getPublic();
					// Obtenemos el descifrador
					Cipher cipher = Cipher.getInstance("RSA");
					cipher.init(Cipher.ENCRYPT_MODE, publicKey);
					// Hemos configurado el cifrador para usar una clave publica que 
					// lo que proporciona es confidencialidad, porque solo puede ser 
					// desencriptada por la llave privada
					byte[]mensajeOriginal = fraseConfidencialidad.getBytes();
					mensajeOriginalCifrado = cipher.doFinal(mensajeOriginal);
					mensajeCifrado = new String(mensajeOriginalCifrado);
					System.out.println("Esta es tu frase encriptada: " + mensajeCifrado );
					
					
				} catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			case 5:
				KeyPairGenerator generador;
				System.out.println("Enter a phrase, and I'll encrypt it for you, bro");
				String fraseAutenticidad = sc.nextLine();
				try {
					generador = KeyPairGenerator.getInstance("RSA");
					KeyPair claves = generador.generateKeyPair();
					clavePrivada = claves.getPrivate();
					clavePublica = claves.getPublic();
					Cipher cifrador = Cipher.getInstance("RSA");
					cifrador.init(Cipher.ENCRYPT_MODE,clavePrivada);
					byte[] bytesMensajeOriginal = fraseAutenticidad.getBytes();
					bytesMensajeCifrado = cifrador.doFinal(bytesMensajeOriginal);
					String mensajeCifrado = new String(bytesMensajeCifrado);
					System.out.println("Aqui esta tu frase encriptada: " + mensajeCifrado );
					
				} catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				break;
			case 6:
				System.out.println("Desencriptamos el mensaje cifrado");
				try {
					Cipher cipher = Cipher.getInstance("RSA");
					cipher.init(Cipher.DECRYPT_MODE, privateKey );
					byte[]bytesMensajeDescifrado = cipher.doFinal(mensajeOriginalCifrado);
					System.out.println("Esta es tu frase cifrada: " + new String(bytesMensajeDescifrado));
					
				} catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	
				break;
			case 7:
				Cipher descifrador;
				try {
					descifrador = Cipher.getInstance("RSA");
					descifrador.init(Cipher.DECRYPT_MODE, clavePublica);
					byte[] bytesMensajeDescifrado = descifrador.doFinal(bytesMensajeCifrado);
					System.out.println("Esta es tu frase desencriptada " + new String(bytesMensajeDescifrado));
				} catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	
				break;

			default:
				System.out.println("Invalid option, please try again, bro");
				break;
			}
		}
		
		
	}

}

