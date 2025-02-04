package com.balitechy.spacewar.main.render;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Clase encargada de renderizar el fondo utilizando gráficos vectoriales coloridos.
 * Esta implementación dibuja un fondo gris oscuro y un círculo amarillo sin relleno
 * en la parte superior izquierda de la pantalla.
 *
 * @author andresazcona
 */
public class ColorfulVectorBackgroundRenderer implements BackgroundRenderer {

    /**
     * Renderiza el fondo de la pantalla con un color de fondo gris oscuro y un círculo amarillo
     * en la parte superior izquierda de la pantalla.
     *
     * @param g Objeto `Graphics` utilizado para dibujar en el lienzo.
     * @param c El lienzo (Canvas) sobre el que se realiza el dibujo.
     */
    @Override
    public void render(Graphics g, Canvas c) {
        // Establecer el color de fondo a gris oscuro
        g.setColor(new Color(30, 30, 30));
        // Rellenar el lienzo con el color gris oscuro
        g.fillRect(0, 0, c.getWidth(), c.getHeight());

        // Establecer el color para el círculo a amarillo
        g.setColor(Color.YELLOW);
        // Dibujar el círculo sin relleno en la parte superior izquierda
        g.drawOval(10, 10, 200, 200);  // Círculo de 200px de diámetro en la posición (10, 10)
    }
}
