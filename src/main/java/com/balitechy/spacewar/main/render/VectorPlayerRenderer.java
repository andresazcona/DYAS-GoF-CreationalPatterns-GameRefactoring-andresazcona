package com.balitechy.spacewar.main.render;

import com.balitechy.spacewar.main.Player;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Clase que implementa la interfaz `PlayerRenderer` para renderizar al jugador
 * utilizando gráficos vectoriales simples. El jugador se representa como un triángulo
 * de color blanco.
 *
 * @author andresazcona
 */
public class VectorPlayerRenderer implements PlayerRenderer {

    /**
     * Método que renderiza al jugador en el lienzo.
     * El jugador se dibuja como un triángulo blanco utilizando las coordenadas
     * de posición especificadas para la nave.
     *
     * @param g el objeto `Graphics` usado para dibujar en el lienzo.
     * @param x la coordenada X de la nave.
     * @param y la coordenada Y de la nave.
     */
    @Override
    public void render(Graphics g, double x, double y) {
        // Establecer el color de la nave a blanco
        g.setColor(Color.WHITE);

        // Coordenadas del triángulo que representa la nave
        int[] xPoints = {(int) x, (int) (x + Player.WIDTH / 2), (int) (x + Player.WIDTH)};
        int[] yPoints = {(int) y, (int) (y - Player.HEIGHT), (int) y};

        // Dibuja el triángulo que representa la nave
        g.fillPolygon(xPoints, yPoints, 3);  // Dibuja un triángulo con las coordenadas calculadas
    }
}
