package com.balitechy.spacewar.main;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Clase encargada de cargar y manejar imágenes para el juego.
 * Proporciona métodos para cargar una imagen desde una ruta especificada
 * y extraer subimágenes de dicha imagen.
 *
 * @author andresazcona
 */
public class SpritesImageLoader {
	// Ruta de la imagen que se va a cargar
	private String path;

	// Imagen cargada desde el archivo
	private BufferedImage image;

	/**
	 * Constructor de la clase `SpritesImageLoader`.
	 * Inicializa la ruta de la imagen.
	 *
	 * @param path Ruta de la imagen a cargar.
	 */
	public SpritesImageLoader(String path) {
		this.path = path;
	}

	/**
	 * Carga la imagen desde el archivo especificado en la ruta.
	 *
	 * @return La imagen cargada como un objeto `BufferedImage`.
	 * @throws IOException Si ocurre un error al leer el archivo de imagen.
	 */
	public BufferedImage loadImage() throws IOException {
		// Carga la imagen desde el recurso especificado en la ruta
		image = ImageIO.read(getClass().getResource(path));
		return image;
	}

	/**
	 * Extrae una subimagen de la imagen cargada, utilizando las coordenadas
	 * y dimensiones especificadas.
	 *
	 * @param top Coordenada Y superior de la subimagen.
	 * @param left Coordenada X izquierda de la subimagen.
	 * @param width Ancho de la subimagen.
	 * @param height Altura de la subimagen.
	 * @return La subimagen como un objeto `BufferedImage`.
	 */
	public BufferedImage getImage(int top, int left, int width, int height) {
		// Devuelve una subimagen de la imagen cargada utilizando las coordenadas y tamaño especificados
		return image.getSubimage(top, left, width, height);
	}
}
