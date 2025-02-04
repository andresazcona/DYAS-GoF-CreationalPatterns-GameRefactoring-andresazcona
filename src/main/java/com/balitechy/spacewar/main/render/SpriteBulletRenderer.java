package com.balitechy.spacewar.main.render;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.balitechy.spacewar.main.Bullet;
import com.balitechy.spacewar.main.SpritesImageLoader;

/**
 * Renderizador de balas utilizando una imagen de sprite.
 * Esta clase carga una imagen del sprite de la bala y la dibuja en la pantalla en la posición especificada.
 *
 * @author andresazcona
 */
public class SpriteBulletRenderer implements BulletRenderer {
    // Imagen del sprite de la bala que se usará para representar la bala en pantalla
    private BufferedImage image;

    /**
     * Constructor que carga el sprite de la bala desde los recursos.
     * Utiliza el cargador de imágenes `SpritesImageLoader` para cargar la imagen desde el archivo
     * especificado en la ruta "/sprites.png".
     * La imagen se obtiene de una subimagen con las dimensiones correspondientes a la bala.
     */
    public SpriteBulletRenderer() {
        SpritesImageLoader loader = new SpritesImageLoader("/sprites.png");
        try {
            // Cargar la imagen completa
            loader.loadImage();
            // Obtener la subimagen que corresponde a la bala (35, 52) es la posición en el sprite y Bullet.WIDTH/HEIGHT son las dimensiones
            image = loader.getImage(35, 52, Bullet.WIDTH, Bullet.HEIGHT);
        } catch (Exception e) {
            // Imprimir la traza de la excepción si ocurre algún error al cargar la imagen
            e.printStackTrace();
        }
    }

    /**
     * Dibuja la bala en la pantalla utilizando la imagen cargada.
     * La imagen se dibuja en las coordenadas especificadas por los parámetros `x` y `y`.
     *
     * @param g El objeto `Graphics` utilizado para dibujar en el lienzo.
     * @param x La posición horizontal de la bala en la pantalla.
     * @param y La posición vertical de la bala en la pantalla.
     */
    @Override
    public void render(Graphics g, double x, double y) {
        // Dibujar la imagen de la bala en las coordenadas (x, y)
        g.drawImage(image, (int) x, (int) y, null);
    }
}
