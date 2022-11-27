package clases

// Poligono es una clase abstracta por lo que no puede ser instanciada.
// No se pueden crear objetos de esta clase.
// Esta clase abstracta no tiene constructor, pero podría tenerlo sin problemas.
// Le agregamos el constructor con la variable identificador para probar la línea de arriba.
// No así las Interfaces que no pueden tener constructor. Mas detalles abajo...

abstract class Poligono(val identificador : String){
    // De esta clase abstracta se desprenderan las formas geometricas concretas.
    // Las herencias tienen distintas fórmulas para calcular área, superficie, etc.

    abstract fun obtenerArea(): Double // No le digo que función va a realizar porque depende de la forma concreta del poligono.
    abstract fun obtenerPerimetro(): Double
    abstract fun dibujar()

    // Las clases abstractas tmb pueden tener parametros o funciones "concretos" o "no abstractos"
    // Los mismos no necesitan ser sobreescritos en las clases hijas.

    protected fun centimetrosAPulgadas(valor: Double) : Double {
        return (1/2.54) * valor
        // Al ser protegida no puedo accederla desde un objeto pero si desde las subclases o clases heredadas.
    }

}

// Interfaces: Son similares a una clase abstracta, pero tienen 3 diferencias:
// 1- No pueden tener constructor
// 2- No pueden tener estado
// 3- Permiten simular herencia múltiple (con limitaciones)
// Otra: Los atributos y propiedades de una interfase son predeterminadamente abstractos.
// Por lo que no llevan el abstract delante de los atributos o propiedades.
// Los metodos dentro de las interfaces solo pueden ser publicos y privados

