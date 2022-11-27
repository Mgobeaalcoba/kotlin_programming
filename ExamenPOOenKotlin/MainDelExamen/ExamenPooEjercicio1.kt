package poo

import clases.Cuenta

val cuenta1 = Cuenta("01-8547-9", "Alberto Palma",5000.0)

fun main() {

    println("""
        Menú
        1 - Depositar
        2 - Retirar
        
        Ingresa la acción a realizar: 
    """.trimIndent())

    val opcion = readLine()!!.toIntOrNull()
    val monto : Double?
    val saldoAnterior = cuenta1.saldo

    if (opcion == 1) {
        println("Ingresa el monto: ")
        monto = readLine()!!.toDoubleOrNull()
        if (cuenta1.agregarDinero(monto) == 0.0) {
            println("Monto incorrecto")
            main()
        } else {
            println(
                """
                ----------------------Recibo-------------------------
                Clave: ${cuenta1.clave} - Titular: ${cuenta1.titular}
                
                Acción: Deposito de dinero
                Monto: $monto
                Saldo anterior: $saldoAnterior
                Nuevo saldo: ${cuenta1.saldo}
            """.trimIndent()
            )
            main()
        }
    } else if (opcion == 2) {
        println("Ingresa el monto: ")
        monto = readLine()!!.toDoubleOrNull()
        if (cuenta1.retirarDinero(monto) == 0.0) {
            println("Monto incorrecto")
            main()
        } else {
            println("""
                ----------------------Recibo-------------------------
                Clave: ${cuenta1.clave} - Titular: ${cuenta1.titular}
                
                Acción: Retiro de dinero
                Monto: $monto
                Saldo anterior: $saldoAnterior
                Nuevo saldo: ${cuenta1.saldo}
            """.trimIndent())
        }
        main()
    } else {
        println("Usted ha salido del programa.")
    }
}