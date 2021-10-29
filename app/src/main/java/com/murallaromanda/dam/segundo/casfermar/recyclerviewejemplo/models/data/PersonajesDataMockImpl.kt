package com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.models.data

import com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.models.entities.Personaje

class PersonajesDataMockImpl: PersonajesData {
    override fun getLista(): List<Personaje> {
        return listOf(
            Personaje(0,"Daenerys", "Targaryen", "Mother of Dragons", "House Targaryen","www"),
            Personaje(0,"Samwell", "Tarly", "Maester", "House Tarly","www"),
            Personaje(0,"Arya", "Stark", "No One", "House Stark","www"),
            Personaje(0,"Brienne", "Tarth", "Briene of Tarth", "Tarth","www")
        )
    }

}