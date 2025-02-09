package es.upgrade.modelo.entidad;

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

@Entity
@Table(name = "coches")
@Data
public class Coche {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String marca;
	private double precio;
	private int CV;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name= "fk_id_cliente", referencedColumnName = "id")
	private Cliente cliente;
	

}
