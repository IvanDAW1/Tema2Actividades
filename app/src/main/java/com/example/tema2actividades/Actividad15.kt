package com.example.tema2actividades

fun main() {

    println("Dime de que tamaño quieres el array ")
    val n = readLine()?.toInt() ?: 0
    val arreglo = IntArray(n);
    var total = 0;

    for (i in 0 until arreglo.size) {
        println("Dime el valor del elemento ${i + 1} del array")
        arreglo[i] = readLine()?.toInt() ?: 0

    }

    for (i in 0 until arreglo.size) {
        total += arreglo[i]

    }

    println("La suma del array es ${total}")

}