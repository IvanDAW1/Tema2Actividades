package com.example.tema2actividades

fun main() {

    println("Hay ${edadMayores(3, 5, 6, 72)} mayores de edad")
    println("Hay ${edadMayores2(3, 25, 6, 17, 4, 3, 20, 1)} mayores de edad")
    println("Hay ${edadMayores()} mayores de edad")

}

// vararg Cuando no sabemos cuantos argumentos le vamos a pasar

fun edadMayores(vararg edades: Int): Int {

    var count = 0;

    for (edad in edades) {
        if (edad >= 18) {
            count++
        }
    }

    return count;

}
fun edadMayores2(vararg  edades: Int) = edades.count{ it >= 18}