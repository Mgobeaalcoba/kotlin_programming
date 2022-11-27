package constantes

// Singletons:
// Acá puedo guardar mis constantes y luego importarlas. Buena práctica

object Constantes {

    // Constantes: Se deben asignar antes de compilar el codigo. Las var y val pueden quedar vacias y ser asignadas luego.
    // Lo ideal para las constantes es declararlas dentro dentro del companion object.
    const val LONGITUD_MAXIMA_NOMBRE = 10 // Se declaran en mayuscula y separada por guiones bajos.

    // Las constantes nunca pueden ser reasignadas por lo que deben ser cambiadas directamente desde aquí antes de compilar

}