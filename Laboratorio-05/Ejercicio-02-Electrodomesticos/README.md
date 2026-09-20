# Ejercicio 2: Control de consumo de electrodomésticos

## Enunciado

Implementar un programa que permita registrar los electrodomésticos existentes en una vivienda. De cada electrodoméstico se conoce su nombre, la cantidad de horas que se utiliza diariamente y su consumo de energía por hora.

Existen dos tipos de electrodomésticos:

* **Electrodoméstico de cocina:** además de los datos generales, se conoce la cantidad de días por semana que se utiliza. Su consumo semanal se obtiene multiplicando el consumo por hora, las horas de uso diario y los días de uso.
* **Electrodoméstico de entretenimiento:** además de los datos generales, se conoce la cantidad de personas que lo utilizan. Su consumo semanal se obtiene multiplicando el consumo por hora, las horas de uso diario y siete días.

Deberá crear una clase base `Electrodomestico` que almacene los datos comunes y declare el método `calcularConsumoSemanal()`.

Las clases `ElectrodomesticoCocina` y `ElectrodomesticoEntretenimiento` deberán heredar de `Electrodomestico` y sobrescribir el método `calcularConsumoSemanal()`.

También deberá crear una interfaz `Encendible` que declare los siguientes métodos:

* `encender()`
* `apagar()`

Cada tipo de electrodoméstico deberá implementar ambos métodos mostrando un mensaje apropiado.

El programa deberá almacenar los electrodomésticos en un arreglo de referencias de tipo `Electrodomestico` y utilizar polimorfismo para:

1. Mostrar la información y el consumo semanal de cada electrodoméstico.
2. Encender y apagar cada electrodoméstico mediante los métodos de la interfaz.
3. Determinar el electrodoméstico con mayor consumo semanal.
4. Calcular el consumo semanal total de la vivienda.

**Restricción:** No se permite utilizar colecciones de Java.
