package com.example.tema2actividades

fun main() {

    println("Dime el primer numero")
    val num1 = readlnOrNull()?.toInt() ?: 0
    println("Dime el segundo numero")
    val num2 = readlnOrNull()?.toInt() ?: 0

    if (esMayorQue(num1, num2)) {
        println("El primer numero es mayor que el segundo")
    } else {
        println("El segundo numero es mayor que el primero")
    }

}

fun esMayorQue(num1: Int, num2: Int): Boolean {

    if (num1 > num2)
        return true;
    return false;
}
