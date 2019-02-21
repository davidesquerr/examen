package com.example.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Txt1;
    TextView Txt2;
    TextView Txt3;
    TextView Txt4;
    TextView Txt5;
    TextView Txt6;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*TextView Txt1 = (TextView)findViewById(R.id.Txt1);
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
        Txt6.setText("Esta es la tercera pelicula de ralph");*/



/*         txt = (TextView) findViewById(R.id.text);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("THE MAGIC IS FLOWING"); */


    final TextView Txt1 = (TextView)findViewById(R.id.Txt1);
   final TextView Txt2 = (TextView)findViewById(R.id.Txt2);
   final TextView Txt3 = (TextView)findViewById(R.id.Txt3);
   final TextView Txt4 = (TextView)findViewById(R.id.Txt4);
   final TextView Txt5 = (TextView)findViewById(R.id.Txt5);
   final TextView Txt6 = (TextView)findViewById(R.id.Txt6);
   Button btn = (Button) findViewById(R.id.btn);

   btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Txt1.setText("Como entrenar a mi dragon 3");
                Txt2.setText("Esta es una pelicula para entrenar a tu dragon y es la tercera edicion");
                Txt3.setText("Lego 2");
                Txt4.setText("esta es la segunda pelicula de lego animada donde usan legos");
                Txt5.setText("Ralph el destructor");
                Txt6.setText("Esta es la tercera pelicula de ralph");
            }
            });

    }
}
