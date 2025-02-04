package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.util.LinkedList;
import com.balitechy.spacewar.main.render.BulletRenderer;

/**
 * Controlador de las balas en el juego.
 * Administra la lista de balas, su actualización (movimiento) y su renderizado en la pantalla.
 *
 * @author andresazcona
 */
public class BulletController {
	// Lista enlazada que contiene las balas en el juego
	private LinkedList<Bullet> bullets = new LinkedList<>();

	/**
	 * Actualiza el estado de las balas.
	 * Elimina las balas que han salido de la pantalla (aquellas cuyo valor Y es menor que 0).
	 * También actualiza la posición de las balas restantes.
	 */
	public void tick() {
		// Eliminar las balas que ya no están visibles en la pantalla (fuera de los límites)
		bullets.removeIf(bullet -> bullet.getY() < 0);

		// Actualizar la posición de todas las balas restantes
		bullets.forEach(Bullet::tick);
	}

	/**
	 * Dibuja las balas en la pantalla.
	 * Se usa un objeto BulletRenderer para representar cada bala en las coordenadas X e Y correspondientes.
	 *
	 * @param g El objeto Graphics para renderizar las balas.
	 * @param bulletRenderer El renderizador de balas que se encarga de mostrar cada bala en la pantalla.
	 */
	public void render(Graphics g, BulletRenderer bulletRenderer) {
		// Dibujar cada bala utilizando su renderizador
		bullets.forEach(bullet -> bulletRenderer.render(g, bullet.getX(), bullet.getY()));
	}

	/**
	 * Añade una nueva bala a la lista de balas.
	 *
	 * @param bullet La bala que se desea agregar a la lista.
	 */
	public void addBullet(Bullet bullet) {
		bullets.add(bullet);
	}
}
