fun main(){
    println("Ingrese el nombre de su calle: ")
    val calle = readLine().toString()

    println("Ingrese el nombre de su ciudad: ")
    val ciudad = readLine().toString()

    println("Ingrese el nombre de su estado o provincia: ")
    val estado = readLine().toString()

    println("Ingrese el nombre de su país: ")
    val pais = readLine().toString()

    println("Ingrese su codigo postal: ")
    val codigoPostal = readLine().toString()

    println("$calle, $ciudad, $estado, $pais, $codigoPostal")
}