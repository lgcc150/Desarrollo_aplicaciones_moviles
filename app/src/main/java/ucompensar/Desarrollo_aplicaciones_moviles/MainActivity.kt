package ucompensar.Desarrollo_aplicaciones_moviles

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.widget.Button
import android.widget.TextView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Encuentra el botón de login por su ID
        val btnLogin = findViewById<Button>(R.id.buttonLogin)

        // Encuentra el TextView de registro por su ID
        val textViewRegister = findViewById<TextView>(R.id.textViewRegister)

        // Configura un OnClickListener para el botón de login
        btnLogin.setOnClickListener {
            // Crea un Intent para dirigirse a ListProducts Activity
            val intent = Intent(this,ListProducts::class.java)
            startActivity(intent) // Inicia la actividad
        }

        // Configura un OnClickListener para el TextView de registro
        textViewRegister.setOnClickListener {
            // Crea un Intent para dirigirse a la actividad de registro (Register)
            val intent = Intent(this, Register::class.java)
            startActivity(intent) // Inicia la actividad de registro
        }
    }
}

