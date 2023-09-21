package com.example.tema2actividades

fun main() {

    val arreglo1 = intArrayOf(1, 2, 3, 4)
    val arreglo2 = intArrayOf(1, 2, 3, 4)
    val arreglo3 = IntArray(4);

    for (i in 0 until arreglo1.size) {
        arreglo3[i] = arreglo1[i] + arreglo2[i]
    }

    println("El arreglo resultante es: ${arreglo3.joinToString(", ")}")
}