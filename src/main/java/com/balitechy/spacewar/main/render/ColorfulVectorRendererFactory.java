package com.balitechy.spacewar.main.render;

/**
 * Fábrica que crea los renderizadores correspondientes para el estilo gráfico vectorial colorido.
 * Esta fábrica es responsable de crear los renderizadores para el jugador, las balas y el fondo,
 * utilizando un enfoque gráfico colorido.
 *
 * @author andresazcona
 */
public class ColorfulVectorRendererFactory implements RendererFactory {

    /**
     * Crea un renderizador para el jugador utilizando un estilo gráfico vectorial colorido.
     *
     * @return Un objeto de tipo `PlayerRenderer`, que es un renderizador vectorial colorido.
     */
    @Override
    public PlayerRenderer createPlayerRenderer() {
        return new ColorfulVectorPlayerRenderer();  // Renderizador vectorial colorido para el jugador
    }

    /**
     * Crea un renderizador para las balas utilizando un estilo gráfico vectorial colorido.
     *
     * @return Un objeto de tipo `BulletRenderer`, que es un renderizador vectorial colorido para las balas.
     */
    @Override
    public BulletRenderer createBulletRenderer() {
        return new ColorfulVectorBulletRenderer();  // Renderizador vectorial colorido para las balas
    }

    /**
     * Crea un renderizador para el fondo utilizando un estilo gráfico vectorial colorido.
     *
     * @return Un objeto de tipo `BackgroundRenderer`, que es un renderizador vectorial colorido para el fondo.
     */
    @Override
    public BackgroundRenderer createBackgroundRenderer() {
        return new ColorfulVectorBackgroundRenderer();  // Renderizador vectorial colorido para el fondo
    }
}
