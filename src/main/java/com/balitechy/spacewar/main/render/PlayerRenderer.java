package com.balitechy.spacewar.main.render;

import java.awt.Graphics;

/**
 * Interfaz para el renderizado de un jugador en el juego.
 * Define el método que debe ser implementado por las clases que renderizan al jugador en el juego.
 *
 * @author andresazcona
 */
public interface PlayerRenderer {

    /**
     * Renderiza al jugador en la pantalla.
     *
     * @param g El objeto `Graphics` que se usa para dibujar en la pantalla.
     * @param x La coordenada `x` de la posición del jugador.
     * @param y La coordenada `y` de la posición del jugador.
     */
    void render(Graphics g, double x, double y);
}
