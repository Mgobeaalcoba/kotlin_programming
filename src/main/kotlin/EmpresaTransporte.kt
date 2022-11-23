import java.text.DecimalFormat

val formato3 = "#"

fun main() {

    println("Kilometros del trayecto: ")
    var kilometros: Int? = readLine()!!.toIntOrNull()

    while (kilometros == null) {
        println("Se deben ingresar los kilómetros del trayecto")
        println("---------------------------------------------")
        println("Kilometros del trayecto: ")
        kilometros = readLine()!!.toIntOrNull()
    }

    println("Aplicar descuento: ")
    val descuento: String = readLine().toString()

    if (kilometros != null) {
        totalACobrar(kilometros, descuento)
    }
}

fun totalACobrar(kilometros: Int, descuento: String) {

    val tarifa = 2.25
    val desc = 0.45
    var total = 0.0
    if (descuento == "si" || descuento == "1") {
        total = kilometros * (tarifa * (1-desc))
    } else {
        total = kilometros * tarifa
    }

    println("Total a cobrar: $${DecimalFormat(formato3).format(total)}")

}