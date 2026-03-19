package com.example.pdm_stevenchen

class Calculadora(val marca: String, val aniosVida:Int, var precio: Double) {

    fun sumar (a: Double, b: Double): Double {
        return (a+b)
    }

    fun restar(a: Double, b: Double): Double {
        return (a-b)
    }

    fun multiplcar(a: Double, b: Double): Double{
        return (a*b)
    }

    fun dividir(a: Double, b: Double): Double {
        return (a/b)
    }

}