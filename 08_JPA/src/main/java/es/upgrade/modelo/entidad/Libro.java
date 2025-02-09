package es.upgrade.modelo.entidad;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="libros")
public class Libro {
	public Libro(String string, int i, Autor autor3, Editorial editorial1) {
		// TODO Auto-generated constructor stub
	}

	public Libro(String string, double d, Autor autor2, Editorial editorial1) {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private double precio;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="fk_id_editorial", referencedColumnName = "id")
	private Editorial editorial;
	
	
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="fk_id_autor" , referencedColumnName = "id")
	private Autor autor;
	
	@ManyToMany(mappedBy = "libros")
	private List<Libreria>librerias;

}
