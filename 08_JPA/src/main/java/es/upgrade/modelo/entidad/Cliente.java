package es.upgrade.modelo.entidad;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="clientes")
@Data
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String telefono;
	
	@OneToOne(mappedBy = "cliente", cascade = CascadeType.PERSIST)
	private DatosBancario datosBancario;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.PERSIST)
	private List<Coche>listaCoches;
	private List<Lunar>listaLunares;

}
