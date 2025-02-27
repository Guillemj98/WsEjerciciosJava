package es.upgrade.modelo.entidad;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="librerias")
public class Libreria {
	public Libreria(String string, String string2, String string3, List<Libro> of) {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String nombreDueño;
	private String direccion;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(
			name="libreria_libro",
			joinColumns = @JoinColumn(name="libreria_id"),
			inverseJoinColumns = @JoinColumn(name="libro_id")
			)
	private List<Libro>coleccionLibros;
	

}
