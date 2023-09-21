package com.example.tema2actividades

fun main() {

    println("Dime el primer numero")
    val num1 = readlnOrNull()?.toInt() ?: 0
    println("Dime el segundo numero")
    val num2 = readlnOrNull()?.toInt() ?: 0

    if ((num1 esMayorQue2 num2)) {
        println("El primer numero es mayor que el segundo")
    } else {
        println("El segundo numero es mayor que el primero")
    }

}

infix fun Int.esMayorQue2(num2: Int): Boolean{
    return this > num2;
}