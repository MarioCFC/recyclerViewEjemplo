package com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.models.data

import com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.models.entities.Personaje

class PersonajesDataMockImpl: PersonajesData {
    override fun getLista(): List<Personaje> {
        return listOf(
            Personaje(0,"Daenerys", "Targaryen", "Mother of Dragons", "House Targaryen","https://microsofters.com/wp-content/uploads/2018/10/github2.jpg"),
            Personaje(0,"Samwell", "Tarly", "Maester", "House Tarly","https://thronesapi.com/assets/images/sam.jpg"),
            Personaje(0,"Arya", "Stark", "No One", "House Stark","https://thronesapi.com/assets/images/arya-stark.jpg"),
            Personaje(0,"Brienne", "Tarth", "Briene of Tarth", "Tarth","https://thronesapi.com/assets/images/brienne-tarth.jpeg")
        )
    }

}