package gutierrez.rodrigo.milista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val herramientas = listOf(
            Herramienta(R.drawable.llaveinglesa, "Llave Inglesa", "También conocidas como ajustables, son útiles para trabajar con tuercas y pernos de diferentes tamaños."),
            Herramienta(R.drawable.llavealen, "Llave Alen", "Se utilizan para apretar y aflojar tornillos con cabezas hexagonales internas."),
            Herramienta(R.drawable.martillo, "Martillo", "Es una herramienta básica y versátil utilizada en una variedad de trabajos."),
            Herramienta(R.drawable.llavetrinquete, "Llave Trinquete", " Estas llaves tienen un mecanismo de trinquete que permite apretar o aflojar tuercas y pernos."),
                    Herramienta(R.drawable.llaveinglesa, "Llave Inglesa", "También conocidas como ajustables, son útiles para trabajar con tuercas y pernos de diferentes tamaños."),
        Herramienta(R.drawable.llavealen, "Llave Alen", "Se utilizan para apretar y aflojar tornillos con cabezas hexagonales internas."),
        Herramienta(R.drawable.martillo, "Martillo", "Es una herramienta básica y versátil utilizada en una variedad de trabajos."),
        Herramienta(R.drawable.llavetrinquete, "Llave Trinquete", " Estas llaves tienen un mecanismo de trinquete que permite apretar o aflojar tuercas y pernos.")
        )

        val recycler_herramientas: RecyclerView = findViewById(R.id.list_view)
        recycler_herramientas.layoutManager = LinearLayoutManager(this)
        recycler_herramientas.adapter = AdaptadorHerramientas(herramientas)
    }
}