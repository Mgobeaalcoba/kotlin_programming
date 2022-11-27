package clases

import constantes.Constantes
import java.lang.Exception
import java.util.*

// Es una buena práctica dejar comentados los metodos de nuestras clases.

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
           var fechaCreacion: Date) { // Son propiedades de cada instancia.
    // Bloque de inicialización del constructor primario:
    init {

        println("Se instancio la clase con el constructor primario...")
        nombre = nombre.uppercase()
        numeroInstancias ++ // Hago crecer el número de creacion de instancias frente a cada objeto creado.
        if (nombre.length > Constantes.LONGITUD_MAXIMA_NOMBRE) throw Exception("El nombre no puede tener más de 10 caracteres")
        // El throw sería el equivalente a un raise en Python. Disparan una excepción frente a una condición.

    }

    // Este es el constructor secundario:
    constructor(nombre: String, contenido: String) : this (nombre, contenido, Date()) {
        // Bloque de inicialización del constructor secundario: Es algo que se va a ejecutar al instanciar la clase con el constructor secundario:
        println("Se instancio la clase con el constructor secundario. ")
        this.contenido = contenido.uppercase()
        // En el constructor secundario debo llamar a los atributos con el this adelante.
    }

    // Acá vamos a declarar el companion object de mi clase nota:
    // El companion object es un singleton (ver abajo) que pertenece a una clase.
    // Tmb puedo declarar singletons por fuera de mi clase.
    companion object {

        var numeroInstancias = 0 // para que aumente frente a cada creación de una instancia objeto debo sumarlo al init
        // Son propiedades de la clase. Por eso van en companion object

        // Dentro del companion object tambien puedo crear metodos de la clase:
        fun mostrarNumeroInstancias() {
            println(numeroInstancias)
        }

    }

    // De esta forma el valor de "date()" no es necesario enviarlo. Se construye solo al instanciar la clase.
// Los constructores secundarios siempre llaman a su vez al constructor primario pero no viceversa.

    // Creo un metodo para mi clase Nota:
    fun imprimirCaracteres(): Int {
        return contenido.length // Cuenta el total de caracteres del contenido
    }

    fun contarPalabras(): Int {
        val palabras = contenido.split(" ") // split es un metodo de la clase String que separa una frase en una lista de elementos divididos por el separador escogido.
        return palabras.size // Cuanta el total de elementos de una lista
    }

    // Vamos a hacer ahora una sobrecarga de metodos con contarPalabras:
    fun contarPalabras(palabra: String): Int {

        val palabras = contenido.split(" ")

        var contador = 0

        palabras.forEach{
            if(it == palabra.uppercase()) contador ++
            //println("it es $it y palabra es $palabra...")
        }

        return contador

    }
}
/*
Sobrecarga de metodos: Tengo dos funciones con el mismo nombre pero distintos parametros
Entonces si al invocar el metodo pongo el parametro "x" va a llamar a un metodo pero si pongo
el parametro "y" y el "z" va a llamar a otro metodo de igual nombre pero distinta firma.
 */

/* Modificadores de acceso: Son 4 tipos:
- Public (viene por defecto)
- Internal
- Protected
- Private
 */

// singleton: una clase que solo puedo instanciar una unica vez.

// Atributos o propiedades de una clase: Son compartidos por todos los objetos/instancias de una clase
// Atributos o propiedades de una instancia/objeto: Son exclusivos de ese objeto. Ej: nombres distintos de las notas.
// Los atributos de instancia van dentro del parentesis de la clase.
// Los atributos de la clase van dentro del "companion object" de la clase.