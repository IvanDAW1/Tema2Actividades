package com.example.tema2actividades



fun main() {

    /*
    6. Desarrollar una función que solicite la carga de tres valores y muestre el menor. Desde la
    función main del programa llamar 2 veces a dicha función (sin utilizar una estructura
    repetitiva)
    */

    suma3()

}

fun suma3() {

    val numeros = Array(3) { 0 }

    println("Dime el primer numero")
    numeros[0] = readLine()?.toInt() ?: 0
    println("Dime el segundo numero")
    numeros[1] = readLine()?.toInt() ?: 0
    println("Dime el tercer numero")
    numeros[2] = readLine()?.toInt() ?: 0

    println("El numero mas pequeño es ${numeros.min()}")

}
