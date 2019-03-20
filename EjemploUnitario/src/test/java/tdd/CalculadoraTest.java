package tdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	private Calculadora fixture;
	
	@Before
	public void setUp() throws Exception {
		fixture = new Calculadora();
	}

	@Test
	public void testSumar() {
		int result = fixture.sumar(2,2);
		assertEquals(4, result);
	}
	
	@Test
	public void testRestar() {
		int result = fixture.restar(4,2);
		assertEquals(2, result);
	}
	
	@Test
	public void testDividir() {
		double result = fixture.dividir(4,2);
		assertTrue(2.0d == result);
	}
	
	@Test
	public void testMultiplicar() {
		double result = fixture.multiplicar(4,2);
		assertTrue(8.0d == result);
	}

}
