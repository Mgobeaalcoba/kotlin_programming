package clases

class Lavadora(
    override val numeroSerie: String,
    override val tipo: TiposDeElectrodomesticos,
    override val color: Colores,
    override val peso: Double,
    override val precio: Double,
    private val capacidad : Double
) : Electrodomestico() {

    override fun toString(): String {
        return super.toString() + "Capacidad: $capacidad"
    }

}