package com.balitechy.spacewar.main.utils;

import com.balitechy.spacewar.main.render.RendererFactory;
import com.balitechy.spacewar.main.render.SpriteRendererFactory;
import com.balitechy.spacewar.main.render.VectorRendererFactory;
import com.balitechy.spacewar.main.render.ColorfulVectorRendererFactory;

/**
 * Clase encargada de gestionar la configuración del juego, proporcionando
 * una fábrica de renderizadores según el estilo de renderización solicitado.
 *
 * @author andresazcona
 */
public class Config {

    /**
     * Método estático que devuelve una fábrica de renderizadores según el estilo
     * de renderización proporcionado.
     *
     * @param style El estilo de renderización solicitado. Puede ser "sprite",
     *              "vector" o "colorful-vector".
     * @return Una instancia de `RendererFactory` correspondiente al estilo seleccionado.
     * @throws IllegalArgumentException Si el estilo proporcionado no es válido.
     */
    public static RendererFactory getRendererFactory(String style) {
        // Selecciona la fábrica de renderizadores basada en el estilo proporcionado
        switch (style) {
            case "sprite":
                return new SpriteRendererFactory(); // Fábrica para renderizado de sprites
            case "vector":
                return new VectorRendererFactory(); // Fábrica para renderizado vectorial
            case "colorful-vector":
                return new ColorfulVectorRendererFactory(); // Fábrica para renderizado vectorial colorido
            default:
                // Si el estilo no es válido, lanza una excepción
                throw new IllegalArgumentException("Estilo no válido: " + style);
        }
    }
}
