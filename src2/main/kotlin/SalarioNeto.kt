import java.text.DecimalFormat

fun main() {

    val formato = "#.##"

    println("Ingrese su salario bruto mensual: $")
    val salarioBruto :Double = readLine()!!.toDouble()

    println("Ingrese el porcentaje de impuestos que debe pagar mensualmente: %")
    val shareImpuestos :Double = readLine()!!.toDouble()

    val salarioNeto = calcularImpuestos1(salarioBruto,shareImpuestos)
    println("Salario mensual neto: $${DecimalFormat(formato).format(salarioNeto)}")

    val impuestos :Double = salarioBruto - salarioNeto
    println("Impuestos a pagar por mes: $${DecimalFormat(formato).format(impuestos)}")



    println("Salario anual neto: $${DecimalFormat(formato).format(salarioNeto*12)}  ")
    println("Impuestos a pagar por mes: $${DecimalFormat(formato).format(impuestos*12)}")

}

fun calcularImpuestos1(salario: Double, porcentajeImpuestos: Double): Double { // Funcion con parametros y retorno explicito

    return salario - ((salario / 100) * porcentajeImpuestos)
}
