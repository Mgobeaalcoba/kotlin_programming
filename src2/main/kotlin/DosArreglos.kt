
import java.text.DecimalFormat

val formato2 = "#.#"

fun main() {

    val alumnos = arrayOf("José", "Alberto", "Laura", "Noel", "Erika", "Daniel")
    val calificaciones = doubleArrayOf(31.0, 94.0, 98.5, 75.0, 46.5, 75.0)

    val avg = promedio(calificaciones)
    println("Promedio de calificación: ${DecimalFormat(formato2).format(avg)}\n")

    val masAlta = calcularMasAlta(calificaciones)
    println("calificación más alta: ${DecimalFormat(formato2).format((masAlta))}")

    val masBaja = calcularMasBaja(calificaciones)
    println("calificación más baja: ${DecimalFormat(formato2).format((masBaja))}\n")

    println("Reprobados:")
    reprobados(alumnos, calificaciones)
}

fun promedio(calificaciones: DoubleArray): Double  {
    var suma = 0.0

    for (nota in calificaciones) {
        suma += nota
    }

    return suma / calificaciones.size
}

fun calcularMasAlta(calificaciones: DoubleArray): Double {
    var maximo = 0.0
    for (i in calificaciones.indices) {
        if (calificaciones[i] > maximo) {
            maximo = calificaciones[i]
        }
    }
    return  maximo

}

fun calcularMasBaja(calificaciones: DoubleArray): Double {
    var minimo = calificaciones[0]
    for (i in calificaciones.indices) {
        if (calificaciones[i] < minimo) {
            minimo = calificaciones[i]
        }
    }
    return minimo

}

fun reprobados(alumnos: Array<String>, calificaciones: DoubleArray) {
    for (i in calificaciones.indices) {
        if (calificaciones[i] < 60.0) {
            println("${alumnos[i]}, ${calificaciones[i]}")
        }
    }
}