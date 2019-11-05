package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.car.Bmw;

class TestCar {

	@Test
	public void shouldTestAccelerationMaximum() {
		Bmw minhaBmw = new Bmw();
		assertEquals(200, minhaBmw.drive(300));
	}
	
	@Test
	public void shouldTestAcceleration() {
		Bmw minhaBmw = new Bmw();
		assertEquals(100, minhaBmw.drive(100));
	}
	
	@Test
	public void shouldTestAccelerationMinimum() {
		Bmw minhaBmw = new Bmw();
		assertEquals(30, minhaBmw.drive(10));
	}		
}
		