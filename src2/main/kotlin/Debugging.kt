// Errores de excepciones: Verificación del codigo paso a paso

fun main() {

    val entrada = readLine() // Punto de interrupción: Interrumpe el programa en este punto
    val resultado = entrada!!.toDouble()
    print(resultado)
    recorrer()

}

fun recorrer() {

    val nombres = arrayOf("Jose","Eduardo","María")

    for (i in 0..10){
        println(nombres[i])
    }

}