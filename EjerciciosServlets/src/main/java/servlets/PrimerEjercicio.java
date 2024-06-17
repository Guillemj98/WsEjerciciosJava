package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PrimerEjercicio")
public class PrimerEjercicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("usuario");
		String password = request.getParameter("pass");
		if(nombre.equalsIgnoreCase("muñon")&& password.equals("123456")) {
			PrintWriter pw = response.getWriter();
			pw.append("<HTML>");
			pw.append("<HEAD>");
			pw.append("<TITLE>Primer Ejercicio</TITLE>");
			pw.append("</HEAD>");
			pw.append("<BODY>");
			pw.append("<h1 style='color:g'> Bienvenido compañero del metal</h1>");
			pw.append("</BODY>");
			pw.append("</HTML>");
		}else if(nombre.isBlank()|| password.isBlank()) {
			PrintWriter pw = response.getWriter();
			pw.append("<HTML>");
			pw.append("<HEAD>");
			pw.append("<TITLE>Primer Ejercicio</TITLE>");
			pw.append("</HEAD>");
			pw.append("<BODY>");
			pw.append("<h1 style='color:brown'>HAS DEJADO ALGUN CAMPO VACIOOOOOOOO MUÑÑÑÑÑOOOOONNNNN</h1>");
			pw.append("</BODY>");
			pw.append("</HTML>");
		}else {
			PrintWriter pw = response.getWriter();
			pw.append("<HTML>");
			pw.append("<HEAD>");
			pw.append("<TITLE>Primer Ejercicio</TITLE>");
			pw.append("</HEAD>");
			pw.append("<BODY>");
			pw.append("<h1 style='color:red'> Usuario o contraseña INCORRECTOSSSSSSSS</h1>");
			pw.append("</BODY>");
			pw.append("</HTML>");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
