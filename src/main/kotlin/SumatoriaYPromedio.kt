
fun main () {
    var num = 0.0
    var suma = 0.0
    var cont = 0

    do {
        println("Ingrese un numero distinto a 0 o 0 para terminar: ")
        num = readLine()!!.toDouble()
        suma += num
        if (num != 0.0) cont += 1
    } while (num != 0.0)

    println("Sumatoria: $suma")
    println("Promedio: ${(suma/cont)}")
}