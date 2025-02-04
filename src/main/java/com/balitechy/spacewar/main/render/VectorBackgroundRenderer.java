package com.balitechy.spacewar.main.render;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Clase que implementa la interfaz `BackgroundRenderer` para renderizar un fondo
 * utilizando gráficos vectoriales simples. El fondo es negro con un círculo blanco
 * en la parte superior izquierda.
 *
 * @author andresazcona
 */
public class VectorBackgroundRenderer implements BackgroundRenderer {

    /**
     * Método que renderiza el fondo y un círculo en el área de dibujo.
     * El fondo será de color negro, y se dibujará un círculo blanco en la parte superior izquierda.
     *
     * @param g el objeto `Graphics` usado para dibujar en el lienzo.
     * @param c el objeto `Canvas` en el que se dibuja el fondo.
     */
    @Override
    public void render(Graphics g, Canvas c) {
        // Establecer el color de fondo a negro
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, c.getWidth(), c.getHeight());  // Dibuja un rectángulo negro que cubre toda el área del lienzo

        // Establecer el color del círculo a blanco
        g.setColor(Color.WHITE);
        g.drawOval(10, 10, 200, 200);  // Dibuja un círculo de color blanco con un diámetro de 200px
    }
}
