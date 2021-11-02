package com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.R
import com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.adapters.ListaPersonajesAdapters
import com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.databinding.ActivityMainBinding
import com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.models.data.PersonajesData
import com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.models.data.PersonajesDataMockImpl
import com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.models.entities.Personaje

class MainActivity : AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inflamos el layout
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Datos de los personajes
        val personajeData = PersonajesDataMockImpl()
        val lista = personajeData.getLista()
        //Creando los componentes para el recycler
        val layoutManager = LinearLayoutManager(this)
        val adapter = ListaPersonajesAdapters(lista)

        //Asociacion de los datos con los componentes
        binding.rvListaPersonajes.layoutManager = layoutManager
        binding.rvListaPersonajes.adapter = adapter

        //Esto es opcional y solo en caso de que la lista no cambie, optimiza el rendimiento de la visualizacion de la lista, creo
        binding.rvListaPersonajes.setHasFixedSize(true)
    }



}