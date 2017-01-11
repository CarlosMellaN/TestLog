package com.example.casa.testlog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;



public class Main2Activity extends AppCompatActivity {

    TextView tv_resultado;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv_resultado = (TextView)findViewById(R.id.tv_resultado);

    }

}
