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
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "lunares")
public class Lunar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id ;
	private String nombre;
	private String forma;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name="lunares_clientes",
	joinColumns = {@JoinColumn(name="fk_id_lunar", referencedColumnName = "id")},
	inverseJoinColumns = {@JoinColumn(name="fk_id_cliente", referencedColumnName = "id")})
	private List<Cliente>listaClientes;

}
