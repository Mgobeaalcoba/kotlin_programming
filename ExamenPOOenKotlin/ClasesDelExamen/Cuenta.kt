package clases

// Creo una data class llamada cuenta para almacenar datos bancarios

data class Cuenta(
    val clave : String,
    val titular : String,
    var saldo : Double
) {
    fun agregarDinero(deposito : Double?) : Any {
        return if (deposito == null) {
            0.0
        } else {
            saldo += deposito
        }
    }

    fun retirarDinero(retiro : Double?) : Any {
        return if (retiro == null) {
            0.0
        } else if (retiro > saldo) {
            println("""
                El monto a retirar ($$retiro) no puede ser mayor que el
                saldo ($$saldo)
                No se pudo realizar la acción solicitada.
            """.trimIndent())
            0.0
        } else {
            saldo -= retiro
        }
    }
}