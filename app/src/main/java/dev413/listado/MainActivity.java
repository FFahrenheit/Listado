package dev413.listado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView laLista = (ListView) findViewById(R.id.theList);
        OrigenDeDatosDeTarjeta data = new OrigenDeDatosDeTarjeta();
        CardAdapt adapter = new CardAdapt();
        adapter.context=this;
        adapter.data=data.obtenerDatos();
        adapter.images=data.obtenerImagenes();
        laLista.setAdapter(adapter);
    }
}
