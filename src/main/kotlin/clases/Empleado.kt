package clases

// Clase empleado que está heredando de Persona:
open class Empleado(
    nombre: String,
    apellido: String,
    direccion: String,
    telefono: String?,
    fechaNacimientoTexto: String,
    var salario: Double
) : Persona(nombre, apellido, direccion, telefono, fechaNacimientoTexto){ // Declaro que hereda de su padre Persona

    // No necesito declarar los mismos métodos que su clase "padre" Persona
    // Ya los hereda por defecto. Esto es Herencia.
    // Tmb puedo agregarlo nuevos atributos propios de la clase Empleado como Salario.
    // Ahora vuelvo a reescribir el método toString() para que también me imprima el salario:
    override fun toString(): String {
        return super.toString() + ", Salario $$salario"// La clase padre ahora es Persona porque fue sobreescrita allí.
    }

}

// Una de las principales ventajas de la herencia es la productividad: puedo modificar muchas clases (los "hijos") con solo
// modificar a la clase "padre".

/*
En programación existen dos tipos de herencia: la herencia simple, que es la que vimos arriba y la única que soporta Kotlin
y la herencia multiple, que como adelanté arriba no es soportada por Kotlin. Hay formas de simular la misma pero no es
tecnicamente una herencia múltiple. Seria el equivalente de armar un arbol genealógico de clases: por ejemplo,
Persona es "padre" de Empleado que a la vez es "padre" de "Administrador". Por lo que hereda esta última las propiedades
de Empleado, pero también las de Persona.
 */