package com.example.logjava;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editCorreo = findViewById(R.id.editCorreo);
        EditText editContrasena = findViewById(R.id.editContrasena);
        Button btnIngreso = findViewById(R.id.btnIngreso);
        btnIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtén los valores ingresados por el usuario
                String correoIngresado = editCorreo.getText().toString();
                String contrasenaIngresada = editContrasena.getText().toString();

                // Verifica las credenciales predeterminadas
                if (correoIngresado.equals("alexisadmin9@hotmail.com") && contrasenaIngresada.equals("1234567891")) {
                    // Credenciales válidas, permite el acceso
                    Intent intent = new Intent(MainActivity.this, Menu.class);
                    startActivity(intent);
                    finish();
                } else {
                    // Credenciales incorrectas, muestra un mensaje de error
                    Toast.makeText(MainActivity.this, "Credenciales incorrectas. Por favor, intenta nuevamente.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}