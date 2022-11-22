fun main() {
    val numero = 10
    println("Ingrese su nombre: ")
    val nombre = readLine() // No se puede ingresar el pedido dentro del readLine

    println("Mi nombre es $nombre \n y tengo $numero") // String template: Forma mas practica de concatenar strings con variables
    println("""
        Esto es
        una "prueba" de 
        Raw String de $nombre
        que es un $numero
    """.trimIndent())
}