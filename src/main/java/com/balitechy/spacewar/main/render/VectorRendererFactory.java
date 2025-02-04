package com.balitechy.spacewar.main.render;

/**
 * Clase que implementa la interfaz `RendererFactory` y crea los renderizadores
 * correspondientes para los elementos del juego (jugador, balas y fondo) utilizando
 * gráficos vectoriales.
 *
 * Los renderizadores generados por esta clase son para representar al jugador, las
 * balas y el fondo en un estilo gráfico sencillo, utilizando líneas y formas
 * vectoriales.
 *
 * @author andresazcona
 */
public class VectorRendererFactory implements RendererFactory {

    /**
     * Crea un renderizador para el jugador usando gráficos vectoriales.
     *
     * @return un objeto `PlayerRenderer` que dibuja al jugador como un triángulo
     *         blanco en el lienzo.
     */
    @Override
    public PlayerRenderer createPlayerRenderer() {
        return new VectorPlayerRenderer();  // Renderizador vectorial para el jugador
    }

    /**
     * Crea un renderizador para las balas utilizando gráficos vectoriales.
     *
     * @return un objeto `BulletRenderer` que dibuja las balas como círculos blancos
     *         en el lienzo.
     */
    @Override
    public BulletRenderer createBulletRenderer() {
        return new VectorBulletRenderer();  // Renderizador vectorial para las balas
    }

    /**
     * Crea un renderizador para el fondo utilizando gráficos vectoriales.
     *
     * @return un objeto `BackgroundRenderer` que dibuja el fondo con un color negro
     *         y un círculo blanco como parte del diseño.
     */
    @Override
    public BackgroundRenderer createBackgroundRenderer() {
        return new VectorBackgroundRenderer();  // Renderizador vectorial para el fondo
    }
}
