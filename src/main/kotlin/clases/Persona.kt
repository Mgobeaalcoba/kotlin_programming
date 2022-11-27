package clases

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

// Si a una propiedad de mi clase la defino con String? o Int? permito que si no me pasan el valor sea nulo

open class Persona( // Defino propiedades de mi constructor primario
    var nombre: String,
    var apellido: String,
    var direccion: String,
    var telefono: String?,
    private var fechaNacimientoTexto: String
    ){
// Defino propiedades por fuera de mi constructor. Voy a calcularlas:
    private var fechaNacimientoDate: LocalDate = LocalDate.parse(fechaNacimientoTexto, DateTimeFormatter.ofPattern(
    FORMATO_FECHA))
    // Convertimos el texto de fecha que recibimos en el constructor a una fecha con tal formato.

    fun obtenerEdad(): Int{
        return Period.between(fechaNacimientoDate, LocalDate.now()).years
    }

    // Metodos sobreescritos: puedo sobreescribir lo que hace un método de una clase.
    // Ej: el método toString() de la clase Int que viene heredado de la clase Any.
    override fun toString(): String {
        //return super.toString() // Super significa que el método viene heredado de la clase padre Any.
        return "Nombre: $nombre $apellido, Dirección: $direccion, Telefono: ${telefono ?: "N/D"}, Fecha de nacimiento: $fechaNacimientoDate, Edad: ${obtenerEdad()}" // Re escribo la función toString() de la clase Int
        //Como telefono soporta nulas, uso un operador terneario (?) para pedirle que si es nulo ponga N/D y sino el telefono.
    }


    companion object {
        const val FORMATO_FECHA = "dd/MM/yyyy"
    }

}

// Vamos ahora a crear una clase herencia de persona. Llamada empleado.

