package com.osorio.junior.laboratoriocalificado02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class RegistroPedidosActivity extends AppCompatActivity {

    private EditText nombreClienteEditText;
    private EditText numeroClienteEditText;
    private EditText productosEditText;
    private EditText ciudadEditText;
    private EditText direccionEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_pedidos);

        nombreClienteEditText = findViewById(R.id.nombreClienteEditText);
        numeroClienteEditText = findViewById(R.id.numeroClienteEditText);
        productosEditText = findViewById(R.id.productosEditText);
        ciudadEditText = findViewById(R.id.ciudadEditText);
        direccionEditText = findViewById(R.id.direccionEditText);
        Button registrarButton = findViewById(R.id.registrarButton);

        registrarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistroPedidosActivity.this, PedidoActivity.class);
                intent.putExtra("nombreCliente", nombreClienteEditText.getText().toString());
                intent.putExtra("numeroCliente", numeroClienteEditText.getText().toString());
                intent.putExtra("productos", productosEditText.getText().toString());
                intent.putExtra("ubicacion", ciudadEditText.getText().toString() + ", " + direccionEditText.getText().toString());
                startActivity(intent);
            }
        });
    }
}
