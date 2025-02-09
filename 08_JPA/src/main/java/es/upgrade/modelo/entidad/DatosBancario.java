package es.upgrade.modelo.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name= "datos_bancarios")
@Data
public class DatosBancario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String banco;
	private Integer numeroTC;
	
	@OneToOne
	@JoinColumn(name= "fk_id_cliente", referencedColumnName = "id")
	private Cliente cliente;
	

}
