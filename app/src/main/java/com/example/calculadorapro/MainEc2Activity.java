package com.example.calculadorapro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/* Siendo sincero, me resulta imposible explicar algo que no comprendo, como es una ecuación
de segundo grado; por tanto, obviaré comentarios al respecto, ya que al margen de los casteos a los
correspondientes espacios de texto y botones, no sabría explicar el método
 */

public class MainEc2Activity extends AppCompatActivity implements View.OnClickListener {

        Button button1, button2,buttonVolver1, buttonSalir1;
        String a_temp;
        EditText b_temp;
        EditText c_temp;
        TextView tv1, tv2;
        Double a,b,c;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_ec2);


            a_temp = ((EditText)findViewById(R.id.editText)).getText().toString();
            if (a_temp.equals("")) {
                a = Double.valueOf(0);
            } else {
                a = Double.valueOf(a_temp);
            }

            b_temp = (EditText)findViewById(R.id.editText2);
            if (!b_temp.getText().toString().equals("")) {
                b = Double.parseDouble(b_temp.getText().toString());
            }else {
                b = Double.valueOf(0);
            }

            c_temp = (EditText)findViewById(R.id.editText3);
            if (!c_temp.getText().toString().equals("")) {
                c = Double.parseDouble(c_temp.getText().toString());
            }else {
                c = Double.valueOf(0);
            }

            tv1 = (TextView) findViewById(R.id.textView2);
            tv2 = (TextView) findViewById(R.id.textView3);

            button1 = (Button) findViewById(R.id.button);
            button2 = (Button) findViewById(R.id.button2);

            buttonVolver1 = (Button) findViewById(R.id.buttonVolver1);
            buttonSalir1 = (Button) findViewById(R.id.buttonSalir1);

            //Botones salir y volver atrás con dos métodos muy sencillos

            buttonVolver1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });


            buttonSalir1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finishAffinity();
                }
            });

            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    if (a == 0) {
                        tv1.setText("No es una ecuación de 2º grado");
                    }else {
                        if (b*b - 4*a*c < 0) {
                            tv1.setText("Esta ecuación de 2º grado no tiene raíces reales");
                        } else {
                            double root1 = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c))/(2*a);
                            double root2 = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c))/(2*a);
                            double result = Math.max(root1,root2);
                            tv1.setText(String.valueOf(result));
                        }
                    }
                }
            });

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    if (a == 0) {
                        tv2.setText("No es una ecuación de 2º grado");
                    }else {
                        if (b * b - 4 * a * c < 0) {
                            tv2.setText("Esta ecuación de 2º grado no tiene raíces reales");
                        } else {
                            double root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
                            double root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
                            double result = Math.min(root1, root2);
                            tv2.setText(" " + result);
                        }
                    }
                };
            });


        }


    @Override
    public void onClick(View v) {

    }


}