package com.example.tema2actividades

fun main() {

    println("Dime una clave")
    val clave1 = readlnOrNull()
    println("Escribe otra vez la misma clave")
    val clave2 = readlnOrNull()
    conprobarClave(clave1, clave2)

}

fun conprobarClave(clave1: String?, clave2: String?) {

    if (clave1.equals(clave2))
        println("Las 2 claves son iguales")
    else
    println("Las 2 claves son distintas")
}
