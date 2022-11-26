var sesionIniciada = false

fun main() {

    if (sesionIniciada == true) {
        println("Bienvenido")
    } else {
        println("Por favor inicia sesión")
    } // Cuando luego del if/else tengo una sola linea de codigo
    // puedo omitir las llaves en Kotlin.

    println("Ingrese su edad: ")
    val edad = readLine()!!.toInt()

    if (edad < 18) {
        println("Es menor de edad")
    } else if (edad < 60){
        println("Es mayor de edad")
    } else {
        println("Es de la tercera edad")
    }

    val aval = true

    if (edad >= 18 && aval == true) {
        println("Otorgar prestamo")
    } else {
        println("No podemos otorgarle credito")
    }

    var mensajeResultado = ""

    if (edad >= 18){
        mensajeResultado = "Es mayor de edad"
    } else {
        mensajeResultado = "Es menor de edad"
    }

    println(mensajeResultado)

    // Lo mismo se puede hacer en una linea con Kotlin

    var mensajeResultado2 = if(edad < 18) "Usted es menor de edad. No puede estar en un banco" else "Es mayor de edad"
    println(mensajeResultado2)
}