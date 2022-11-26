package clases

// Al declararla como una open class puedo realizar herencia hacia Avion.
// Si yo fijara como privada (private) a la ver numeroPasajero entonces no podría acceder
// desde la clase Avion a la misma. Pero si la podría imprimir dentro de la clase
// Aeronave.
// Si fijara como protected a la var numeroPasajero entonces podría acceder desde la
// la clase original o cualquiera de sus clases heredadas pero no por fuera.
open class Aeronave (/* private - protected */ var numeroPasajero: Int) { // Si no pongo var luego no puedo acceder al mismo debajo

    init {
        println(numeroPasajero) // Por mas que la var numeroPasajero fuese private podría acceder.
    }

}

// Herencia: Avion hereda sus atributos de aeronave
class Avion : Aeronave (50) {

    init {
        println(numeroPasajero) // Si la var numeroPasajero fuese una private var no podría acceder.
    }

}