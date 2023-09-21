package com.example.tema2actividades

fun main() {

    /*
        3. Escribir un programa en el cual se ingresen cuatro números enteros, calcular e informar la
        suma de los dos primeros y el producto del tercero y el cuarto. Realizar los cálculos en el
        mismo print.
    */

    print("Ingrese el primer número entero: ")
    val num1 = readLine()?.toInt() ?: 0

    print("Ingrese el segundo número entero: ")
    val num2 = readLine()?.toInt() ?: 0

    print("Ingrese el tercer número entero: ")
    val num3 = readLine()?.toInt() ?: 0

    print("Ingrese el cuarto número entero: ")
    val num4 = readLine()?.toInt() ?: 0

    println()
    println("Suma de los 2 primeros numeros es ${num1 + num2}")
    println("El producto del numero $num3 y el numero $num4 es ${num3 * num4}")

}