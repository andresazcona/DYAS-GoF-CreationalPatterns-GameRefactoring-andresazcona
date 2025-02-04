package com.balitechy.spacewar.main;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Clase encargada de renderizar el fondo del juego.
 * Utiliza una imagen cargada desde un archivo para mostrarla en la pantalla.
 *
 * @author andresazcona
 */
public class BackgroundRenderer {

	/**
	 * Método encargado de renderizar el fondo del juego.
	 * Carga la imagen del fondo y la dibuja en la pantalla en el tamaño adecuado.
	 *
	 * @param g El objeto Graphics utilizado para renderizar el fondo.
	 * @param c El objeto Canvas sobre el que se dibuja el fondo.
	 * @throws IOException Si ocurre un error al cargar la imagen del fondo.
	 */
	public void render(Graphics g, Canvas c) throws IOException {
		BufferedImage background = null;
		SpritesImageLoader bg;

		// Crear un cargador de imagen para el fondo
		bg = new SpritesImageLoader("/bg.png");

		// Cargar la imagen del fondo
		bg.loadImage();

		// Obtener la imagen cargada y recortarla para ajustarse a las dimensiones deseadas
		background = bg.getImage(0, 0, 640, 480);

		// Dibujar la imagen de fondo sobre el canvas, ajustada al tamaño del canvas
		g.drawImage(background, 0, 0, c.getWidth(), c.getHeight(), c);
	}
}
