package com.example.tema2actividades.Actividad17

open class Libro(
    private var titulo: String,
    private var autor: String,
    private var añoPublicacion: Int,
    protected var precio: Double
) {

    override fun toString(): String {
        return "Libro(titulo='$titulo', autor='$autor', añoPublicacion=$añoPublicacion, precio=$precio)"
    }

    open fun calcularPrecioDescuento(): Double {

        val precioDescuento = this.precio * 0.9
        return precioDescuento

    }



}

