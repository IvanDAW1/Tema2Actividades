package com.example.tema2actividades

fun main() {

    var numero = 0
    var iguales = 0
    var distintos = 0

    for (i in 0 until 10) {
        println("Dime el numero ${i+1}")
        numero = readLine()?.toInt() ?: 0

        when (numero) {
            0 -> iguales++
            else -> distintos++
        }

    }

    println("Valores iguales a 0 ${iguales}")
    println("Valores distintos a 0 ${distintos}")

}