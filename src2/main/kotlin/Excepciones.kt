// Excepciones: Try, Catch y Finally (Opcional)

fun main() {
    try {
        val valor = readLine()!!.toDouble()
        println(valor)
    } catch (e: Exception) {
        println("Entrada incorrecta, el valor debe ser un número")
        //main()
    } // Acá estoy intentando atrapar las excepciones en general.
    // No es buena práctica y es aconsejable atrapar las excepciones de forma particular.

}