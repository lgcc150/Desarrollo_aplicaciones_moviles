package ucompensar.Desarrollo_aplicaciones_moviles

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro)

        // Encuentra el botón enviar por su ID
        val enviarBtn: Button = findViewById(R.id.buttonRegister) // Asegúrate de tener un botón con este ID en tu layout

        // Establece un OnClickListener para el botón
        enviarBtn.setOnClickListener {
            // Aquí realizas la lógica de registro...
            // ...

            // Después de realizar el registro, muestra el AlertDialog
            val builder = AlertDialog.Builder(this@Register)
            builder.setMessage("Registro exitoso")
                .setCancelable(false)
                .setPositiveButton("OK") { dialog, id ->
                    dialog.dismiss()
                    // Agregar el Intent para dirigirse a ListProductActivity
                    val intent = Intent(this@Register, ListProducts::class.java)
                    startActivity(intent)
                }

            // Crea y muestra el AlertDialog
            val alert = builder.create()
            alert.show()
        }
    }
}
