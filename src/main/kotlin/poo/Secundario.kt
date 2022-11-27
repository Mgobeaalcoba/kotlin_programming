package poo

import clases.Nota

fun main() {

    println(Nota.numeroInstancias) // Se llama al metodo por la clase. Ya que es un metodo de la clase

    val nota1 = Nota("Ejemplo 1", "Contenido de ejemplo 1")

    println(nota1.contenido) // Se llama al metodo por la instancia. Ya que es un metodo de instancia.
    println(Nota.numeroInstancias) // Veamos luego de crear una nota como cambio el valor del metodo de la clase.

    val nota2 = Nota("Ejemplo 2.", "Contenido de ejemplo 2...")

    println(nota2.contenido) //
    Nota.mostrarNumeroInstancias() // Llamo al metodo de la clase que hace lo mismo que el print de arriba.

}