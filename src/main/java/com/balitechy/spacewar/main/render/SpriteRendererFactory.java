package com.balitechy.spacewar.main.render;

/**
 * Fábrica de renderizadores que crea objetos de renderización basados en sprites.
 * Esta clase proporciona métodos para crear los renderizadores específicos para el jugador,
 * las balas y el fondo, utilizando imágenes de sprites.
 *
 * @author andresazcona
 */
public class SpriteRendererFactory implements RendererFactory {

    /**
     * Crea y devuelve un renderizador para representar al jugador utilizando un sprite.
     *
     * @return un objeto `PlayerRenderer` que utiliza un sprite para representar al jugador.
     */
    @Override
    public PlayerRenderer createPlayerRenderer() {
        return new SpritePlayerRenderer();  // Renderizador de sprites para el jugador
    }

    /**
     * Crea y devuelve un renderizador para representar las balas utilizando un sprite.
     *
     * @return un objeto `BulletRenderer` que utiliza un sprite para representar las balas.
     */
    @Override
    public BulletRenderer createBulletRenderer() {
        return new SpriteBulletRenderer();  // Renderizador de sprites para las balas
    }

    /**
     * Crea y devuelve un renderizador para representar el fondo utilizando un sprite.
     *
     * @return un objeto `BackgroundRenderer` que utiliza un sprite para representar el fondo.
     */
    @Override
    public BackgroundRenderer createBackgroundRenderer() {
        return new SpriteBackgroundRenderer();  // Renderizador de sprites para el fondo
    }
}
