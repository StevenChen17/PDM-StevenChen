package com.example.pdm_stevenchen

class Computadora(var cpu: String,
                  var unidad_almacenamiento: String,
                  var sistema_operativo: String,
                  var cantidad_ram: Int,
                  var cantidad_almacenamiento: Int
    )
{

    fun encender(){
        println("Encendido")
    }
    fun apagar(){
        println("Apagando")
    }
    fun actualizar(){
        println("Se esta actualizando. Por favor no apagar")
    }
    fun cambiarRam(nuevaCantidadRam:Int){
        println("RAM: $cantidad_ram GB")
        this.cantidad_ram = nuevaCantidadRam
        println("Se ha cambiado el RAM, RAM: $cantidad_ram GB ")
    }
    fun cambiarMemoria(nuevaCantidadMemoria:Int) {
        println("Cantidad en disco: $cantidad_almacenamiento GB")
        this.cantidad_almacenamiento = nuevaCantidadMemoria
        println("Se ha cambiado el disco, cantidad en disco: $cantidad_almacenamiento GB")
    }

    fun cambiarSistemaOperativo(nuevoSistemaOperativo: String) {
        println("Sistema operativo: $sistema_operativo")
        this.sistema_operativo = nuevoSistemaOperativo
        println("Se ha cambiado de sistema operativo, Sistema Operativo: $sistema_operativo")
    }
}

