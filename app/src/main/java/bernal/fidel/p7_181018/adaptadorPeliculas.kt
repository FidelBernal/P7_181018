package bernal.fidel.p7_181018

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class adaptadorPeliculas:BaseAdapter {

    lateinit var context:Context
    var peliculas:ArrayList<pelicula>

    constructor(context: Context, pelis:ArrayList<pelicula>){
        this.context=context
        this.peliculas=pelis
    }

    override fun getCount(): Int {
        return peliculas.size
    }

    override fun getItem(p0: Int): Any {
        return peliculas[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val inflador = LayoutInflater.from(context)
        var vista=inflador.inflate(R.layout.pelicula_view,null)

        var imagen: ImageView =vista.findViewById(R.id.img_view)
        var titulo:TextView=vista.findViewById(R.id.tv_nombre)

        var pelicula:pelicula = peliculas[p0]
        imagen.setImageResource(pelicula.img)
        titulo.setText(pelicula.nombre)

        return vista

    }
}

