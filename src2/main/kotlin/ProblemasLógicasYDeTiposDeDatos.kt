// En Java y Kotlin los enteros tienen un limite chico y los long tmb lo tienen
// Esto nos limita a por ejemplo no poder calcular el exponencial de 20
// Un buen manejo de estos limites podría ser avisar al usuario al llegar a ese
// limite que no podemos continuar corriendo el programa.

fun main() {

    var numero = readLine()!!.toLongOrNull()
    numero?.let {
        if (numero < 0){
            println("Solo se aceptan numeros positivos")
            main()
        }
        var resultado = 1L // 1 en formato Long
        for (i in 1..numero) {
            resultado *= numero // Calculo el exponencial: Multiplico al numero (y luego su resultado) contra todos sus menores hasta el 1
            numero -- // Acá le quito 1 al numero para cumplir la regla del exponencial
            if (resultado < 0){
                println("El resultado es demasiado grande, no se puede calcular")
                return@let // Vuelvo arriba y ejecuto el let para salir del bloque
            }
        }
        println(resultado)
        main()
    }
    main()

}