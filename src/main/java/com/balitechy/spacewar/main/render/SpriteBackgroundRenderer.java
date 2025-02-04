package com.balitechy.spacewar.main.render;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import com.balitechy.spacewar.main.SpritesImageLoader;

/**
 * Renderizador del fondo que utiliza una imagen de sprite.
 * Esta clase carga una imagen de fondo desde los recursos y la dibuja en la pantalla.
 *
 * @author andresazcona
 */
public class SpriteBackgroundRenderer implements BackgroundRenderer {
    // Imagen de fondo que se usará para dibujar el fondo del juego
    private BufferedImage image;

    /**
     * Constructor que carga la imagen de fondo desde los recursos.
     * Se utiliza el cargador de imágenes `SpritesImageLoader` para cargar la imagen desde el archivo
     * especificado en la ruta "/bg.png".
     */
    public SpriteBackgroundRenderer() {
        SpritesImageLoader loader = new SpritesImageLoader("/bg.png");
        try {
            // Cargar la imagen
            loader.loadImage();
            // Obtener una subimagen con las dimensiones especificadas (640x480)
            image = loader.getImage(0, 0, 640, 480);
        } catch (Exception e) {
            // Imprimir la traza de la excepción si ocurre algún error al cargar la imagen
            e.printStackTrace();
        }
    }

    /**
     * Dibuja el fondo en la pantalla utilizando la imagen cargada.
     * Esta implementación ajusta la imagen al tamaño de la pantalla.
     *
     * @param g El objeto `Graphics` usado para dibujar en el lienzo.
     * @param c El objeto `Canvas` que representa el área de dibujo en la que se renderiza el fondo.
     */
    @Override
    public void render(Graphics g, Canvas c) {
        // Dibujar la imagen de fondo ajustada al tamaño del lienzo
        g.drawImage(image, 0, 0, c.getWidth(), c.getHeight(), c);
    }
}
