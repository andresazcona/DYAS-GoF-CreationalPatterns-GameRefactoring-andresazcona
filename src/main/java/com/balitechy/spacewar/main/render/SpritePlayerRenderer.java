package com.balitechy.spacewar.main.render;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.balitechy.spacewar.main.Player;
import com.balitechy.spacewar.main.SpritesImageLoader;

/**
 * Renderizador de jugador utilizando una imagen de sprite.
 * Esta clase carga una imagen del sprite del jugador y la dibuja en la pantalla en la posición especificada.
 *
 * @author andresazcona
 */
public class SpritePlayerRenderer implements PlayerRenderer {
    // Imagen del sprite del jugador que se usará para representar al jugador en pantalla
    private BufferedImage image;

    /**
     * Constructor que carga el sprite del jugador desde los recursos.
     * Utiliza el cargador de imágenes `SpritesImageLoader` para cargar la imagen desde el archivo
     * especificado en la ruta "/sprites.png".
     * La imagen se obtiene de una subimagen con las dimensiones correspondientes al jugador.
     */
    public SpritePlayerRenderer() {
        SpritesImageLoader loader = new SpritesImageLoader("/sprites.png");
        try {
            // Cargar la imagen completa
            loader.loadImage();
            // Obtener la subimagen que corresponde al jugador (219, 304) es la posición en el sprite y Player.WIDTH/HEIGHT son las dimensiones
            image = loader.getImage(219, 304, Player.WIDTH, Player.HEIGHT);
        } catch (Exception e) {
            // Imprimir la traza de la excepción si ocurre algún error al cargar la imagen
            e.printStackTrace();
        }
    }

    /**
     * Dibuja al jugador en la pantalla utilizando la imagen cargada.
     * La imagen se dibuja en las coordenadas especificadas por los parámetros `x` y `y`.
     *
     * @param g El objeto `Graphics` utilizado para dibujar en el lienzo.
     * @param x La posición horizontal del jugador en la pantalla.
     * @param y La posición vertical del jugador en la pantalla.
     */
    @Override
    public void render(Graphics g, double x, double y) {
        // Dibujar la imagen del jugador en las coordenadas (x, y)
        g.drawImage(image, (int) x, (int) y, null);
    }
}
