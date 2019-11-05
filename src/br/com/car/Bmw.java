package br.com.car;

public class Bmw {
	public static final int VELOCIDADE_MAXIMA = 200;
	public static final int VELOCIDADE_MINIMA = 30;
	
	public int drive(int speed) {
		if (speed > VELOCIDADE_MAXIMA) {
			speed = VELOCIDADE_MAXIMA;
		}

		if (speed < VELOCIDADE_MINIMA) {
			speed = VELOCIDADE_MINIMA;
		}
		
		return speed;
	}
}
