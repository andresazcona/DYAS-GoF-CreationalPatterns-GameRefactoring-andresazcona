package com.balitechy.spacewar.main.render;

import java.awt.Graphics;

/**
 * Interfaz encargada de definir el método de renderizado para las balas del juego.
 * Implementada por las clases que proporcionan distintas formas de representar
 * las balas en el juego.
 *
 * @author andresazcona
 */
public interface BulletRenderer {

    /**
     * Método para renderizar una bala en el lienzo del juego.
     * Este método debe ser implementado por las clases que lo utilicen para
     * dibujar las balas según su estilo particular.
     *
     * @param g Objeto `Graphics` utilizado para dibujar en el lienzo.
     * @param x Posición horizontal de la bala en el lienzo.
     * @param y Posición vertical de la bala en el lienzo.
     */
    void render(Graphics g, double x, double y);
}
