package clases

import kotlin.math.roundToInt

// Rectangulo es una clase heredada de la clase abstracta Poligono:

class Rectangulo(identificador: String, private var base: Double, private var altura: Double) : Poligono(identificador) {
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