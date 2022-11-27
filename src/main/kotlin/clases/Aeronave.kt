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

// Metodos: algoritmos de acciones que pueden realizar nuestros objetos.
// Son casi iguales a una funcion. Se declaran con la palabra fun tmb.
// Diferencias con una función:
// A un método se le pasa implícitamente el objeto en el que se llamó
// Un método puede operar sobre datos contenidos dentro de la clase.