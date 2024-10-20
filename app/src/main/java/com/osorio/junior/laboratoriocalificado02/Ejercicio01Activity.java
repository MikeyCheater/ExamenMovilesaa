package com.osorio.junior.laboratoriocalificado02;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio01Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio01);  // Asegúrate de que el layout está bien referenciado

        // Inicializa los botones y el View verde usando findViewById
        View greenView = findViewById(R.id.greenView);
        Button showButton = findViewById(R.id.showButton);
        Button hideButton = findViewById(R.id.hideButton);

        // Inicialmente, el View verde está oculto
        greenView.setVisibility(View.GONE);

        // Botón Mostrar: Hace visible el View verde
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                greenView.setVisibility(View.VISIBLE);
            }
        });

        // Botón Ocultar: Oculta el View verde
        hideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                greenView.setVisibility(View.GONE);
            }
        });
    }
}
