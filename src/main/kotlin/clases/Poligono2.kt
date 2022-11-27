package clases

// Si quiero sumar un identificador como con el otro polígono debo declararlo y sobreescribirlo luego:
interface Poligono2 {

    var identificador : String // Es abstracta pero no necesita declararse como tal en una interfase.

    fun obtenerArea(): Double // No le digo que función va a realizar porque depende de la forma concreta del poligono.
    fun obtenerPerimetro(): Double
    fun dibujar()

    fun centimetrosAPulgadas(valor: Double) : Double {
        return (1/2.54) * valor
        // los metodos, de las interfaces, solo pueden ser publicos o privados
    }
}

// La ventaja de las interfaces es que puedo heredar de varias interfaces a la vez en Kotlin
// Mientras que solo puedo heredar de una clase solamente.