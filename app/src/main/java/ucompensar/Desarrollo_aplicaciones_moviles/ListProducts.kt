package ucompensar.Desarrollo_aplicaciones_moviles

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ListProducts : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lista_productos)

        val floatingBtn = findViewById<FloatingActionButton>(R.id.fabCarrito)
        floatingBtn.setOnClickListener {
            val intent = Intent(this, CarritoActivity::class.java)
            startActivity(intent)
        }

        // Lista de productos (puedes reemplazarlo con tu propia lista de productos)
        val productList = listOf(
            // Agregar productos según sea necesario
            Producto("Computador Portatil HP", "Pavilion Intel Core i5 1235U RAM 8 GB 512 GB SSD 15eg2519la", "Rango de Almacenamiento 501 GB a 1 TB", "$2.249.000", R.drawable.imagen_1),
            Producto("Computador Portatil ACER", "Aspire 5 Intel Core i5 12450H RAM 8 GB 512 GB SSD A51557579J", "Rango de Almacenamiento 501 GB a 1 TB","$2.099.480",R.drawable.imagen_2),
            Producto("Computador Portatil ASUS", "Vivobook Go 15 AMD Ryzen 5 7520U RAM 8 GB 512 GB SSD E1504FANJ475W", "Rango de Almacenamiento 501 GB a 1 TB","$1.835.490",R.drawable.imagen_3),
            Producto("APPLE", "MacBook Air APPLE MGN63LA/A Apple M1 8 Núcleos 8 GB RAM 256 GB SSD", "Rango de Almacenamiento 1 GB a 256 GB","$4.112.640", R.drawable.imagen_4),
        )

        // Encuentra el RecyclerView en el layout
        val recyclerView: RecyclerView = findViewById(R.id.products_recycler_view)

        // Crea un adaptador para la lista de productos
        val adapter = ProductAdapter(productList)

        // Asigna el adaptador al RecyclerView
        recyclerView.adapter = adapter

        // Asigna un LinearLayoutManager al RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
