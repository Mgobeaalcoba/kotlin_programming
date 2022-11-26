package ejecutable

import clases.Auto

fun main() {
    // Desde acá puedo instanciar a Auto pese a ser una internal class ya que estoy en el mismo modulo.
    val auto = Auto("Honda")
    println(auto.marca)
}