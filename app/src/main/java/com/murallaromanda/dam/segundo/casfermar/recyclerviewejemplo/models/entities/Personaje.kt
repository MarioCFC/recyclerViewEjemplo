package com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.models.entities

class Personaje(var id:Long, var nombre:String, var apellidos:String, var titulo:String, var alias:String, var url:String) {

    public fun returnNombre(): String {
        return this.nombre
    }
}