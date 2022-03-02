package bernal.fidel.p7_181018

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    var peliculas: ArrayList<pelicula> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llenarpeliculas()
        var adapter=adaptadorPeliculas(this,peliculas)
        var listView:ListView=findViewById(R.id.listv)
        listView.adapter=adapter

    }

    fun llenarpeliculas(){
        val pelicula1=pelicula(id = 1,getString(R.string.peli1), getString(R.string.peli_desc1),200,R.drawable.padrino)
        peliculas.add(pelicula1)
        val pelicula2=pelicula(id = 2,getString(R.string.peli2), getString(R.string.peli_desc2),148,R.drawable.spiderman)
        peliculas.add(pelicula2)
        val pelicula3=pelicula(id = 3,getString(R.string.peli3), getString(R.string.peli_desc3),95,R.drawable.digimon)
        peliculas.add(pelicula3)
        val pelicula4=pelicula(id = 4,getString(R.string.peli4), getString(R.string.peli_desc4),176,R.drawable.batman)
        peliculas.add(pelicula4)
        val pelicula5=pelicula(id = 5,getString(R.string.peli5), getString(R.string.peli_desc5),116,R.drawable.uncharted)
        peliculas.add(pelicula5)
    }
}