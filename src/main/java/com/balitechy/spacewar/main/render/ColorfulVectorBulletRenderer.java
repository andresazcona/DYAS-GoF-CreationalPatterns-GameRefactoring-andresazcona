package com.balitechy.spacewar.main.render;

import com.balitechy.spacewar.main.Bullet;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Clase encargada de renderizar las balas en un estilo gráfico vectorial colorido.
 * Esta implementación dibuja las balas con un color sólido azul y una forma ovalada.
 *
 * @author andresazcona
 */
public class ColorfulVectorBulletRenderer implements BulletRenderer {

    /**
     * Renderiza una bala en la posición especificada, dibujándola como un óvalo azul.
     *
     * @param g Objeto `Graphics` utilizado para dibujar en la pantalla.
     * @param x La posición X de la bala.
     * @param y La posición Y de la bala.
     */
    @Override
    public void render(Graphics g, double x, double y) {
        // Establecer el color de la bala a azul
        g.setColor(Color.BLUE);
        // Dibujar la bala como un óvalo en las coordenadas (x, y)
        g.fillOval((int) x, (int) y, Bullet.WIDTH, Bullet.HEIGHT);
    }
}
