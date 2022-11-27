package poo

import clases.PersonaB
import clases.PersonaC

fun main() {

    val personaB = PersonaB("Mariano Daniel", "1127475569")
    val personaC = PersonaC("Lautaro Gobea","1136547780")

    println(personaB.toString())
    // Output : PersonaB(nombre=Mariano Daniel, telefono=1127475569)
    println(personaC.toString())
    // Output: clases.PersonaC@610455d6
    // Ya no necesitamos sobreescribir el metodo toString() para ver su contenido.

    // Además, las data class tienen un metodo que se llama .copy() que nos permite copiar facilmente elementos.
    var personaD = personaB.copy()
    println(personaD.toString())

    // Si no quiero hacer la copia entera. Si no solo una parte puedo cambiar lo que deseo como argumento de .copy()
    personaD = personaB.copy(nombre = "Lautaro Capo")
    println(personaD.toString())

    // Con una clase para abrir sus propiedades en variables independientes debería hacer así:
    val nombre = personaC.nombre
    val telefono = personaC.telefono
    println("$nombre, $telefono")

    // Tmb las data class nos permiten almacenar simplemente los parametros de la misma en variables independientes:
    val (nombre2, telefono2) = personaB // Reparte las variables del objeto en dos variables independientes.
    println("$nombre2, $telefono2")

    println(personaB.obtenerLargoNombre())

}