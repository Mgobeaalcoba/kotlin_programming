package poo

import clases.*

fun main() {

    val lavadora = Lavadora("SD5S84DRTR",TiposDeElectrodomesticos.LAVADORA,Colores.BLANCO,25.0,9500.99, 18.0)
    val microondas = Microondas("AOS87DPSOR",TiposDeElectrodomesticos.MICROONDAS,Colores.NEGRO,8.5,2100.00,1350.0)
    val refrigerador = Refrigerador("SPD08756SR", TiposDeElectrodomesticos.REFRIGERADOR, Colores.GRIS, 47.0, 7899.00,10.0,"0.0 °C conservador","-15.0 °C congelador")

    val listaElectro = arrayListOf(lavadora,microondas,refrigerador)

    println("""
        ## Fabricación de Electrodomesticos ##
        
    """.trimIndent())

    listaElectro.forEach{
        println(it.toString())
    }

    println(" ")
    println("Total de productos fabricados: ${Electrodomestico.totalElectros}")
}