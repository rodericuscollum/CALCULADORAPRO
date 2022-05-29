package com.example.calculadorapro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainTriActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonVolver, buttonSalir, buttonResultado;

    double base;
    double altura;

    double calc_areaTri;

    EditText calc_areaTriEditText;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tri);

        final TextView alturaTri = findViewById(R.id.alturaTri);
        final TextView baseTri = findViewById(R.id.baseTri);
        final TextView resultdoAreaTri = findViewById(R.id.resultdoAreaTri);

        buttonVolver = (Button) findViewById(R.id.buttonvVolver);
        buttonSalir = (Button) findViewById(R.id.buttonSalir);
        buttonResultado = (Button) findViewById(R.id.buttonResultado);

        //Primero añado los botones de salir y volver atrás con dos métodos muy sencillos

        buttonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        buttonSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });

        // A continuación añado el método que calcula el área del triángulo

        buttonResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* En el método va incluida la operación, al igual que en los dos casos anteriores
                 */
                base = Double.parseDouble(baseTri.getText() + "");
                altura = Double.parseDouble(alturaTri.getText() + "");

                resultdoAreaTri.setText(base * altura / 2 + "");

            }
        });


    }


    @Override
    public void onClick(View v) {

    }

}









