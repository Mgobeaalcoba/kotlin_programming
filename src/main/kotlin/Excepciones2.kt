import java.io.File
import java.io.FileNotFoundException
import java.lang.Exception
import java.lang.NumberFormatException

//import java.lang.Exception

fun main() {
    try {
        val repeticiones = readLine()!!.toInt()

        val mensaje = File("C:\\Users\\maria\\Desktop\\mensaje.txt").readLines()[0]
        // Leo y guardo la linea 0 (primera) de mi archivo
        // Cambiar la ruta para probar la primer excepción.

        for (i in 0 until  repeticiones) println(mensaje)

    } catch (e: FileNotFoundException) {

        //e.printStackTrace() // Nos muestra todo el error por consola. De preferencia no hay que mostrarlo al usuario.
        println("Error: ${e.localizedMessage}")
        println("El archivo no existe")

    } catch (e: NumberFormatException) {

        println("Error: ${e.localizedMessage}")
        println("Recuerde que solo puede ingresar numeros positivos. ")

    } catch (e: Exception) {

        println("Error: ${e.localizedMessage}")

    }finally {

        println("Fin del programa")
        //main()
        // El bloque del finally se ejecuta suceda el try o suceda el catch
    }
}
