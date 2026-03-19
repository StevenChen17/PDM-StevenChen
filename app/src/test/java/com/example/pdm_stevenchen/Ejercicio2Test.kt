package com.example.pdm_stevenchen

import org.junit.Test
import kotlin.math.truncate

class Ejercicio2Test {
    @Test
    fun probarCalculadora(){

        val calc1= Calculadora("Casio", 2, 34.99)

        println(calc1.sumar(10.00,10.00))
        println(calc1.restar(10.00, 20.05))
        println(calc1.multiplcar(10.00, 3.1415))
        println(calc1.dividir(10.00, 0.00))
    }
}