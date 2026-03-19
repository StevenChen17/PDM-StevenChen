package com.example.pdm_stevenchen

import org.junit.Test

class EjercicioTest {
    @Test
    fun probarComputadora() {
        val comp1 = Computadora("Intel i7", "KIOXIA 256", "Windows 10", 32, 256)
        comp1.encender()
        comp1.cambiarRam(64)
        comp1.cambiarMemoria(512)
        comp1.cambiarSistemaOperativo("Linux Mint")
        comp1.actualizar()

        val programas = listOf("Notion 2026", "Facebook 2024", "Visual Studio Code 2025" )
        val filtrados = programas.filter { it.contains("2026") }

        println("Programas 2026: $filtrados")
        comp1.apagar()
    }
}