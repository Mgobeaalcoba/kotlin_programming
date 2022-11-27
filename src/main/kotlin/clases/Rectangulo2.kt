package clases

import kotlin.math.roundToInt

// Esta clase está heredada de una interfase en lugar de haber sido heredada de una clase abstracta.
class Rectangulo2(private var base: Double, private var altura: Double, override var identificador: String) : Poligono2 {
    override fun obtenerArea(): Double {
        return base * altura
    }

    override fun obtenerPerimetro(): Double {
        return (2 * base) + (2 * altura)
    }

    override fun dibujar() {
        for (i in 1..altura.roundToInt()){
            println(" * ".repeat(base.toInt()))
        }
    }

    fun obtenerAreaPulgadas(): Double {
        return centimetrosAPulgadas(obtenerArea())
    }

    fun obtenerPerimetroPulgadas(): Double {
        val perimetro = (2 * base) + (2 * altura)
        return centimetrosAPulgadas(perimetro)
    }
}