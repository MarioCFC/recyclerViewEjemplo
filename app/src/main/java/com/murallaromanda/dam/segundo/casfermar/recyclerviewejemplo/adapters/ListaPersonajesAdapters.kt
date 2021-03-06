package com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.R
import com.murallaromanda.dam.segundo.casfermar.recyclerviewejemplo.models.entities.Personaje
import com.squareup.picasso.Picasso

class ListaPersonajesAdapters(val personajes : List<Personaje>): RecyclerView.Adapter<ListaPersonajesAdapters.PersonajeViewHolder>() {
    class PersonajeViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val tvNombre = itemView.findViewById<TextView>(R.id.tVNombreCompleto)
        val tvTitulo = itemView.findViewById<TextView>(R.id.tvTitulo)
        //CAMBIAR POR CADA
        val tvCasa  = itemView.findViewById<TextView>(R.id.tvCasa)
        val ivImagen = itemView.findViewById<ImageView>(R.id.ivImagenPersonaje)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.item_character_list, parent, false)
        return PersonajeViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: PersonajeViewHolder, position: Int) {
        val personaje = personajes.get(position)

        holder.tvNombre.setText(personaje.nombre)
        holder.tvTitulo.setText(personaje.titulo)
        holder.tvCasa.setText(personaje.alias)
        Picasso.get().load(personaje.url).into(holder.ivImagen)
    }

    override fun getItemCount() = personajes.size

}