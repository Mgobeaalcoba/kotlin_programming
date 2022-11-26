import java.util.Date

fun main() {
    mostrarMensaje()

    mostrarMensaje()

    val prueba = mostrarMensaje() // Variable local
    println(prueba) // las funciones en Kotlin siempre retornan algo. Aunque puede no ser explicito.

    mostrarDatos("Mariano", 34 )

    val salarioNeto = calcularImpuestos(505700.75,35.1)
    println("Mi salario neto o de bolsillo es de $salarioNeto")

    val salarioNeto2 = calcularImpuestos2(505700.75)
    println("Mi salario neto o de bolsillo es de $salarioNeto2")

}

fun mostrarMensaje() { // Funcion sin parametros
    println("""
        Mensaje: Hola desde Kotlin
        Fecha: ${Date()}
    """.trimIndent())
}

fun mostrarDatos(nombre: String, edad: Int) { // Funcion con parametros
    println("""
        Nombre: $nombre
        Edad: $edad
    """.trimIndent())
}

fun calcularImpuestos(salario: Double, porcentajeImpuestos: Double): Double { // Funcion con parametros y retorno explicito

    return salario - ((salario / 100) * porcentajeImpuestos)
}

fun calcularImpuestos2(salario: Double, porcentajeImpuestos: Double = 35.1): Double { // Funcion con parametros (algunos por default) y retorno explicito

    return salario - ((salario / 100) * porcentajeImpuestos)
}