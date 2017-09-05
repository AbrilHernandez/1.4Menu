package com.example.abril.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Aguachile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aguachile);
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("El aguachile es un platillo típico de la costa pacífica de México, se consume principalmente en el noroeste." +
                "Los principales ingredientes son camarones crudos, chiles frescos o secos, limón (lima en España) y agua, aunque es común acompañarlos de verduras frescas. " +
                "El camarón utilizado debe ser muy fresco para evitar intoxicaciones.");
        ImageView imageView1 = (ImageView)findViewById(R.id.imageView);
         imageView1.setImageResource(R.mipmap.aguachile);
    }
}
