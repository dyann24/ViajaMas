package pewordpress.ver.viajamas.viajamas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityTarapoto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tarapoto);
    }
    //Método para el botón Regresar
    public void RegresarDestinos(View view) {
        Intent i = new Intent(this, EscogeDestino.class);
        startActivity(i);
    }

    //Método para el botón Reservar
    public void Reservar(View view) {

        Toast.makeText(this, "Destino Reservado con Éxito!", Toast.LENGTH_LONG).show();

    }
}
