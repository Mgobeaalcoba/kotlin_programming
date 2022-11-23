// When es exclusivo de Kotlin. Es similiar a Switch en otros lenguajes

fun main () {

    println("Ingrese un entero: ")
    val valor = readLine()!!.toInt()

    when (valor) {
        1 -> {
            println("Valor es 1")
        } // La llave es obligatoria si tengo con out mas de una linea de codigo
        2 -> println("Valor es 2")
        else -> println("No es ni 1 ni 2")
    }

    val combustible = "gas"

    when (combustible) {
        "gasolina", "diesel" -> println("Utiliza gasolina o diesel")
        else -> println("Utiliza otro combustible")
    }

    println("Ingrese su edad: ")

    val edad = readLine()!!.toInt()

    when {
        edad < 18 -> println("Es menor de edad")
        edad < 60 -> println("Es mayor de edad")
        else -> println("Es de la tercera edad")
    }

    when (edad) {
        in 1..17 -> {
            println("Es menor de edad")
            println("Debe volver acompañado de un mayor")
        }
        in 18..59 -> println("Es mayor de edad")
        in 60..120 -> println("Es de la tercera edad")
        else -> println("Edad incorrecta")
    }

    // El resultado del when puede ser asignado a una variable.
    // La unica condición es que los resultados del when sean siempre del mismo tipo (ej: strings)

    val valor2: Any = 2 // Las variables Any pueden llevar distintos tipos de datos a su interior.

    val tipo = when (valor2) {
        is String -> "Es string"
        is Int -> "Es int"
        is Long -> "Es long"
        else -> "Es de otro tipo"
    }

    println(tipo)

    //main() -> Vuelvo recursivo al main
}