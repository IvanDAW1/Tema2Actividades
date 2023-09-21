package com.example.tema2actividades

fun main() {

    println("Hay = ${edadMayores(3, 5, 6, 72)} mayores de edad")
    println("Hay = ${edadMayores(3, 25, 6, 17, 4, 3, 20, 1)} mayores de edad")

}

fun edadMayores(vararg edades: Int): Int {

    var count = 0;

    for (edad in edades) {
        if (edad >= 18) {
            count++
        }
    }

    return count;

}
