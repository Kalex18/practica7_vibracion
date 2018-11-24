package com.example.kalex.fragmentos;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,frg_un.OnFragmentInteractionListener,frg_dos.OnFragmentInteractionListener{

    Button botonFrgUno, botonFrgDos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonFrgUno =(Button) findViewById(R.id.btnFrgUno);
        botonFrgDos =(Button) findViewById(R.id.btnFrgDos);
        botonFrgUno.setOnClickListener(this);
        botonFrgDos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnFrgUno:
                frg_un fragmentoUno = new frg_un();
                FragmentTransaction transaccionUno = getSupportFragmentManager().beginTransaction();
                transaccionUno.replace(R.id.contenedor, fragmentoUno);
                transaccionUno.commit();
                break;
            case R.id.btnFrgDos:
                frg_dos fragmentoDos = new frg_dos();
                FragmentTransaction transaccionDos = getSupportFragmentManager().beginTransaction();
                transaccionDos.replace(R.id.contenedor, fragmentoDos);
                transaccionDos.commit();
                break;
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}

