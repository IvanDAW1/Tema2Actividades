package com.example.tema2actividades


fun main() {

    /*
    5. Desarrollar un programa con dos funciones. La primera que solicite el ingreso de un entero
    y muestre el cuadrado de dicho valor. La segunda que solicite la carga de dos valores y
    muestre el producto de los mismos. Llamar desde la main a ambas funciones.
     */

    cuadrado()
    producto()

}

fun producto() {

    println("Dime un numero")
    val numero1 = readLine()?.toInt() ?: 0
    println("Dime otro numero")
    val numero2 = readLine()?.toInt() ?: 0

    println("El producto de ambos numeros es ${numero1 * numero2}")
}

fun cuadrado() {

    println("Dime un entero")
    val numero1 = readLine()?.toInt() ?: 0

    println("El cuadrado de $numero1 = ${numero1 * numero1}")
}
