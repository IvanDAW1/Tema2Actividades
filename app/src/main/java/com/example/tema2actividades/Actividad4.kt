package com.example.tema2actividades

fun main() {

    /*
        4. Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad
        que lleva el cliente. Mostrar lo que debe abonar el comprador.
    */

    println("Dime el precio del articulo")
    val precio = readLine()?.toFloat() ?: 0.00F

    println("Dime la cantidad de ese articulo")
    val cantidad = readLine()?.toInt() ?: 0

    println("El precio a pagar seria de : ${precio*cantidad}")

}