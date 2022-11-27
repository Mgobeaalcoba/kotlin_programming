package clases

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

// Si a una propiedad de mi clase la defino con String? o Int? permito que si no me pasan el valor sea nulo
class Persona( // Defino propiedades de mi constructor primario
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

    companion object {
        const val FORMATO_FECHA = "dd/MM/yyyy"
    }

}


