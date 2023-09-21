package com.example.tema2actividades

fun main() {

    val numeros1 = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numeros2 = intArrayOf(1, 5, 3, 4, 5, 3, 7, 8, 9, 10)

    if (estaOrdenado(numeros1)) {
        println("El array esta ordenado")
    } else {
        println("El array no esta ordenado")

    }

    if (estaOrdenado(numeros2)) {
        println("El array esta ordenado")

    } else {
        println("El array no esta ordenado")

    }

}

fun estaOrdenado(numeros1: IntArray): Boolean {
    for (i in 1 until numeros1.size) {
        if (numeros1[i] < numeros1[i - 1]) {
            return false
        }
    }
    return true
}
