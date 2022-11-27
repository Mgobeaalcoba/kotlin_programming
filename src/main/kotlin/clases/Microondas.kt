package clases

class Microondas (
    override val numeroSerie: String,
    override val tipo: TiposDeElectrodomesticos,
    override val color: Colores,
    override val peso: Double,
    override val precio: Double,
    private val potencia : Double
) : Electrodomestico() {

    override fun toString(): String {
        return super.toString() + "Potencia: $potencia"
    }

}