package com.osorio.junior.laboratoriocalificado02;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PedidoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        TextView nombreClienteTextView = findViewById(R.id.nombreClienteTextView);
        TextView numeroClienteTextView = findViewById(R.id.numeroClienteTextView);
        TextView productosTextView = findViewById(R.id.productosTextView);
        TextView ubicacionTextView = findViewById(R.id.ubicacionTextView);

        // Recibe datos del Intent
        String nombreCliente = getIntent().getStringExtra("nombreCliente");
        String numeroCliente = getIntent().getStringExtra("numeroCliente");
        String productos = getIntent().getStringExtra("productos");
        String ubicacion = getIntent().getStringExtra("ubicacion");

        // Muestra los datos en los TextViews
        nombreClienteTextView.setText(nombreCliente);
        numeroClienteTextView.setText(numeroCliente);
        productosTextView.setText(productos);
        ubicacionTextView.setText(ubicacion);
    }
}
