package com.davidbanda.modulosuelo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    Button optimo, medidas, general,recomenda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void abrirOptimo(View view){

        //Objeto para manipular la actividad Menu
        Intent ventanLista= new Intent(getApplicationContext(), SueloOptimoActivity.class);
        startActivity(ventanLista); //Solicitando que se abra el Menu
    }

    public void abrorMedidas(View view){

        //Objeto para manipular la actividad Menu
        Intent ventanLista= new Intent(getApplicationContext(), DispositivosBT.class);
        startActivity(ventanLista); //Solicitando que se abra el Menu
    }

    public void abrirEstadoGeneral(View view){

        //Objeto para manipular la actividad Menu
        Intent ventanLista= new Intent(getApplicationContext(), EstadoGeneralActivity.class);
        startActivity(ventanLista); //Solicitando que se abra el Menu
    }

    public void abrirRecomendaciones(View view){
        //Objeto para manipular la actividad Menu
        Intent ventanLista= new Intent(getApplicationContext(), RecomendacionesActivity.class);
        startActivity(ventanLista); //Solicitando que se abra el Menu
    }


    public void abrirListaTerrenos(View view){
        //Objeto para manipular la actividad Menu
        Intent ventanLista= new Intent(getApplicationContext(), Terrenos.class);
        startActivity(ventanLista); //Solicitando que se abra el Menu
    }


    //vista solo para ver el la vista del arduino
    public void abrirMedidasArduino(View view){
        //Objeto para manipular la actividad Menu
        Intent ventanaArduino= new Intent(getApplicationContext(), TomaMedicionesActivity.class);
        startActivity(ventanaArduino); //Solicitando que se abra el Menu
    }

    public void abrirColorSuelo(View view){
        //Objeto para manipular la actividad Menu
        Intent ventanaSuelo= new Intent(getApplicationContext(), ColorSueloActivity.class);
        startActivity(ventanaSuelo); //Solicitando que se abra el Menu
    }
}
