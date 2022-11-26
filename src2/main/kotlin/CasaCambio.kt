import java.text.DecimalFormat

var tasaCambio = 0.0
var pesosEnCaja = 0.0
var dolaresEnCaja = 0.0

fun main(){

    println("Ingrese la tasa de cambio de dolar a pesos: $")
    tasaCambio = readLine()!!.toDouble()

    println("Ingresa la cantidad de pesos para la apertura de caja: $")
    pesosEnCaja = readLine()!!.toDouble()

    println("Ingresa la cantidad de dolares para la apertura de caja: $")
    dolaresEnCaja = readLine()!!.toDouble()

    controlDeOperaciones()
}

fun controlDeOperaciones() {
    print("Ingresa la cantidad de dolares a cambiar: $")

    val dolaresACambiar = readLine()!!.toDouble()

    dolaresEnCaja += dolaresACambiar

    val pesosAEntregar = tasaCambio * dolaresACambiar

    pesosEnCaja -= pesosAEntregar

    val formato = "#,###.00"

    println("""
        
        ** Recibo **
        Pesos Argentinos a entregar: $${DecimalFormat(formato).format(pesosAEntregar)}
        
        Pesos en caja: $${DecimalFormat(formato).format(pesosEnCaja)}
        Dolares en caja: $${DecimalFormat(formato).format((dolaresEnCaja))}
    """.trimIndent())

    controlDeOperaciones() // De esta forma el programa no terminaría nunca salvo que lo corte.
}