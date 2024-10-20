package com.osorio.junior.laboratoriocalificado02

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio01)  // Usamos el layout activity_ejercicio01.xml directamente

        // Inicializa los botones y el View verde usando findViewById
        val greenView = findViewById<View>(R.id.greenView)
        val showButton = findViewById<Button>(R.id.showButton)
        val hideButton = findViewById<Button>(R.id.hideButton)

        // Inicialmente, el View verde está oculto
        greenView.visibility = View.GONE

        // Botón Mostrar: Hace visible el View verde
        showButton.setOnClickListener {
            greenView.visibility = View.VISIBLE
        }

        // Botón Ocultar: Oculta el View verde
        hideButton.setOnClickListener {
            greenView.visibility = View.GONE
        }
    }
}
