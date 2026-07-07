# Travelizer — Agencia de viajes (Java Swing)

Aplicación de escritorio para una agencia de viajes ficticia: gestiona reservas de
alojamientos y entradas a parques temáticos, con una interfaz gráfica completa hecha con
Java Swing. Proyecto realizado en la asignatura de Comunicación Persona-Máquina (Ingeniería
del Software).

## Qué hace

- Alta de reservas de alojamiento (con selector de fechas) y de entradas a parques temáticos,
  combinables en una misma reserva.
- Cálculo automático de precio según tipo de alojamiento, número de noches, adultos/niños y
  descuentos aplicables.
- Interfaz completamente internacionalizada (español / inglés) mediante ficheros
  `.properties`, sin cadenas de texto hardcodeadas en el código.
- Sistema de ayuda integrado en la propia aplicación (JavaHelp), con contenido navegable en
  HTML.
- Selector de fecha con calendario visual (librería JCalendar) y look & feel personalizado
  (JGoodies) en vez del Swing por defecto.
- Un minijuego adicional (tablero tipo "oca") como funcionalidad extra sobre la base de Swing.

## Estructura del proyecto

```
src/uo/cpm/modulo/
  Main.java                    punto de entrada
  model/                       Alojamiento, ParqueTematico, Reserva, carga de datos
  service/                     Agencia — lógica de negocio (reservas, cálculo de precio)
  ui/                          VentanaPrincipal y paneles dinámicos (Swing)
  util/                        utilidades de fichero
  juego/                       minijuego de tablero (model + service)
  textos_es.properties         textos de la interfaz en español
  textos_en.properties         textos de la interfaz en inglés
files/                         datos de ejemplo (alojamientos y parques)
help/                          sistema de ayuda JavaHelp (HTML + índice de búsqueda)
lib/                           dependencias de terceros necesarias para compilar/ejecutar
```

## Cómo ejecutarlo

Requiere JDK 8+.

1. Importa la carpeta como proyecto Java en Eclipse (o tu IDE preferido), añadiendo los
   `.jar` de `lib/` al classpath.
2. Ejecuta `src/uo/cpm/modulo/Main.java`.

> Nota: para mantener el repositorio ligero, no se incluyen las imágenes de contenido
> (fotos de alojamientos y parques) que la aplicación carga en tiempo de ejecución — el
> proyecto compila y se navega igualmente, pero algunos paneles mostrarán las imágenes
> vacías sin esos recursos.

## Qué me llevo de este proyecto

Separación clara entre modelo, lógica de negocio e interfaz en una aplicación Swing de
tamaño real (no un ejemplo de un solo fichero), trabajar con librerías de terceros dentro de
un proyecto Java "a mano" (sin gestor de dependencias), e implementar internacionalización e
integración de un sistema de ayuda completo desde cero.
