package com.example.indv_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText campo_nombre;
    Button boton_agregar;
    TextView mostrar_nombre;
    String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        campo_nombre = findViewById(R.id.add_nombre);
        boton_agregar = findViewById(R.id.btn_nombre);
        mostrar_nombre = findViewById(R.id.display_nombre);

        boton_agregar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Ingrese Numerossssssss", Toast.LENGTH_SHORT).show();
        nombre = campo_nombre.getText().toString();
        mostrar_nombre.setText("Hola " + nombre);
    }
}