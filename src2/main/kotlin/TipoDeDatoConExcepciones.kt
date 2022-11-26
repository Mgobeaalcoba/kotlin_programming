import java.lang.Exception

// Como puedo saber si un dato es un numero???

fun main() {

    println(esNumero(readLine()!!))

}

fun esNumero(valor: Any): Boolean {

    val resultado =
        try {
            valor.toString().toDouble()
            true
        } catch (e: Exception) {
            false
        }

    return resultado
}