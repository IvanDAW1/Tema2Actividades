package com.example.tema2actividades.Actividad17

fun main() {

    val libro: Libro = Libro("Juego", "Pepe", 2021, 30.00)
    val libroDigital: LibroDigital = LibroDigital("Lolo", "Pepe", 2023, 30.00, "PDF")

    println("El precio con descuento del libro es : " + libro.calcularPrecioDescuento())
    println("El precio con descuento del libro es : " + libroDigital.calcularPrecioDescuento())

}