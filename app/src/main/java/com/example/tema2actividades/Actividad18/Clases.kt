package com.example.tema2actividades.Actividad18

fun buscarPrioridad(nuevaPrioridadStr: String): Prioridad {

    val nuevaPrioridad = when (nuevaPrioridadStr) {
        "ALTA" -> Prioridad.ALTA
        "MEDIA" -> Prioridad.MEDIA
        "BAJA" -> Prioridad.BAJA
        else -> Prioridad.BAJA
    }

    return nuevaPrioridad;
}

fun agregarTarea(listaMutable: MutableList<Tarea>) {

    println("Dime el nombre de la tarea")
    var nombre = readLine()?.toString() ?: "aaa4"
    println("Dime la descripcion de la tarea")
    var descripcion = readLine()?.toString() ?: "Base"
    println("Dime la prioridad de la tarea")
    var PrioridadStr = readLine()?.uppercase() ?: "BAJA"
    var prioridad = buscarPrioridad(PrioridadStr)

    val nuevaTarea: Tarea = Tarea(nombre, descripcion, prioridad, false)

    listaMutable.add(nuevaTarea)
}

fun modificarTarea(
    listaTareas: MutableList<Tarea>
) {
    println("Dime el nombre de la tarea a modificar")
    var nombre = readLine()?.toString() ?: "aaa1"

    val tareaAModificar = listaTareas.find { tarea -> tarea.nombre == nombre }

    if (tareaAModificar != null) {

        println("TAREA ENCONTRADA!! DIME LOS DATOS")
        println("Dime la nueva descripcion de la tarea")
        var nuevaDescripcion = readLine()?: "Base"
        println("Dime la nueva prioridad de la tarea")
        val nuevaPrioridadStr = readLine()?.uppercase() ?: "BAJA"
        val nuevaPrioridad = buscarPrioridad(nuevaPrioridadStr)

        tareaAModificar?.apply {
            descripcion = nuevaDescripcion
            prioridad = nuevaPrioridad
        }
    }
}

fun listarTareasPorPrioridad(listaMutable: MutableList<Tarea>): List<Tarea> {
    println("Dime la nueva prioridad por la que filtrar")
    val nuevaPrioridadStr = readLine()?.uppercase() ?: "BAJA"
    val prioridad = buscarPrioridad(nuevaPrioridadStr)

    val tareasFiltradas = listaMutable.filter { tarea -> tarea.prioridad == prioridad }

    return tareasFiltradas;
}

fun menu() {
    println("-------------------")
    println("MENU")
    println("-------------------")
    println("1. Agregar tarea")
    println("2. Modificar tareas")
    println("3. Listar tareas por prioridad")
    println("4. Salir de la aplicación")
}

fun main() {

    var listaTareas = mutableListOf<Tarea>().apply {
        add(Tarea("aaa1", "aaa1", Prioridad.ALTA, false))
        add(Tarea("aaa2", "aaa2", Prioridad.BAJA, false))
        add(Tarea("aaa3", "aaa3", Prioridad.MEDIA, true))
    }

    var verdadero = true;
    while (verdadero) {
        menu()
        var opcion = readLine()?.toInt() ?: 4
        when (opcion) {
            1 -> {
                agregarTarea(listaTareas);
                println(listaTareas)
            }

            2 -> {
                modificarTarea(listaTareas)
                println(listaTareas)
            }

            3 -> {
                println(listarTareasPorPrioridad(listaTareas).toString())
            }

            4 -> {
                println("Saliendo de la aplicación")
                verdadero = false
            };

        }
    }
}
