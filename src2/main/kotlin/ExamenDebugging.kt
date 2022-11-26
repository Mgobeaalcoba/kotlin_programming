import java.lang.NullPointerException

val cantidadIngrediente = arrayOf(
    20.0,
    1.0,
    7.5,
    3.75,
    1.5,
    0.15,
    0.05,
    12.0
)

var nombrePrograma: String? = null

fun main() {

    nombrePrograma = "\n## Ingredientes y costo de pedidos de donas ##"
    println(nombrePrograma!!)

    print("\nTotal de donas a elaborar: ")

    val tot: Int? = readLine()!!.toIntOrNull()

    try {

        val c = if (tot!! < 100) {
            tot * 6.0
        } else {
            tot * 5.55
        }

        if (tot >= 20) {
            println(
                """
        ***********************************
        Ingredientes para $tot donas

        Harina       | ${Math.round(cantidadIngrediente[0] * tot)} gramos
        Levadura     | ${Math.round(cantidadIngrediente[1] * tot)} gramos
        Azucar       | ${Math.round(cantidadIngrediente[2] * tot)} gramos
        Leche        | ${Math.round(cantidadIngrediente[3] * tot)} mililitros
        Mantequilla  | ${Math.round(cantidadIngrediente[4] * tot)} gramos
        Huevo        | ${Math.round(cantidadIngrediente[5] * tot)} huevos
        Sal          | ${Math.round(cantidadIngrediente[6] * tot)} gramos
        Aceite       | ${Math.round(cantidadIngrediente[7] * tot)} mililitros
        ***********************************
        Total a cobrar: $${Math.round(c)}
        ***********************************
    """
            )
        } else {
            println("El pedido debe ser de mínimo 20 donas")
        }

    } catch (e: NullPointerException) {

        println("Se debe ingresar un número entero, intenta nuevamente")

    } finally {

        main()

    }
}