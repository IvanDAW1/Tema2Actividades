package com.example.tema2actividades

fun main() {
    println("Dime el primer numero")
    val num1 = readlnOrNull()?.toInt() ?: 0
    println("Dime el segundo numero")
    val num2 = readlnOrNull()?.toInt() ?: 0
    println("Dime el tercer numero")
    val num3 = readlnOrNull()?.toInt() ?: 0

    val promedio = promedio(num1, num2, num3)

}

fun promedio(num1: Int, num2: Int, num3: Int): Int {

    val promedio = (num1 + num2 + num3) / 3
    return promedio

}