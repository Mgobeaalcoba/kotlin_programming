// Array != ArrayList : Puede agregar o quitar elementos a la lista.

fun main() {

    val empleados = arrayListOf<String>("Jesus","Alberto","Claudia")
    // Si no defino el tipo de datos puedo poner los que quiera y mezclarlos

    println(empleados[0])
    println(empleados.get(1)) // Similar a la opción de señalar el indice de arriba

    empleados.add("Mariano")

    println(empleados.size)

    println(empleados[empleados.size-1])

    println("----------------------------------------")

    for (empleado in empleados) println(empleado)

    println("----------------------------------------")

    empleados.sort() // Ordena los elementos de la lista de forma alfabetica

    println("----------------------------------------")

    for (empleado in empleados) println(empleado)

    println("----------------------------------------")

    // Tmb podemos remover elementos de la lista así:

    empleados.removeAt(3) // remuevo a Mariano.

    println("----------------------------------------")

    for (empleado in empleados) println(empleado)

    println("----------------------------------------")

    // Tmb puedo reemplazar valores como con los arrays

    empleados[2] = "Nicole"

    for (empleado in empleados) println(empleado)

    // El ciclo forEach es un lambda para iterar un array o array list

    empleados.forEach { empleado ->
        println(empleado)
        println("---------------------")
    }

    // Otra variante de lambda es el forEachIndexed

    empleados.forEachIndexed{i, empleado ->
        println("$empleado - $i")
        println("---------------------")
    }

}