package com.example.tema2actividades

fun main() {
    println("La suma de estos numeros es = ${suma(3, 5, 6, 7)}")
    println("La suma de estos numeros es = ${suma(3, 5, 6, 7, 4, 3, 2, 1)}")

}

fun suma(vararg numeros: Int): Int {

    var suma = 0
    for (numero in numeros) {
        suma += numero
    }
    return suma

}
