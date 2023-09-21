package com.example.tema2actividades

fun main() {

    /*
    1. Definir una variable inmutable con el valor 50 que representa el lado de un cuadrado, en
    otras dos variables inmutables almacenar la superficie y el perímetro del cuadrado.
    Mostrar la superficie y el perímetro en la Consola.
    */

    val lado = 50;
    val superficie = lado * lado;
    val perimetro = lado * 4;

    println("La superficie del cuadrado es $superficie ")
    println("\nEl perimetro del cuadrado es $perimetro")
}