package com.example.pdm_stevenchen

import org.junit.Test

class Ejercicio3Test {
    @Test
    fun probarEstudiante() {

        val estudiante1 = Estudiante("Steven", "00091523", "Programacion de dispositivos moviles")
        val estudiante2 = Estudiante("Daniel", "00091522", "Programacion de dispositivos moviles")
        val estudiante3 = Estudiante("Josue", "00091524", "Programacion de dispositivos moviles")
        val estudiante4 = Estudiante("Diego", "00091526", "Programacion de dispositivos moviles")
        val estudiante5 = Estudiante("Pepe", "00091527", "Analisis numerico")
        val estudiante6 = Estudiante("Pepa", "00091528", "Analisis numerico")
        val estudiante7 = Estudiante("Pepo", "00091517", "Analisis numerico")

        val ciclo01 = listOf(estudiante1, estudiante2, estudiante3, estudiante4, estudiante5, estudiante6, estudiante7)
        val deMoviles = ciclo01.filter { it.asignatura == "Programacion de dispositivos moviles" }

        println("Estudiantes de Móviles:")
        deMoviles.forEach { println("- ${it.nombreEstudiante} (${it.carnet})") }
    }
}