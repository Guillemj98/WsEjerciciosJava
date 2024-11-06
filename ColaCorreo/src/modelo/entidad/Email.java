package modelo.entidad;

import java.util.Objects;

public class Email {
	private int id;
	private String destinatario;
	private String remitente;
	private String asunto;
	private String cuerpoMensaje;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getCuerpoMensaje() {
		return cuerpoMensaje;
	}
	public void setCuerpoMensaje(String cuerpoMensaje) {
		this.cuerpoMensaje = cuerpoMensaje;
	}
	@Override
	public String toString() {
	    return "Email {" +
	           "\n   ID: " + id +
	           "\n   Destinatario: " + destinatario +
	           "\n   Remitente: " + remitente +
	           "\n   Asunto: " + asunto +
	           "\n   Cuerpo del Mensaje: " + cuerpoMensaje +
	           "\n}";
	}
	@Override
	public int hashCode() {
		return Objects.hash(destinatario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Email other = (Email) obj;
		return Objects.equals(destinatario, other.destinatario);
	}
	
	

}
