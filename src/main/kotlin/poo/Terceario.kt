package poo

import clases.Administrador
import clases.Empleado
import clases.Persona

fun main() {

    val persona = Persona("Jesus","Martinez","Olazabal 2022",null,"17/12/1987")

    val empleado = Empleado("Mariano","Gobea","El Delta 1740",null,"11/03/1991", 5000.0)

    val administrador = Administrador("Lauti","Gobea Alcoba","Aberastain 553, dpto 3","1127475569", "10/10/2017", 10000.0, 10.0)

    println(persona.obtenerEdad())

    println(persona.toString()) // Igual que poner println(persona). Solo aclaramos el .toString() porque la sobreescribimos en la clase Persona

    println(empleado) // poner solo el objeto/instancia es equivalente a poner empleado.toString() que ya hemos sobreescrito.

    println(empleado.obtenerEdad()) // No tengo este método en la clase Empleado. Pero como lo tengo en su "padre": Persona puedo llamarlo.

    println(administrador.toString())

    println(administrador.obtenerEdad())

}