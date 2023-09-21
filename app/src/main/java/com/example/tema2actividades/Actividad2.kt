package com.example.tema2actividades

fun main() {

    /*
        2. Definir tres variables inmutables y cargar por asignación los pesos de tres personas con
        valores Float. Calcular el promedio de pesos de las personas y mostrarlo. Mostrar también
        el promedio redondeado a 2 cifras.
    */

    val peso1 = 68.1F
    val peso2 = 72.4F
    val peso3 = 57.3F

    val pesoMedio = (peso1 + peso2 + peso3) / 3;

    val numeroRedondeado = Math.round(pesoMedio * 100.0)/100.0

    //val numeroRedondeado = String.format("%.2f", pesoMedio)

    println("Peso medio: $pesoMedio")
    println("Número redondeado a 2 decimales: $numeroRedondeado")

}