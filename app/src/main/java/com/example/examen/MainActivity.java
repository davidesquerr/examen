package com.example.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Txt1;
    TextView Txt2;
    TextView Txt3;
    TextView Txt4;
    TextView Txt5;
    TextView Txt6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Txt1 = (TextView)findViewById(R.id.Txt1);
        Txt1.setText("Como entrenar a mi dragon 3");
        TextView Txt2 = (TextView)findViewById(R.id.Txt2);
        Txt2.setText("Esta es una pelicula para entrenar a tu dragon y es la tercera edicion");
        TextView Txt3 = (TextView)findViewById(R.id.Txt3);
        Txt3.setText("Lego 2");
        TextView Txt4 = (TextView)findViewById(R.id.Txt4);
        Txt4.setText("Cesta es la segunda pelicula de lego animada donde usan legos");
        TextView Txt5 = (TextView)findViewById(R.id.Txt5);
        Txt5.setText("Ralph el destructor");
        TextView Txt6 = (TextView)findViewById(R.id.Txt6);
        Txt6.setText("Esta es la tercera pelicula de ralph");
    }
}
