package com.example.abril.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Arroz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arroz);
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("El arroz rojo es una versión de arroz cocinado con jitomate y caldo de pollo que se come" +
                " en gran parte de México y cuya preparación suele ser barata por sus ingredientes" +
                " que incluyen zanahoria, chicharos e incluso camarones");
        ImageView imageView1 = (ImageView)findViewById(R.id.imageView);
        imageView1.setImageResource(R.mipmap.arroz);

    }

}
