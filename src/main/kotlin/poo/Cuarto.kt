package poo

import clases.Rectangulo
import clases.Rectangulo2

fun main() {

    // Rectangulo instanciado de una clase que hereda de una clase abstracta:
    val rectangulo = Rectangulo("Rectangulo 1",15.0,8.0)

    println(rectangulo.identificador)
    println(rectangulo.obtenerArea())
    println(rectangulo.obtenerPerimetro())
    println("-----------------------------")
    println(rectangulo.obtenerAreaPulgadas())
    println(rectangulo.obtenerPerimetroPulgadas())
    rectangulo.dibujar()

    // Rectangulo instanciado de una clase que hereda de una interfase:
    val rectangulo2 = Rectangulo2(20.0,10.0,"Rectangulo 2")

    println(rectangulo2.identificador)
    println("-----------------------------")
    println("-----------------------------")
    println(rectangulo2.obtenerArea())
    println(rectangulo2.obtenerPerimetro())
    println("-----------------------------")
    println(rectangulo2.obtenerAreaPulgadas())
    println(rectangulo2.obtenerPerimetroPulgadas())
    rectangulo2.dibujar()

}