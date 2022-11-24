import java.lang.Exception

// Throw: Armar mis propias excepciones

fun main () {

    println(calcularInteresesPrestamos(readLine()!!.toDouble()))

}

fun calcularInteresesPrestamos(valor: Double): Double {

    if(valor > 100000.0) {
        throw Exception("El prestamo no puede ser mayor que 100000.0 pesos")
    } // En lugar de una impresión simple luego de un if mando el mensaje con una nueva excepción
    // creada por mí y corto el programa con throw
    // Es mas para mandarle mensajes a otros programadores. No para trabajar con usuarios.

    return valor * 0.1
}