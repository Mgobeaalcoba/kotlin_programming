package clases

abstract class Electrodomestico {
    abstract val numeroSerie : String
    abstract val tipo : TiposDeElectrodomesticos
    abstract val color : Colores
    abstract val peso : Double
    abstract val precio : Double

    init {
        totalElectros++
    }

    companion object {
        var totalElectros = 0
    }

    override fun toString(): String {
        return "Número de Seire: $numeroSerie - Tipo: $tipo - Color: $color - Peso: $peso - Precio: $precio - "
    }

}