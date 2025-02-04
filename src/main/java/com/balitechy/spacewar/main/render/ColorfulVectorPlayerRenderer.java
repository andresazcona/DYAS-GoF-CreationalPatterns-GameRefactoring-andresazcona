package com.balitechy.spacewar.main.render;

import com.balitechy.spacewar.main.Player;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Clase encargada de renderizar la nave del jugador en un estilo gráfico vectorial colorido.
 * Esta implementación dibuja la nave como un triángulo de color rojo.
 *
 * @author andresazcona
 */
public class ColorfulVectorPlayerRenderer implements PlayerRenderer {

    /**
     * Renderiza la nave del jugador en la posición especificada, dibujándola como un triángulo rojo.
     *
     * @param g Objeto `Graphics` utilizado para dibujar en la pantalla.
     * @param x La posición X de la nave.
     * @param y La posición Y de la nave.
     */
    @Override
    public void render(Graphics g, double x, double y) {
        // Establecer el color de la nave a rojo
        g.setColor(Color.RED);

        // Coordenadas del triángulo para representar la nave
        int[] xPoints = {(int) x, (int) (x + Player.WIDTH / 2), (int) (x + Player.WIDTH)};
        int[] yPoints = {(int) y, (int) (y - Player.HEIGHT), (int) y};

        // Dibujar el triángulo que representa la nave
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
