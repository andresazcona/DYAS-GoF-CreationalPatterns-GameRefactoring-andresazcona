# Taller 1 - PARTE 2: Refactoring de Codigo Real
*Universidad de la Sabana - Diseño y Arquitectura de Software*

# SpaceWar: Juego de Naves Espaciales  


## Descripción del Proyecto  
Este proyecto implementa un juego de naves espaciales utilizando el patrón de diseño **Fábrica Abstracta** y diferentes estrategias de renderización (vectorial, sprites, y renderizado colorido). El juego permite controlar una nave espacial que dispara balas y navega en un fondo dinámico, todo renderizado de acuerdo con el estilo seleccionado.  

## Requisitos del Proyecto  
El sistema debe:  

- Permitir al jugador controlar una nave espacial (moverse y disparar).  
- Permitir disparar balas en la pantalla y que estas se muevan en línea recta.  
- Tener un fondo dinámico que cambie con el estilo de renderización.  
- Usar diferentes estrategias de renderización: vectorial, sprites y colorido vectorial.  
- Implementar el patrón **Fábrica Abstracta** para separar la creación de los elementos gráficos del resto de la lógica del juego.  

## Implementación  

### Patrón de Fábrica Abstracta  
El Patrón de **Fábrica Abstracta** se implementa para desacoplar la lógica del juego de las estrategias de renderización. Esto permite que el juego soporte diferentes estilos de renderización sin modificar el código del juego.  

### Estructura del Proyecto  

#### Interfaces:  
- **BulletRenderer**: Define el método `render(Graphics g, double x, double y)` para renderizar las balas.  
- **BackgroundRenderer**: Define el método `render(Graphics g, Canvas c)` para renderizar el fondo.  
- **PlayerRenderer**: Define el método `render(Graphics g, double x, double y)` para renderizar la nave espacial.  
- **RendererFactory**: Define métodos para crear los renderizadores correspondientes (jugador, bala, fondo).  

#### Fábricas Concretas:  
- **ColorfulVectorRendererFactory**: Crea instancias de `ColorfulVectorPlayerRenderer`, `ColorfulVectorBulletRenderer` y `ColorfulVectorBackgroundRenderer`.  
- **SpriteRendererFactory**: Crea instancias de `SpritePlayerRenderer`, `SpriteBulletRenderer` y `SpriteBackgroundRenderer`.  
- **VectorRendererFactory**: Crea instancias de `VectorPlayerRenderer`, `VectorBulletRenderer` y `VectorBackgroundRenderer`.  

#### Implementaciones Concretas:  
- `ColorfulVectorPlayerRenderer`, `ColorfulVectorBulletRenderer`, `ColorfulVectorBackgroundRenderer`.  
- `SpritePlayerRenderer`, `SpriteBulletRenderer`, `SpriteBackgroundRenderer`.  
- `VectorPlayerRenderer`, `VectorBulletRenderer`, `VectorBackgroundRenderer`.  

### Lógica del Juego  
El juego permite al jugador:  
- Controlar la nave espacial mediante las teclas de dirección.  
- Disparar balas que se mueven en la pantalla.  
- Ver el fondo y los elementos gráficos renderizados de acuerdo con el estilo seleccionado.  

### Menú de Estilo de Renderización  
El jugador puede elegir entre tres estilos de renderización:  
1. **Vectorial**: Estilo minimalista y simple.  
2. **Sprites**: Renderizado con imágenes de sprites.  
3. **Colorido Vectorial**: Estilo vectorial con colores llamativos.  

## Ejemplo de Uso  
1. Al ejecutar el juego, el jugador selecciona el estilo de renderización.  
2. La nave espacial y las balas se renderizan según el estilo seleccionado.  
3. El jugador puede mover la nave y disparar balas.  

### Ejecución del Programa  
```bash
Seleccione el estilo de renderización:  
1. Vectorial  
2. Sprites  
3. Colorido Vectorial  
Ingrese su opción: 1  
Comenzando el juego con renderizado vectorial...
```

## Diagrama UML

A continuación se muestra el diagrama UML del sistema:

![Diagrama UML](UML.png)

---
## Cómo Ejecutar el Proyecto

1. Clona el repositorio.
2. Abre el proyecto en tu IDE favorito.
3. Ejecuta la clase `Game` para iniciar el menú interactivo.

---

## Extensibilidad

El sistema está diseñado para ser fácilmente extensible. Para agregar un nuevo tipo de pizza:

1. Crea una nueva clase que implemente `PlayerRenderer`, `BulletRenderer` y `BackgroundRenderer`.
2. Crea una nueva fábrica que implemente `RendererFactory` y que cree las instancias correspondientes de los renderizadores.
3. Agrega la nueva opción al menú de selección de estilo de renderización.
---



**Andrés Azcona**  
*Estudiante de Ingenieria Informatica*  
Universidad de La Sabana
