import java.text.DecimalFormat
import kotlin.math.PI

fun main () {
    val formato = "#.##"

    println("Ingrese el radio en centimetros: ")
    val radio = readLine()!!.toDouble()

    val area = calcularArea(radio)
    val circunferencia = calcularCircunferencia(radio)
    val areaPulgada = areaAPulgadas(area)
    val circunferenciaPulgada = circunferenciaAPulgadas(circunferencia)

    println("""
        
        *** Centímetros ***
        Área                | ${DecimalFormat(formato).format(area)}
        Circunferencia      | ${DecimalFormat(formato).format(circunferencia)}
        
        *** Pulgadas ***
        Área                | ${DecimalFormat(formato).format(areaPulgada)}
        Circunferencia      | ${DecimalFormat(formato).format(circunferenciaPulgada)}
    """.trimIndent())
}

fun calcularArea(radio: Double): Double {
    return radio * radio * PI
}

fun calcularCircunferencia(radio: Double): Double {
    return (radio * 2) * PI
}

fun areaAPulgadas(medida: Double): Double {
    val pulgadaCuadrada = 0.155
    return medida * pulgadaCuadrada
}

fun circunferenciaAPulgadas(medida: Double): Double {
    val pulgada = 0.393701
    return medida * pulgada
}