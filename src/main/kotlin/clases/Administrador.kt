package clases

class Administrador(
    nombre: String,
    apellido: String,
    direccion: String,
    telefono: String?,
    fechaNacimientoTexto: String,
    salario: Double,
    var bono: Double,
) : Empleado(nombre, apellido, direccion, telefono, fechaNacimientoTexto, salario) {

    init {
        bono = (bono/100) * salario
    }

    // Funcion que es solo de Administrador y no así de Empleado y Persona
    fun salarioFinal() : Double {
        return bono + salario
    }

    override fun toString(): String {
        return super.toString() + ", Bono ${bono}, Salario Final ${salarioFinal()}" // La clase padre ahora es Persona porque fue sobreescrita allí.
    }

}