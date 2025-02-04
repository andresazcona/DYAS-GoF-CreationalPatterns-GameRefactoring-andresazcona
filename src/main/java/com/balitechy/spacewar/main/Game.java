package com.balitechy.spacewar.main;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;

import com.balitechy.spacewar.main.render.*;
import com.balitechy.spacewar.main.render.BackgroundRenderer;

import java.util.Scanner;

/**
 * Clase principal que gestiona el juego Space War 2D.
 * Controla la inicialización, ejecución, y renderización de los componentes del juego.
 * También maneja la selección del tipo de fábrica a usar para los elementos del juego.
 *
 * @author andresazcona
 */
public class Game extends Canvas implements Runnable {
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 320;
	public static final int HEIGHT = WIDTH / 12 * 9;
	public static final int SCALE = 2;
	public final String TITLE = "Space War 2D";

	private boolean running = false;
	private Thread thread;

	private Player player;
	private BulletController bullets;
	private RendererFactory rendererFactory;
	private PlayerRenderer playerRenderer;
	private BulletRenderer bulletRenderer;
	private BackgroundRenderer backgroundRenderer;

	/**
	 * Método que inicializa los componentes del juego como el jugador, los proyectiles,
	 * y los renderizadores de acuerdo con la fábrica seleccionada.
	 */
	public void init() {
		requestFocus();  // Hacer que el foco de entrada sea esta ventana
		addKeyListener(new InputHandler(this));  // Añadir el manejador de eventos de teclado

		// Crear los renderizadores utilizando la fábrica seleccionada
		playerRenderer = rendererFactory.createPlayerRenderer();
		bulletRenderer = rendererFactory.createBulletRenderer();
		backgroundRenderer = rendererFactory.createBackgroundRenderer();

		// Inicializar al jugador y los controladores de proyectiles
		player = new Player((WIDTH * SCALE - Player.WIDTH) / 2, HEIGHT * SCALE - 50, this);
		bullets = new BulletController();
	}

	/**
	 * Método que maneja los eventos cuando una tecla es presionada.
	 * Modifica la velocidad del jugador o dispara un proyectil.
	 */
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		// Cambiar la velocidad del jugador según la tecla presionada
		switch (key) {
			case KeyEvent.VK_RIGHT: player.setVelX(5); break;
			case KeyEvent.VK_LEFT: player.setVelX(-5); break;
			case KeyEvent.VK_UP: player.setVelY(-5); break;
			case KeyEvent.VK_DOWN: player.setVelY(5); break;
			case KeyEvent.VK_SPACE: player.shoot(); break;  // Disparar
		}
	}

	/**
	 * Método que maneja los eventos cuando una tecla es soltada.
	 * Detiene el movimiento del jugador.
	 */
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		// Detener el movimiento cuando se suelta la tecla
		switch (key) {
			case KeyEvent.VK_RIGHT: player.setVelX(0); break;
			case KeyEvent.VK_LEFT: player.setVelX(0); break;
			case KeyEvent.VK_UP: player.setVelY(0); break;
			case KeyEvent.VK_DOWN: player.setVelY(0); break;
		}
	}

	/**
	 * Método que actualiza los componentes del juego, como el jugador y los proyectiles.
	 */
	public void tick() {
		player.tick();  // Actualizar la posición y estado del jugador
		bullets.tick();  // Actualizar los proyectiles
	}

	/**
	 * Método que renderiza todos los componentes del juego, incluyendo el fondo,
	 * el jugador y los proyectiles.
	 */
	public void render() {
		BufferStrategy bs = getBufferStrategy();
		if (bs == null) {
			createBufferStrategy(3);  // Crear la estrategia de buffer
			return;
		}

		Graphics g = bs.getDrawGraphics();
		backgroundRenderer.render(g, this);  // Renderizar el fondo
		playerRenderer.render(g, player.getX(), player.getY());  // Renderizar el jugador
		bullets.render(g, bulletRenderer);  // Renderizar los proyectiles
		g.dispose();  // Liberar recursos gráficos
		bs.show();  // Mostrar el buffer
	}

	/**
	 * Obtiene el controlador de proyectiles del juego.
	 *
	 * @return el controlador de proyectiles
	 */
	public BulletController getBullets() {
		return bullets;
	}

	/**
	 * Método principal que inicia el juego y muestra un menú de selección de fábrica.
	 */
	public static void main(String[] args) {
		Game game = new Game();

		// Menú para seleccionar la fábrica
		game.showMenu();

		// Inicializar la ventana del juego
		game.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		JFrame frame = new JFrame(game.TITLE);
		frame.add(game);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		game.start();  // Iniciar el hilo del juego
	}

	/**
	 * Muestra un menú en consola que permite al usuario seleccionar el tipo de fábrica a usar.
	 */
	private void showMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hola profesor, bienvenido a Space War 2D mejorado en caso de encontrar algo ue no le parezca agradezco todo tipo de feedback :)");
		System.out.println("Seleccione el tipo de fábrica para el juego:");
		System.out.println("1. Fábrica Vector");
		System.out.println("2. Fábrica Sprite");
		System.out.println("3. Fábrica Vector Colorido");

		int choice = scanner.nextInt();

		// Seleccionar la fábrica de acuerdo con la opción del usuario
		switch (choice) {
			case 1:
				rendererFactory = new VectorRendererFactory();
				System.out.println("Has seleccionado la Fábrica Vector.");
				break;
			case 2:
				rendererFactory = new SpriteRendererFactory();
				System.out.println("Has seleccionado la Fábrica Sprite.");
				break;
			case 3:
				rendererFactory = new ColorfulVectorRendererFactory();
				System.out.println("Has seleccionado la Fábrica Vector Colorido.");
				break;
			default:
				System.out.println("Opción no válida, se seleccionará la Fábrica Vector por defecto.");
				rendererFactory = new VectorRendererFactory();
				break;
		}
	}

	/**
	 * Inicia el hilo del juego si aún no está en ejecución.
	 */
	private synchronized void start() {
		if (running) return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}

	/**
	 * Método que ejecuta el bucle principal del juego, actualizando y renderizando en intervalos de 60 FPS.
	 */
	@Override
	public void run() {
		init();  // Inicializar los componentes del juego
		long lastTime = System.nanoTime();
		final double ns = 1000000000 / 60.0;  // 60 FPS
		double delta = 0;
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			if (delta >= 1) {
				tick();  // Actualizar componentes del juego
				render();  // Renderizar la escena
				delta--;  // Reducir el delta
			}
		}
	}
}

// Autores:
// AndresAzcona
