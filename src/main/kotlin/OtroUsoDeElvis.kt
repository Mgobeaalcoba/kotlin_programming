
fun main() {

    var entrada = readLine()
    entrada = entrada?.uppercase()
    println(entrada)

    val lado = entrada?.toDoubleOrNull()

    lado?.let {

        // Lambda para validar que no sea nulo. Si es nulo no corre el codigo debajo.
        val resultado = it * it
        println(resultado)

    }

    println("Finaliza la ejecución del programa")
}