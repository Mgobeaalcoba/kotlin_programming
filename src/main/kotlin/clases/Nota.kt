package clases

import java.util.*

/* Clase con atributos y sin constructor:

class Nota {
    // Propiedades o atributos:
    var nombre: String = ""
    var contenido: String = ""
    var fechaCreacion: Date = Date() // Importo librería de Java para trabajar con fechas.
}
*/

/* Clase con constructor primario:

class Nota(var nombre: String,
           var contenido: String,
           var fechaCreacion: Date) // Si en el constructor uso val no puedo reasignar sus valores. Si uso var si.

 */

// Clase con constructor secundario:

// Este es el constructor primario:
// una class sin nada delante es public por default
class Nota(var nombre: String,
           var contenido: String,
           var fechaCreacion: Date) {
    // Bloque de inicialización del constructor primario:
    init {
        println("Se instancio la clase con el constructor primario...")
        nombre = nombre.uppercase()
    }

    // Este es el constructor secundario:
    constructor(nombre: String, contenido: String) : this (nombre, contenido, Date()) {
        // Bloque de inicialización del constructor secundario: Es algo que se va a ejecutar al instanciar la clase con el constructor secundario:
        println("Se instancio la clase con el constructor secundario. ")
        this.contenido = contenido.uppercase()
        // En el constructor secundario debo llamar a los atributos con el this adelante.
    }
    // De esta forma el valor de date no es necesario enviarlo. Se construye solo al instanciar la clase.
// Los constructores secundarios siempre llaman a su vez al constructor primario pero no viceversa.
}

/* Modificadores de acceso: Son 4 tipos:
- Public (viene por defecto)
- Internal
- Protected
- Private
 */