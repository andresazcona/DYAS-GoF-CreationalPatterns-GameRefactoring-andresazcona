package com.balitechy.spacewar.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Clase encargada de manejar las entradas del teclado en el juego.
 * Hereda de KeyAdapter para simplificar la implementación de los métodos de manejo de teclas.
 * Este manejador se encarga de detectar cuándo se presionan o se sueltan teclas y luego
 * pasa estos eventos a la clase `Game` para que sea gestionada la lógica del juego.
 *
 * @author andresazcona
 */
public class InputHandler extends KeyAdapter {
	// Referencia al objeto del juego para delegar el manejo de eventos
	private Game game;

	/**
	 * Constructor de la clase `InputHandler`.
	 * Se pasa la instancia del juego para poder delegar los eventos de teclado.
	 *
	 * @param game Instancia del juego en la que se gestionarán los eventos del teclado.
	 */
	public InputHandler(Game game) {
		this.game = game;
	}

	/**
	 * Método que se llama cuando se presiona una tecla.
	 * Este método delega el evento de la tecla presionada a la clase `Game` para que maneje la lógica.
	 *
	 * @param e El evento de tecla presionada.
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		game.keyPressed(e);
	}

	/**
	 * Método que se llama cuando se suelta una tecla.
	 * Este método delega el evento de la tecla liberada a la clase `Game` para que maneje la lógica.
	 *
	 * @param e El evento de tecla liberada.
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		game.keyReleased(e);
	}
}
