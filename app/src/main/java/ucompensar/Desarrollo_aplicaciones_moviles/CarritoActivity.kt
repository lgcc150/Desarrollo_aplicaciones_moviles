package ucompensar.Desarrollo_aplicaciones_moviles

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class CarritoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_carrito)

        // Obtener la lista de productos seleccionados (simulación)
        val productosSeleccionados = mutableListOf(
            Producto("Computador Portatil HP", "Pavilion Intel Core i5 1235U RAM 8 GB 512 GB SSD 15eg2519la", "Rango de Almacenamiento 501 GB a 1 TB", "$2.249.000", R.drawable.imagen_1)
            // Asegúrate de que los objetos Product estén creados correctamente con los parámetros correctos
        )

        // Configurar RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view_carrito)
        val adapter = CarritoAdapter(productosSeleccionados)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
