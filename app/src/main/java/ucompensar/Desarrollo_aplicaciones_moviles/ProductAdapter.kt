package ucompensar.Desarrollo_aplicaciones_moviles

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(private val productList: List<Producto>) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    // Define el ViewHolder que contendrá la vista de cada elemento en la lista
    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productName: TextView = itemView.findViewById(R.id.product_name)
        val productDescription: TextView = itemView.findViewById(R.id.product_description)
        val productImage: ImageView = itemView.findViewById(R.id.product_image)
        val productStorage: TextView = itemView.findViewById(R.id.product_storage)
        val productPrice: TextView = itemView.findViewById(R.id.product_price)
    }

    // Crea y devuelve un ViewHolder para cada elemento en la lista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_producto, parent, false)
        return ProductViewHolder(itemView)
    }

    // Une los datos con el ViewHolder
    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val currentItem = productList[position]
        holder.productName.text = currentItem.nombre
        holder.productDescription.text = currentItem.descripcion
        holder.productImage.setImageResource(currentItem.imagen)
        holder.productStorage.text = currentItem.almacenamiento
        holder.productPrice.text = currentItem.precio
    }

    // Devuelve el número total de elementos en la lista
    override fun getItemCount() = productList.size
}