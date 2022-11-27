package poo

import clases.EstadoTarea
import clases.Tarea

fun main() {

    // Problema: Obtener una lista de tareas pendientes dejando libre el campo para que definan el estado de la tarea
    val listaTareas = arrayListOf(Tarea("Lavar ropa", EstadoTarea.PENDIENTE), Tarea("Comprar medicamento", EstadoTarea.PENDIENTE))

    var tareasPendientes = 0

    // Al incorporar la enum class EstadoTarea como opciones para el estado de mi clase Tarea resolví el problema.
    listaTareas.forEach {
        if(it.estado == EstadoTarea.PENDIENTE) tareasPendientes++
    }

    println("Tareas pendientes: $tareasPendientes")
    // El problema acá es que el output será 1, ya que "por hacer" no lo entiende como pendiente.
    // Para solucionar esto debemos armar un enum class

    //Tmb puedo consultar los estados asociados a cada tarea de mi lista:
    println(listaTareas[0].estado)
    println(listaTareas[1].estado)

}