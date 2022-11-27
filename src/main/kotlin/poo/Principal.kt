package poo

import clases.Nota

fun main() {

    val mensaje = "Hola mundo"
    // mensaje es un String. String es una clase de Kotlin. Por lo que tiene metodos. Ej: uppercase()
    println(mensaje.uppercase())
    // mensaje es un objeto de la clase String
    // uppercase es un metodo de la clase String de Kotlin

    val nota1 = Nota("Información de Kotlin ", " Kotlin : Lenguaje de programación de tipado estatico que corre sobre la Java Virtual Machine (JVM)")
    val buscar = "de"
    println("La cantidad de caracteres es: ${nota1.imprimirCaracteres()}.")
    println("-----------------------------------------------------------")
    println("La cantidad de palabras en mi lista es de: ${nota1.contarPalabras()}.")
    println("-----------------------------------------------------------")
    println("La cantidad de veces que aparece '$buscar' en mi nota es de: ${nota1.contarPalabras(buscar)}")

}