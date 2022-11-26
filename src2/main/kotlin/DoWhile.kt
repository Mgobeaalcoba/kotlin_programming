// Do While = Ejecuta primero, es decir, al menos una vez, y luego revisa la condición para ver si sigue o no.
// Con Do While puedo hacer mas eficiente la lista de nombres del ej del while

fun main () {

    println("Ingrese los nombres uno por uno, para finalizar e imprimir preisona enter\n")

    val listaEmpleados = arrayListOf<String>()

    do {

        println("Nombre: ")
        var nombre = readLine().toString()
        if(nombre != "") listaEmpleados.add(nombre)

    } while (nombre != "") // La condición se pone en el do. No en el while.

    println("\n ---Resultado---\n")
    println("Total: ${listaEmpleados.size}")
    for (empleado in listaEmpleados) println(empleado)
}

// Hay que tener cuidado con los ciclos infinitos. Pueden consumir la memoria.