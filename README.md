# Proyecto Registro de Equipos - TODO PC

## Descripción

Este proyecto permite registrar y visualizar diferentes tipos de equipos (Desktops, Laptops y Tablets) que ofrece TODO PC en venta. El proyecto está desarrollado en Java, utilizando programación orientada a objetos y la biblioteca Swing para la interfaz gráfica.

## Características

- Registro de diferentes tipos de equipos: Desktops, Laptops y Tablets.
- Visualización de los equipos registrados.
- Validación de los datos ingresados para evitar campos vacíos.
- Interfaz gráfica sencilla y fácil de usar.

## Estructura de las Clases

- **Clase Equipo**: Clase base que define los atributos y métodos comunes a todos los tipos de equipos.
- **Clase Desktop**: Subclase de `Equipo` que define los atributos específicos de los equipos de tipo Desktop.
- **Clase Laptop**: Subclase de `Equipo` que define los atributos específicos de los equipos de tipo Laptop.
- **Clase Tablet**: Subclase de `Equipo` que define los atributos específicos de los equipos de tipo Tablet.
- **Clase Principal**: Clase que contiene el método `main` y que controla la interfaz gráfica y la interacción con el usuario.

## Cómo Usar

1. **Registrar un Equipo**
   - Selecciona la opción 'Registrar equipo' en el menú principal.
   - Elige el tipo de equipo que deseas registrar (Desktop, Laptop, Tablet).
   - Ingresa los detalles del equipo en los campos proporcionados.
   
2. **Ver Equipos Registrados**
   - Selecciona la opción 'Ver equipos' en el menú principal.
   - Elige el tipo de equipo que deseas visualizar (Desktop, Laptop, Tablet).
   - Se mostrarán los detalles de todos los equipos registrados de ese tipo.

3. **Salir**
   - Selecciona la opción 'Salir' en el menú principal para cerrar la aplicación.

## Requisitos

- Java SE 8 o superior.

## Contribuyentes

- Persona 1
- Persona 2
- Persona 3
- Persona 4
- Persona 5

## Licencia

Este proyecto está bajo la licencia MIT. Consulte el archivo [LICENSE.md](LICENSE.md) para obtener detalles.
