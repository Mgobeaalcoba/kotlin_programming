// While = Mientras -> Corre mientras se cumpla una condición
// Do While = Ejecuta primero, es decir, al menos una vez, y luego revisa la condición para ver si sigue o no.

fun main () {
    println("Ingrese los nombres uno por uno, para finalizar e imprimir preisona enter\n")

    val listaEmpleados = arrayListOf<String>()

    println("Nombre: ")
    var nombre = readLine().toString()

    while (nombre != "") {
        listaEmpleados.add(nombre)
        println("Nombre: ")
        nombre = readLine().toString()

    }

    println("\n ---Resultado---\n")

    for (empleado in listaEmpleados) println(empleado)
}