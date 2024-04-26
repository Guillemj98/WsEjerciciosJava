package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

	@Suite
	@SelectClasses({
		pruebasUnitariasJugador.class,
		pruebasUnitariasSoldado.class
	})
class TodasClases {


}
