package com.example.calculadorapro;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainCalcActivity extends AppCompatActivity implements View.OnClickListener {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonSuma, buttonResta, buttonDivision,
            buttonMul, button10, buttonC, buttonIgu, buttonRaiz, buttonPot, buttonArCir, buttonLCir;

    EditText calc_cesurEditText;

    boolean calc_cesurSuma, mResta, calc_cesurMultiplicacion, calc_cesurDivision, calc_cesurRaiz, calc_cesurPot, calc_cesurArCir, calc_cesurLCir;

    float mValueOne;
    float mValueTwo;

    double ValueRaiz;
    double radio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calc);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonSuma = (Button) findViewById(R.id.buttonsuma);
        buttonResta = (Button) findViewById(R.id.buttonresta);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonRaiz = (Button) findViewById(R.id.buttonRaiz);
        buttonPot = (Button) findViewById(R.id.buttonPot);
        buttonArCir = (Button) findViewById(R.id.buttonArCir);
        buttonLCir = (Button) findViewById(R.id.buttonLCir);
        button9 = (Button) findViewById(R.id.button9);
        buttonIgu = (Button) findViewById(R.id.buttonIgu);
        calc_cesurEditText = (EditText) findViewById(R.id.edt1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc_cesurEditText.setText(calc_cesurEditText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc_cesurEditText.setText(calc_cesurEditText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc_cesurEditText.setText(calc_cesurEditText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc_cesurEditText.setText(calc_cesurEditText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc_cesurEditText.setText(calc_cesurEditText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc_cesurEditText.setText(calc_cesurEditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc_cesurEditText.setText(calc_cesurEditText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc_cesurEditText.setText(calc_cesurEditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc_cesurEditText.setText(calc_cesurEditText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc_cesurEditText.setText(calc_cesurEditText.getText() + "0");
            }
        });


        //SUMA

      /* Declaramos "null" la variable "calc_cesurEditText" para que no devuelva un valor por defecto,
       sino el texto que introduzcamos.
       A continuación, convertimos en String el valor Float de la variable ,ValueOne, que previamente
         declaramos como float en el main */

        buttonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (calc_cesurEditText == null) {
                    calc_cesurEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(calc_cesurEditText.getText() + "");
                    calc_cesurSuma = true;
                    calc_cesurEditText.setText(null);
                }
            }
        });

        //RESTA

        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(calc_cesurEditText.getText() + "");
                mResta = true;
                calc_cesurEditText.setText(null);
            }
        });

        //MULTIPLICACIÓN

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(calc_cesurEditText.getText() + "");
                calc_cesurMultiplicacion = true;
                calc_cesurEditText.setText(null);
            }
        });

        //DIVISIÓN

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(calc_cesurEditText.getText() + "");
                calc_cesurDivision = true;
                calc_cesurEditText.setText(null);
            }
        });

        //POTENCIA

        buttonPot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueOne = Float.parseFloat(calc_cesurEditText.getText() + "");
                calc_cesurPot = true;
                calc_cesurEditText.setText(null);
            }
        });


        buttonArCir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* En el método onClick va incluida la operación matemática, ya que el botón actúa de ejecutor
                de la misma; es decir indicamos el número correspondiente al radio y pulsamos el botón del císculo
                 */
                radio = Double.parseDouble(calc_cesurEditText.getText() + "");
                calc_cesurArCir = true;
                calc_cesurEditText.setText(Math.PI * Math.pow(radio,2) + "");
            }
        });

        buttonLCir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* En el método onClick va incluida la operación, al igual que en el caso anerior
                 */
                radio = Double.parseDouble(calc_cesurEditText.getText() + "");
                calc_cesurLCir = true;
                calc_cesurEditText.setText(2*Math.PI*radio + "");
            }
        });

        buttonRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* En el método onClick va incluida la operación, al igual que en los dos casos anteriores
                 */
                ValueRaiz = Double.parseDouble(calc_cesurEditText.getText() + "");
                calc_cesurRaiz = true;
                calc_cesurEditText.setText(Math.sqrt(ValueRaiz) + "");

            }
        });

//=======OPERACIONES ASOCIADAS AL MÉTODO onClick DENTRO DEL BOTÓN "IGUAL"===============

        buttonIgu.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                mValueTwo = Float.parseFloat(calc_cesurEditText.getText() + "");


                if (calc_cesurSuma == true) {
                    calc_cesurEditText.setText(mValueOne + mValueTwo + "");
                    calc_cesurSuma = false;
                }

                if (mResta == true) {
                    calc_cesurEditText.setText(mValueOne - mValueTwo + "");
                    mResta = false;
                }

                if (calc_cesurMultiplicacion == true) {
                    calc_cesurEditText.setText(mValueOne * mValueTwo + "");
                    calc_cesurMultiplicacion = false;
                }

                if (calc_cesurDivision == true) {
                    calc_cesurEditText.setText(mValueOne / mValueTwo + "");
                    calc_cesurDivision = false;
                }


                if (calc_cesurPot == true) {
                    calc_cesurEditText.setText(Math.pow(mValueOne, mValueTwo) + "");
                    calc_cesurPot = false;

                }


            }

        });

        //BOTÓN CLEAR

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc_cesurEditText.setText("");
            }
        });

        //BOTÓN PARA INLUIR DECIMALES

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc_cesurEditText.setText(calc_cesurEditText.getText() + ".");

            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}


