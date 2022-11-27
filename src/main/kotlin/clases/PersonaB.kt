package clases

// Data class: Son clases que solo se usan para guardar data.
data class PersonaB(
    var nombre : String,
    var telefono : String
) {
    // Tmb podemos crearles métodos a las data class:
    fun obtenerLargoNombre() : Int {
        return nombre.length
    }
}
