package poo
import clases.Auto
import clases.Avion
import clases.Nota
import java.util.*

// Alt + Enter sobre la clase instancia para importarla sola

fun main() {
    /* Clases: primera letra en mayuscula. Las diferencia de las funciones y variables

    val nota1 = Nota() // Instanceo a mi clase // Creo un objeto
    // Una vez instancia puedo acceder a sus propiedades para darle contenido:
    nota1.nombre = "Prueba 1"
    nota1.contenido = "Contenido de prueba"
    // .fechaCreación no necesito asignarla ya que la funcion date le dará la fecha en la que se instanció.

    val nota2 = Nota()

    nota2.nombre = "Otra prueba"
    nota2.contenido = "Este es otro ejemplo de instanceo"


    // Instanceo de una clase con constructor:
    val nota1 = Nota(nombre = "Prueba 1.1", contenido = "Contenido de prueba", Date())//con ctrl + p veo que necesita el constructor para generar el objeto
    val nota2 = Nota("Otra prueba 2.2", "Este es otro ejemplo de instanceo", Date())

    val listaNotas = arrayListOf<Nota>() //Armo un array list de una clase

    listaNotas.add(nota1)
    listaNotas.add(nota2)

    listaNotas.forEach{// Variable it es para representar el contenido de cada iteración en el ciclo forEach
        println("""
            ${it.nombre}
            ${it.contenido}
            ${it.fechaCreacion}
            -----------------------------
        """.trimIndent())
    }

    println(nota1.nombre)
    println(nota1.contenido)
    println(nota1.fechaCreacion)

    println("-----------------------------")

    // Tmb puedo reasignar los valores de los atributos de mi clase:

    nota1.nombre = "Nota actualizada"

    println(nota1.nombre)
    println(nota1.contenido)
    println(nota1.fechaCreacion)
    */
    val nota1 = Nota("Nota 1", "Contenido 1") // No necesito enviar el date porque el constructor secundario ya sabe crear ese atributo
    val nota2 = Nota("Nota 2", "Contenido 2", Date()) // Al enviar el Date() me envía al constructor primario en lugar del secundario

    println("fin de las notas")
    val listaNotas = arrayListOf<Nota>()
    println("armé la lista de notas")

    listaNotas.add(nota1)
    listaNotas.add(nota2)

    listaNotas.forEach{
        println("""
            ${it.fechaCreacion}
            ${it.nombre}
            ${it.contenido}
            --------------------------
        """.trimIndent())
    }

    val auto = Auto("Alfa Romeo")

    println(auto.marca)

    val avion1 = Avion()

    println("""
        El avión creado tiene capacidad para ${avion1.numeroPasajero} pasajeros
    """.trimIndent()) // Si la var numeroPasajero fuese protected o private no podría acceder de acá.

}
// Los modificadores de acceso pueden usarse para: clases, funciones, variables, etc.
/* Modificadores de acceso: Son 4 tipos:
- Public (viene por defecto)
- Internal
- Protected
- Private
 */
