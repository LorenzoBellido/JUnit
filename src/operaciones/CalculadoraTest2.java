package operaciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CalculadoraTest2 {

	@ParameterizedTest
	@MethodSource("suma")
	void testSuma(int num1, int num2, int result) {
		Calculadora calc = new Calculadora(num1,num2;
		int resultReal = calc.suma();
		assertEquals(result, resultReal);
	}

	@ParameterizedTest
	@MethodSource("resta")
	void testResta(int num1, int num2, int result) {
		Calculadora calc = new Calculadora(num1,num2);
		int resultReal = calc.resta();
		assertEquals(result, resultReal);
	}

//	@ParameterizedTest
//	void testResta2_1(int num1, int num2, int result) {
//		Calculadora calc = new Calculadora(10, 5);
//		boolean result = calc.resta2();
//		assertTrue(result);
//	}
//
//	@ParameterizedTest
//	void testResta2_2(int num1, int num2, int result) {
//		Calculadora calc = new Calculadora(5, 10);
//		boolean result = calc.resta2();
//		assertFalse(result);
//	}

	@ParameterizedTest
	@MethodSource("multiplica")
	void testMultiplica(int num1, int num2, int result) {
		Calculadora calc = new Calculadora(num1,num2);
		int resultReal = calc.multiplica();
		assertEquals(result, resultReal);
	}

	@ParameterizedTest
	@MethodSource("divide")
	void testDivide(int num1, int num2, int result) {
		Calculadora calc = new Calculadora(num1,num2);
		int resultReal = calc.divide();
		assertEquals(result, resultReal);
	}

//	@ParameterizedTest
//	void testDivide2_1(int num1, int num2, int result) {
//		Calculadora calc = new Calculadora(20, 0);
//		Integer result = calc.divide2();
//		assertNull(result);
//	}
//
//	@ParameterizedTest
//	void testDivide2_2(int num1, int num2, int result) {
//		Calculadora calc = new Calculadora(20, 4);
//		int result = calc.divide2();
//		assertEquals(5, result);
//	}

	private static Stream<Arguments> suma() {
		return Stream.of(
				Arguments.of(10,5,15),
				Arguments.of(5,10,15),
				Arguments.of(0,0,0)
				);
	}
	
	private static Stream<Arguments> resta() {
		return Stream.of(
				Arguments.of(10,5,5),
				Arguments.of(5,10,-5),
				Arguments.of(0,0,0)
				);
	}
	
	private static Stream<Arguments> multiplica() {
		return Stream.of(
				Arguments.of(10,5,50),
				Arguments.of(5,10,50),
				Arguments.of(0,0,0)
				);
	}
	
	private static Stream<Arguments> divide() {
		return Stream.of(
				Arguments.of(10,5,2),
				Arguments.of(10,-2,-5),
				Arguments.of(0,0,0)
				);
	}

}
