package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletFormulario")
public class ServletFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
  	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entrando por el metodo doGet");
		
		// Recogemos los parametros del cliente
		String nombre = request.getParameter("nombre");
		System.out.println("Nombre " + nombre);
		
		String password = request.getParameter("pass");
		System.out.println("Password " + password);
		
		String id = request.getParameter("identificador");
		System.out.println("Identificador " + id);
		
		String EstadoCivil = request.getParameter("estado_civil");
		System.out.println("estado_civil " + EstadoCivil);
		
		String[] listaHobbies = request.getParameterValues("hobbies");
		for(String h : listaHobbies) {
			System.out.println("Lista de hobbies" + h);
		}
		
		String dia = request.getParameter("dia_nacimiento");
		System.out.println("dia_nacimiento " + dia);
		
		String obs = request.getParameter("observaciones");
		System.out.println("observaciones " + obs);
		
		String terminos = request.getParameter("terminos");
		boolean bTerminos = false;
		if(terminos !=null) {
			bTerminos = true;
			
		}
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
