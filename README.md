# Conversor de Monedas

Este es un proyecto de consola desarrollado en Java que permite convertir entre diferentes monedas usando datos en tiempo real obtenidos de la API de Exchange Rate.

## Características

- Conversión entre varias monedas incluyendo USD, CLP, BRL, ARS, y COP.
- Datos de conversión actualizados en tiempo real mediante la API de Exchange Rate.
- Interfaz de usuario simple basada en consola.

## Requisitos

- Java 17 o superior
- Maven
- Dependencias:
  - [Gson](https://github.com/google/gson): para el manejo de JSON.

## Instalación

1. Clona este repositorio:

    ```bash
    git clone https://github.com/usuario/conversor-monedas.git
    ```

2. Navega al directorio del proyecto:

    ```bash
    cd conversor-monedas
    ```

3. Asegúrate de tener Maven instalado y ejecuta:

    ```bash
    mvn clean install
    ```

4. Corre el programa desde la línea de comandos o desde un IDE como IntelliJ IDEA.

## Uso

1. Al ejecutar el programa, se mostrará un menú en la consola con opciones para convertir entre diferentes monedas.
2. Selecciona una opción ingresando el número correspondiente.
3. Ingresa la cantidad de dinero que deseas convertir.
4. El programa mostrará el monto convertido en la moneda seleccionada.

## Estructura del Proyecto

- `src/main/java/com/alura/convertcurrency`
  - `MenuConvertCurrency.java`: Clase principal que muestra el menú y maneja la interacción con el usuario.
  - `HandlerConvertCurrency.java`: Clase que se encarga de realizar las conversiones de moneda utilizando la API.
- `pom.xml`: Archivo de configuración de Maven que incluye las dependencias necesarias.

## API Utilizada

Este proyecto utiliza la API de [Exchange Rate](https://www.exchangerate-api.com/) para obtener las tasas de cambio actualizadas.

## Contribuciones

Las contribuciones son bienvenidas. Siéntete libre de enviar un Pull Request o reportar problemas en la sección de Issues.

## Licencia

Este proyecto está licenciado bajo la MIT License. Para más detalles, consulta el archivo `LICENSE`.

## Contacto

Para cualquier consulta o sugerencia, por favor contacta a [tu-email@example.com].