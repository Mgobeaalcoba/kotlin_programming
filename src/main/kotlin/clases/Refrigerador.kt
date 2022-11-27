package clases

class Refrigerador (
    override val numeroSerie: String,
    override val tipo: TiposDeElectrodomesticos,
    override val color: Colores,
    override val peso: Double,
    override val precio: Double,
    private val capacidad : Double,
    private val temperaturaMinimaConservador : String,
    private val temperaturaMinimaCongelador : String
) : Electrodomestico() {

    override fun toString(): String {
        return super.toString() + "Capacidad: $capacidad - Temperatura mínima: [$temperaturaMinimaConservador] [$temperaturaMinimaCongelador]"
    }

}
