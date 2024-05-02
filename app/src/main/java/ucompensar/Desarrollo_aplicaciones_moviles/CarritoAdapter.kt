package ucompensar.Desarrollo_aplicaciones_moviles

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class CarritoAdapter(private val productos: List<Producto>) :
    RecyclerView.Adapter<CarritoAdapter.ProductoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductoViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_producto_carrito, parent, false)
        return ProductoViewHolder(itemView)
    }




        override fun onBindViewHolder(holder: ProductoViewHolder, position: Int) {
        val productoActual = productos[position]
        holder.textViewNombre.text = productoActual.nombre
        holder.textViewPrecio.text = productoActual.precio
        holder.textViewDescripcion.text = productoActual.descripcion
        holder.textViewAlmacenamiento.text = productoActual.almacenamiento
        holder.product_image_buy.setImageResource(productoActual.imagen)
    }

    override fun getItemCount() = productos.size

    inner class ProductoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val product_image_buy: ImageView = itemView.findViewById(R.id.product_image_buy)
        val textViewNombre: TextView = itemView.findViewById(R.id.textViewNombre)
        val textViewDescripcion: TextView = itemView.findViewById(R.id.textViewDescripcion)
        val textViewAlmacenamiento: TextView = itemView.findViewById(R.id.textViewAlmacenamiento)
        val textViewPrecio: TextView = itemView.findViewById(R.id.textViewPrecio)


    }
}
