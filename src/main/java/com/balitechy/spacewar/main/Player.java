package com.balitechy.spacewar.main;

/**
 * Clase que representa al jugador dentro del juego.
 * Contiene las propiedades y métodos necesarios para controlar el movimiento
 * del jugador, así como la acción de disparar proyectiles.
 *
 * El jugador puede moverse por la pantalla y disparar balas hacia arriba.
 * La posición del jugador está limitada a los bordes de la ventana del juego.
 *
 * @author andresazcona
 */
public class Player {
	// Posición del jugador en el eje X y Y
	private double x, y;

	// Velocidades de movimiento del jugador en los ejes X y Y
	private double velX, velY;

	// Dimensiones del jugador
	public static final int WIDTH = 56;
	public static final int HEIGHT = 28;

	// Referencia al juego para acceder a los métodos y componentes del juego
	private Game game;

	/**
	 * Constructor de la clase `Player`.
	 * Inicializa la posición del jugador y la referencia al juego.
	 *
	 * @param x Posición inicial en el eje X.
	 * @param y Posición inicial en el eje Y.
	 * @param game Instancia del juego para acceder a los componentes del juego.
	 */
	public Player(double x, double y, Game game) {
		this.x = x;
		this.y = y;
		this.game = game;
	}

	/**
	 * Método que actualiza la posición del jugador y controla sus límites en la pantalla.
	 * El jugador no puede moverse fuera de los bordes definidos por el tamaño de la ventana del juego.
	 */
	public void tick() {
		// Actualiza la posición en función de la velocidad
		x += velX;
		y += velY;

		// Limita el movimiento del jugador dentro de los bordes de la ventana
		if (x < 0) x = 0;
		if (x > Game.WIDTH * Game.SCALE - WIDTH) x = Game.WIDTH * Game.SCALE - WIDTH;
		if (y < 0) y = 0;
		if (y > Game.HEIGHT * Game.SCALE - HEIGHT) y = Game.HEIGHT * Game.SCALE - HEIGHT;
	}

	/**
	 * Método que crea y dispara una bala desde la posición del jugador.
	 * La bala es agregada al controlador de balas para ser gestionada y renderizada.
	 */
	public void shoot() {
		// Crea una nueva bala con la posición adecuada respecto al jugador
		Bullet bullet = new Bullet(x + (WIDTH / 2) - 5, y - 18);

		// Agrega la bala al controlador de balas
		game.getBullets().addBullet(bullet);
	}

	// Métodos de acceso a la posición y velocidades del jugador
	public double getX() { return x; }
	public double getY() { return y; }
	public void setVelX(double velX) { this.velX = velX; }
	public void setVelY(double velY) { this.velY = velY; }
}
