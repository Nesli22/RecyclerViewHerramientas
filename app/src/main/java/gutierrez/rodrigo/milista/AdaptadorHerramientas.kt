package gutierrez.rodrigo.milista

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import org.w3c.dom.Text

class AdaptadorHerramientas(val herramientas_list: List<Herramienta>): RecyclerView.Adapter<AdaptadorHerramientas.HerramientaViewHolder>() {

    class HerramientaViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var imagen_herramienta: ImageView = itemView.findViewById(R.id.imagen_herramienta)
        var titulo: TextView = itemView.findViewById(R.id.titulo_herramienta)
        var descripcion: TextView = itemView.findViewById(R.id.descripcion_herramienta)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HerramientaViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.lista_item, parent, false)
        return HerramientaViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return herramientas_list.size
    }

    override fun onBindViewHolder(holder: HerramientaViewHolder, position: Int) {
        val herramienta: Herramienta = herramientas_list[position]
        holder.imagen_herramienta.setImageResource(herramienta.imagen)
        holder.titulo.text = herramienta.titulo
        holder.descripcion.text = herramienta.descripcion
    }
}