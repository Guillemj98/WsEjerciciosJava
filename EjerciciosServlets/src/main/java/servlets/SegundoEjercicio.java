package servlets;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;


@WebServlet("/SegundoEjercicio")
public class SegundoEjercicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sPrimerNumero = request.getParameter("PrimerNumero");
		int iPrimerNumero = Integer.parseInt(sPrimerNumero);
		String sSegundoNumero = request.getParameter("SegundoNumero");
		int iSegundoNumero = Integer.parseInt(sSegundoNumero);
		String opcion = request.getParameter("operacion");
		PrintWriter pw = response.getWriter();
		int resultado =0;
		switch (opcion) {
		case "S":
			resultado = sumar(iPrimerNumero, iSegundoNumero);
			mostrarHtml(iPrimerNumero, iSegundoNumero, resultado, "Sumar",pw);
			break;
		case "R":
			resultado = restar(iPrimerNumero, iSegundoNumero);
			mostrarHtml(iPrimerNumero, iSegundoNumero, resultado, "Restar",pw);
			break;
		case "M":
			resultado = multiplicar(iPrimerNumero, iSegundoNumero);
			mostrarHtml(iPrimerNumero, iSegundoNumero, resultado, "Multiplicar",pw);
			break;
		case "D":
			resultado = dividir(iPrimerNumero, iSegundoNumero);
			mostrarHtml(iPrimerNumero, iSegundoNumero, resultado, "Dividir",pw);
			break;
		default:
			System.out.println("BOBOBOOBOBO");
			break;
		}
		
	}

	
	


	private void mostrarHtml(int iPrimerNumero, int iSegundoNumero, int resultado, String opcion,PrintWriter pw) {
		pw.append("<HTML>");
		pw.append("<HEAD>");
		pw.append("<TITLE>Operacion</TITLE>");
		pw.append("</HEAD>");
		pw.append("<BODY>");
		pw.append("<h1 style='color:red'> Bienvenido compañero del metal</h1>");
		pw.append("<h1 style='color:green'>" + opcion + "</h1>");
		pw.append("<h1 style='color:green'>" + iPrimerNumero + "</h1>");
		pw.append("<h1 style='color:green'>" + iSegundoNumero + "</h1>");
		pw.append("<h1 style='color:green'>" + resultado + "</h1>");
		pw.append("</BODY>");
		pw.append("</HTML>");
		
	}





	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	public int sumar(int n1, int n2) {
		
		return n1 + n2;
	}
	public int restar(int n1, int n2) {
		return n1 - n2 ;
	}
	public int dividir(int n1, int n2) {
		return n1 / n2;
	}
	public int multiplicar(int n1, int n2) {
		return n1 * n2;
	}

}
