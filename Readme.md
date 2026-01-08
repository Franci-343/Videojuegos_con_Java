
Videojuegos_con_Java
=====================

Mini colección de ejemplos en Java para aprender a mover, pintar y manejar eventos en ventanas.

**Descripción:**: Pequeños programas independientes que muestran animaciones, manejo de teclado, dibujo y trabajo con imágenes para que puedas implementarlas
en tus videojuegos con Java.

**Requisitos:**: Java JDK 21 (Eclipse Adoptium) recomendado; el proyecto fue probado con JDK 21. Un IDE como Eclipse o ejecución desde línea de comandos usando la carpeta `bin` ya compilada.

**Estructura del proyecto:**
- **src:** código fuente Java organizado por paquetes (p. ej. `animacionBola`, `disparar`, `pintar`, `ventana`, ...).
- **bin:** clases compiladas (útil para ejecutar directamente sin recompilar).

**Descripción de cada archivo:**

## Ventanas básicas

### ventana/MiVentana.java
Ventana básica que muestra cómo crear un JFrame y dibujar figuras geométricas simples (rectángulo, óvalo, rectángulo redondeado) con diferentes colores usando el método `paint()`. Introduce los conceptos fundamentales de Swing y Graphics.

## Texto

### textos/MostrarTextos.java
Demuestra cómo mostrar texto en una ventana con diferentes fuentes (Comic Sans MS y Arial), estilos (negrita, cursiva) y colores. Muestra mensajes de bienvenida personalizados.

### moverTexto/TextoMovimiento.java
Animación de texto que se desplaza horizontalmente por la pantalla usando hilos (Thread) y doble buffer para evitar parpadeos. El texto "Texto en Movimiento" se mueve continuamente de izquierda a derecha con anti-aliasing.

## Figuras y emojis

### emoji/Carita.java
Dibuja una carita (emoji) usando figuras geométricas básicas: óvalos para la cara, ojos y boca con diferentes colores. Ejemplo simple de cómo combinar formas para crear gráficos.

### pintar/PintaJava.java
Aplicación interactiva que permite "pintar" en la ventana siguiendo el movimiento del mouse. Implementa `MouseMotionListener` para capturar las coordenadas del cursor y dibujar círculos negros pequeños.

## Imágenes

### mostrarImagen/MostrarImagen.java
Ejemplo básico de cómo cargar y mostrar una imagen (Duke256.png) en una ventana usando `ImageIO`. Incluye manejo de errores si la imagen no se puede cargar.

### moverImagen/DukeMueve.java
Animación de una imagen (Duke) que se mueve automáticamente en diagonal por la pantalla. Utiliza hilos y doble buffer (double buffering) para una animación fluida. Demuestra el sistema de coordenadas de Java (Y negativo va hacia arriba).

## Animaciones con rebote

### animacionBola/RebotaPantalla.java
Simulación de una bola (imagen de Eclipse) que rebota por los bordes de la ventana. Implementa física simple de rebote detectando colisiones con los límites de la pantalla y cambiando la dirección del movimiento.

## Interacción con teclado

### movimientoTeclado/dukeMovimiento.java
Control de un personaje (Duke) usando las teclas de flecha. Implementa `KeyListener` para detectar las pulsaciones del teclado y mover la imagen en las cuatro direcciones (arriba, abajo, izquierda, derecha).

### disparar/DukeDispara.java
Juego simple donde Duke puede disparar un proyectil (bola) al presionar cualquier tecla. Combina animación con hilos y manejo de eventos del teclado para crear una interacción básica de disparo.
