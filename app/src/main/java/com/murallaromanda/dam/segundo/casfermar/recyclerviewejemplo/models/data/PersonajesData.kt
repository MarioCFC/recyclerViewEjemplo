package com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.models.data

import com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.models.entities.Personaje

interface PersonajesData{
    fun getLista() :  List<Personaje>
}