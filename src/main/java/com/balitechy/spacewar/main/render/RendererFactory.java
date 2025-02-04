package com.balitechy.spacewar.main.render;

/**
 * Interfaz para la creación de renderizadores para los distintos elementos del juego.
 * Esta interfaz define los métodos para crear los renderizadores específicos para el jugador, las balas y el fondo.
 *
 * @author andresazcona
 */
public interface RendererFactory {

    /**
     * Crea el renderizador del jugador.
     *
     * @return Un objeto que implementa la interfaz `PlayerRenderer`, encargado de renderizar al jugador en el juego.
     */
    PlayerRenderer createPlayerRenderer();

    /**
     * Crea el renderizador de las balas.
     *
     * @return Un objeto que implementa la interfaz `BulletRenderer`, encargado de renderizar las balas en el juego.
     */
    BulletRenderer createBulletRenderer();

    /**
     * Crea el renderizador del fondo.
     *
     * @return Un objeto que implementa la interfaz `BackgroundRenderer`, encargado de renderizar el fondo del juego.
     */
    BackgroundRenderer createBackgroundRenderer();
}
