package pewordpress.ver.viajamas.viajamas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class EscogeDestino extends AppCompatActivity {

    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escoge_destino);
        tv1 = (TextView)findViewById(R.id.nombre);

        String dato = getIntent().getStringExtra("dato");
        tv1.setText("Hola " + dato + "!");

    }
    //Método para el botón Regresar

    public void Regresar(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    //Método para el botón BTacna
    public void Tacna(View view) {
      Intent i = new Intent(this, MainActivityTacna.class);
        startActivity(i);
   }
    //Método para el botón BLima

    public void Lima(View view){
        Intent i = new Intent(this, MainActivityLima.class);
        startActivity(i);
    }
    //Método para el botón BCuzco

    public void Cuzco(View view){
        Intent i = new Intent(this, MainActivityCuzco.class);
        startActivity(i);
    }
    //Método para el botón BTarapoto

    public void Tarapoto(View view){
        Intent i = new Intent(this, MainActivityTarapoto.class);
        startActivity(i);
    }
    //Método para el botón BPiura

    public void Piura(View view){
        Intent i = new Intent(this, MainActivityPiura.class);
        startActivity(i);
    }


}
