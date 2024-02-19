package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calc = new Calculadora(3,5);
		int result = calc.suma();
		assertEquals(8, result);
	}

	@Test
	void testResta() {
		Calculadora calc = new Calculadora(10,5);
		int result = calc.resta();
		assertEquals(5, result);
	}
	
	@Test
	void testResta2_1() {
		Calculadora calc = new Calculadora(10,5);
		boolean result = calc.resta2();
		assertTrue(result);
	}
	
	@Test
	void testResta2_2() {
		Calculadora calc = new Calculadora(5,10);
		boolean result = calc.resta2();
		assertFalse(result);
	}

	@Test
	void testMultiplica() {
		Calculadora calc = new Calculadora(2,4);
		int result = calc.multiplica();
		assertEquals(8, result);
	}

	@Test
	void testDivide() {
		Calculadora calc = new Calculadora(20,4);
		int result = calc.divide();
		assertEquals(5, result);
	}
	
	@Test
	void testDivide2_1() {
		Calculadora calc = new Calculadora(20,0);
		Integer result = calc.divide2();
		assertNull(result);
	}
	
	@Test
	void testDivide2_2() {
		Calculadora calc = new Calculadora(20,4);
		int result = calc.divide2();
		assertEquals(5, result);
	}

}
