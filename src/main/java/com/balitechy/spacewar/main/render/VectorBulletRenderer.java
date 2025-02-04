package com.balitechy.spacewar.main.render;

import com.balitechy.spacewar.main.Bullet;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Clase que implementa la interfaz `BulletRenderer` para renderizar las balas
 * utilizando gráficos vectoriales simples. Las balas se representan como círculos
 * de color blanco.
 *
 * @author andresazcona
 */
public class VectorBulletRenderer implements BulletRenderer {

    /**
     * Método que renderiza una bala en el lienzo.
     * La bala se dibuja como un círculo blanco utilizando sus coordenadas de posición.
     *
     * @param g el objeto `Graphics` usado para dibujar en el lienzo.
     * @param x la coordenada X de la bala.
     * @param y la coordenada Y de la bala.
     */
    @Override
    public void render(Graphics g, double x, double y) {
        // Establecer el color de la bala a blanco
        g.setColor(Color.WHITE);
        // Dibuja una forma ovalada (en este caso, un círculo) en las coordenadas especificadas
        g.fillOval((int) x, (int) y, Bullet.WIDTH, Bullet.HEIGHT);
    }
}
