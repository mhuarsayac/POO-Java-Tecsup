# Ejercicio 1: Gestión de envíos de una empresa de mensajería

## Enunciado

Implementar un programa que permita registrar los envíos realizados por una empresa de mensajería. De cada envío se conoce el código, el peso del paquete en kilogramos y la distancia del recorrido en kilómetros.

La empresa trabaja con dos tipos de envíos:

* **Envío terrestre:** además de los datos generales, se conoce si requiere entrega prioritaria. Su costo se calcula multiplicando el peso por S/ 4 y la distancia por S/ 0.50.
* **Envío aéreo:** además de los datos generales, se conoce el costo del seguro. Su costo se calcula multiplicando el peso por S/ 8 y la distancia por S/ 1.20, y se agrega el costo del seguro.

Deberá crear una clase base `Envio` que almacene los datos comunes y declare el método `calcularCosto()`.

Las clases `EnvioTerrestre` y `EnvioAereo` deberán heredar de `Envio` y sobrescribir el método `calcularCosto()` de acuerdo con las reglas indicadas.

También deberá crear una interfaz `Rastreable` que declare el método `mostrarSeguimiento()`. Cada tipo de envío deberá implementar este método para mostrar su información y costo final.

El programa deberá almacenar como máximo 50 envíos en un arreglo de referencias de tipo `Envio` y utilizar polimorfismo para:

1. Mostrar la información y el costo de todos los envíos.
2. Determinar el envío con mayor costo.
3. Calcular el monto total obtenido por todos los envíos registrados.

**Restricción:** No se permite utilizar colecciones ni mecanismos de ordenamiento o búsqueda proporcionados por defecto por Java.
