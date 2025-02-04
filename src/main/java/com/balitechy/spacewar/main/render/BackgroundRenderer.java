package com.balitechy.spacewar.main.render;

import java.awt.Canvas;
import java.awt.Graphics;

/**
 * Interfaz encargada de definir el método de renderizado para el fondo del juego.
 * Implementada por las clases que proporcionan distintas formas de representar
 * el fondo en el juego.
 *
 * @author andresazcona
 */
public interface BackgroundRenderer {

    /**
     * Método para renderizar el fondo en el lienzo del juego.
     * Este método debe ser implementado por las clases que lo utilicen para
     * dibujar el fondo según su estilo particular.
     *
     * @param g Objeto `Graphics` utilizado para dibujar en el lienzo.
     * @param c Objeto `Canvas` que representa el área de dibujo del fondo.
     */
    void render(Graphics g, Canvas c);
}
