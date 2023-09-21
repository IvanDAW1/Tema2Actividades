package com.example.tema2actividades

fun main() {
    println("Dime el primer numero")
    val num1 = readlnOrNull()?.toInt() ?: 0
    println("Dime el segundo numero")
    val num2 = readlnOrNull()?.toInt() ?: 0
    println("Dime el tercer numero")
    val num3 = readlnOrNull()?.toInt() ?: 0

    ordenar(num1, num2, num3)
}

fun ordenar(num1: Int, num2: Int, num3: Int) {

    val numerosOrdenados = listOf(num1, num2, num3).sorted()
    println("Numeros Ordenados $numerosOrdenados")

}
