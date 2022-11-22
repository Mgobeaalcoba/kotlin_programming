import java.text.DecimalFormat
import kotlin.math.round

fun main(){
    val numero1 = 5
    val numero2 = 3
    var numero3 = 10

    numero3 += 5

    println(numero3)

    println(numero1 * numero2)

    numero3++

    println(numero3)

    numero3--

    println(numero3)

    val numero4 = "4"

    println(numero2 * numero4.toInt())

    println("Ingrese un numero: ")
    val numero5 = readLine()!!.toDouble() // Recibo numero y lo convierto a double

    println("Ingreso el numero $numero5")

    val pi = 3.14159

    println(round(pi).toInt())

    println(DecimalFormat("#.##").format(pi))
}
