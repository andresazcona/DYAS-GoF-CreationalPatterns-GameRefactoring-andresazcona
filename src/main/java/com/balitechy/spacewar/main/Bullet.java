package com.balitechy.spacewar.main;

/**
 * Clase que representa una bala disparada por el jugador en el juego.
 * La bala se mueve hacia arriba en la pantalla con una velocidad constante.
 *
 * @author andresazcona
 */
public class Bullet {
	// Coordenadas de la bala en el espacio del juego
	private double x, y;

	// Dimensiones de la bala
	public static final int WIDTH = 11;
	public static final int HEIGHT = 21;

	/**
	 * Constructor de la clase Bullet.
	 * Inicializa la posición de la bala en las coordenadas especificadas.
	 *
	 * @param x La posición horizontal inicial de la bala.
	 * @param y La posición vertical inicial de la bala.
	 */
	public Bullet(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Método que actualiza la posición de la bala.
	 * La bala se mueve hacia arriba (disminuye su valor en el eje Y).
	 */
	public void tick() {
		y -= 5; // La bala se mueve hacia arriba con una velocidad de 5 unidades por tick.
	}

	/**
	 * Obtiene la posición horizontal de la bala.
	 *
	 * @return La coordenada X de la bala.
	 */
	public double getX() {
		return x;
	}

	/**
	 * Obtiene la posición vertical de la bala.
	 *
	 * @return La coordenada Y de la bala.
	 */
	public double getY() {
		return y;
	}
}
