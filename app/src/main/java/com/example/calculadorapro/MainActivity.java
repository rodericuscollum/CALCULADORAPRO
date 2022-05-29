package com.example.calculadorapro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button areaTrianguloButton;
    private Button ecuacion2GradButton;
    private Button calcButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        areaTrianguloButton = (Button) findViewById(R.id.start_areaTriangulo_service);
        areaTrianguloButton.setOnClickListener(this);
        ecuacion2GradButton = (Button) findViewById(R.id.start_ecuacion2GradButton_service);
        ecuacion2GradButton.setOnClickListener(this);
        calcButton = (Button) findViewById(R.id.start_calc_service);
        calcButton.setOnClickListener(this);

    }

    //region View.OnClickListener
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.start_ecuacion2GradButton_service:{
               Intent intent = new Intent(this, MainEc2Activity.class);
               startActivity(intent);
            }
                break;
            case R.id.start_areaTriangulo_service:{
                Intent intent = new Intent(this, MainTriActivity.class);
                startActivity(intent);
            }
                break;
            case R.id.start_calc_service: {
                Intent intent = new Intent(this, MainCalcActivity.class);
                startActivity(intent);
            }
                break;
        }
    }
    //endregion
}
