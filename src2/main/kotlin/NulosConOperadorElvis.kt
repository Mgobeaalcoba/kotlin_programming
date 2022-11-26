
fun main() {

    val valor: Int? = 5 // Con el ? permitimos nulos en la variable
    val resultado = valor!! * valor // Le afirmamos a Kotlin que siempre va a tener un valor no nulo
    println(resultado)

    try {
        val entrada = readLine()

        val lado = entrada?.toDouble() ?: 0.0 // Operador elvis reemplaza al if null

        val resultado2 = lado * lado

        println(resultado2)
    } catch (e: NumberFormatException) {
        println("Entrada no valida")
    }
}