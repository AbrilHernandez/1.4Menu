package com.example.abril.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu=new ArrayList<String>();

        menu.add("Arroz");
        menu.add("Fajitas de Pollo");
        menu.add("Carne en su jugo");
        menu.add("Empanadas de camaron");
        menu.add("Aguachile");
        menu.add("Pozole");
        menu.add("Tacos");
        menu.add("Tamales");
        AdaptadorMenu adaptador = new AdaptadorMenu(this);
        ListView lv1 = (ListView)findViewById(R.id.list_menu);
        lv1.setAdapter(adaptador);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        lanzar("arroz.class");
                        break;
                    case 4:
                        lanzar("activity_aguachile.class");
                        break;
                }
            }
        });

    }
    public void lanzar(String act){
        if(act.equals("activity_aguachile.class")){
            Intent i = new Intent(this, Aguachile.class);
            startActivity(i);
        }
        if(act.equals("arroz.class")){
            Intent i = new Intent(this, Arroz.class);
            startActivity(i);
        }
    }
    class AdaptadorPlatillos extends ArrayAdapter<String> {
        AppCompatActivity appCompatActivity;
        AdaptadorPlatillos(AppCompatActivity context) {
            super(context, R.layout.platillos, menu);
            appCompatActivity = context;
        }
    }
    class AdaptadorMenu extends ArrayAdapter<String> {
        AppCompatActivity appCompatActivity;
        AdaptadorMenu(AppCompatActivity context) {
            super(context, R.layout.platillos, menu);
            appCompatActivity = context;
        }
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.platillos, null);
            TextView textView1 = (TextView)item.findViewById(R.id.textView);
            textView1.setText(""+menu.get(position).toString());
            ImageView imageView1 = (ImageView)item.findViewById(R.id.imageView);
            if (menu.get(position).toString().equals("Arroz"))
                imageView1.setImageResource(R.mipmap.arroz);
            if (menu.get(position).toString().equals("Fajitas de Pollo"))
                imageView1.setImageResource(R.mipmap.pollofajitas);
            if (menu.get(position).toString().equals("Carne en su jugo"))
                imageView1.setImageResource(R.mipmap.carne);
            if (menu.get(position).toString().equals("Empanadas de camaron"))
                imageView1.setImageResource(R.mipmap.empanada);
            if (menu.get(position).toString().equals("Aguachile"))
                imageView1.setImageResource(R.mipmap.aguachile);
            if (menu.get(position).toString().equals("Pozole"))
                imageView1.setImageResource(R.mipmap.pozole);
            if (menu.get(position).toString().equals("Tacos"))
                imageView1.setImageResource(R.mipmap.tacos);
            if (menu.get(position).toString().equals("Tamales"))
                imageView1.setImageResource(R.mipmap.tamales);
            //imageView1.setImageResource(R.mipmap.ittepic);
            return(item);
        }

    }
    //Intent browserIntent= new Intent (Intent.Action_View,URI.parse("URL"));
    //browserIntent.setPackage("com.android.chrome");
    //startActivity(browserIntent);
}
