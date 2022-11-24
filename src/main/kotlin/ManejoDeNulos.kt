
fun main() {

    val valor: Int? = 5 // Con el ? permitimos nulos en la variable
    val resultado = valor!! * valor // Le afirmamos a Kotlin que siempre va a tener un valor no nulo
    println(resultado)

    val entrada = readLine()

    val lado = if(entrada != null) entrada.toDouble() else 0.0

    val resultado2 = lado * lado

    println(resultado2)
}