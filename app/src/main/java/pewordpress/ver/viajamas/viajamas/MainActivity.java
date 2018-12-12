package pewordpress.ver.viajamas.viajamas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private EditText etn, etp;
    private EditText et1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn = (EditText)findViewById(R.id.user);
        etp = (EditText)findViewById(R.id.password);
        //et1 = (EditText)findViewById(R.id.et1);


    }
    //Método para el botón Registrar
    public void Registrar(View view) {

        String nombre = etn.getText().toString();
        String pass = etp.getText().toString();

        if (nombre.length() == 0) {
            Toast.makeText(this, "Ingresa un nombre!", Toast.LENGTH_LONG).show();
        }
        if (pass.length() == 0) {
            Toast.makeText(this, "Debes ingresar una contraseña!", Toast.LENGTH_LONG).show();
        }
        if (nombre.length() != 0 && pass.length() != 0) {
            Toast.makeText(this, "Registro en proceso...", Toast.LENGTH_LONG).show();

            Intent siguiente = new Intent(this, EscogeDestino.class);
            startActivity(siguiente);
            Intent i = new Intent(this, EscogeDestino.class);
            i.putExtra("dato", etn.getText().toString());
            startActivity(i);

        }


    }


    }
