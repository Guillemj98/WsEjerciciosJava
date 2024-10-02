package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletHTML")
public class ServletHTML extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.append("<HTML>");
		pw.append("<HEAD>");
		pw.append("<TITLE>ServletHTML</TITLE>");
		pw.append("</HEAD>");
		pw.append("<BODY>");
		pw.append("<h1> Numero aleatorio</h1>");
		Random rm = new Random();
		int numeroAleatorio = rm.nextInt(1 ,100);
		pw.append("<h2 style='color:red'>" + numeroAleatorio + "</h2>");
		pw.append("</BODY>");
		pw.append("</HTML>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doGet(request, response);
	}

}
