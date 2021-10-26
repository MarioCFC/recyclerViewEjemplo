package com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.R
import com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.databinding.ActivityMainBinding
import com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.models.entities.Personaje

class RecyclerView : AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val rvListaPersonaje: RecyclerView = binding.rvListaPersonajes

        //Tipo de layout
        val layoutManager = LinearLayoutManager(this)
        //Datos de prueba
        val gotCharacterList = listOf(
            Personaje(0,"Daenerys", "Targaryen", "Mother of Dragons", "House Targaryen","www"),
            Personaje(0,"Samwell", "Tarly", "Maester", "House Tarly","www"),
            Personaje(0,"Arya", "Stark", "No One", "House Stark","www"),
            Personaje(0,"Brienne", "Tarth", "Briene of Tarth", "Tarth","www")
        )


    }



}