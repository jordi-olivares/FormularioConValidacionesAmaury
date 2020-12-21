package com.example.transision;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.transision.model.Alumno;

public class MainActivity2 extends AppCompatActivity {
    Alumno alumno;
    String a,b;
    TextView tvNombre,tvCuenta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNombre=(TextView) findViewById(R.id.tvNombre);
        tvCuenta=(TextView)findViewById(R.id.tvCuenta);

        Bundle g=getIntent().getExtras();
        alumno=(Alumno)g.getSerializable(getResources().getString(R.string.claveAlumno));
        a=alumno.getNombre();
        b=alumno.getNumCuenta();
        //Toast.makeText(this,"a: "+a, Toast.LENGTH_LONG).show();
        tvNombre.setText(a);
        tvCuenta.setText(b);
    }
}