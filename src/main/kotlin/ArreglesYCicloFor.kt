// Arrays = Arreglos, vectores o matrices
// For = Ciclo de repetición pre-definida

fun main() {

    val empleados = arrayOf("Jesús", "Alberto", "Claudia")

    println(empleados.size) // Tamaño de mi array

    empleados[0] = "Mariano" // Reemplazo el valor de una parte del array

    // Si quiero ampliar el array debo definirlo como un var. No como val

    println(empleados[0])

    val valores = intArrayOf(10,15,25,45,80) //Arreglo de enteros exclusivamente

    for (x in 0..5) {
        println(x)
    }

    for (x in 0 until valores.size) { // until es hasta el valor del tamaño del arreglo
        println(valores[x])
    }

    var sumatoria = 0

    for (i in 0 until valores.size) {
        sumatoria += valores[i]
    }

    println(sumatoria)
    println(sumatoria / valores.size)

    // Si luego del for tengo una linea de codigo solamente puedo obviar las llaves
    // y poner todo en una sola linea de codigo

    for (i in 0 until empleados.size) println(empleados[i])

    // Con break puedo cortar un ciclo for cuando obtuve lo que quería:

    for (i in 0 until empleados.size) {

        println(empleados[i])

        if (empleados[i] == "Alberto") {
            break
        }
    }

    println("Finalizó")

    // Se puede iterar todo el arreglo de una forma mas simple

    for ( (contador, empleado) in empleados.withIndex()) {

        println("$empleado - $contador")

    } // Detalle acá no podemos ver el indice por el que va el ciclo sin usar una variable contador


}