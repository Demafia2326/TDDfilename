package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;
import pkg.Movimiento;

class CuentaTest {

	private static Cuenta cuenta;
	private static Movimiento movimiento;
	private Cuenta cuenta12345;
	private Cuenta cuenta67890;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta(9);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta12345 = new Cuenta("12345", 50.0);
		cuenta67890 = new Cuenta("67890", 0.0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(500.0);
		assertEquals(500, cuenta.getSaldo());
	}

	@Test
	void testRetirar() {
		cuenta.retirar(500.0);
		assertEquals(-500, cuenta.getSaldo());
	}

	@Test
	void test0014() {
		cuenta12345.retirar(200);
		cuenta67890.retirar(350);
		cuenta12345.ingresar(100);
		cuenta67890.retirar(200);
		cuenta67890.retirar(150);
		cuenta12345.retirar(200);
		cuenta67890.ingresar(50);
		cuenta67890.retirar(100);

		assertEquals(-250, cuenta12345.getSaldo(), 0.001);
		assertEquals(-450, cuenta67890.getSaldo(), 0.001);
	}

}
