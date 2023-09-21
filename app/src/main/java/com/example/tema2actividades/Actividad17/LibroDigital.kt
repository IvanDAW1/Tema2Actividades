package com.example.tema2actividades.Actividad17

class LibroDigital(
    titulo: String, autor: String, añoPublicacion: Int, precio: Double, var formato: String
) : Libro(titulo, autor, añoPublicacion, precio) {

    override fun calcularPrecioDescuento(): Double {

        val precioDescuento = this.precio * 0.8
        return precioDescuento
    }


}