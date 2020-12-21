package com.example.transision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.transision.model.Alumno;

public class MainActivity extends AppCompatActivity {
    //String a,b;
    Alumno alumno;
    EditText etNombre,etCuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre=(EditText) findViewById(R.id.etNombre);
        etCuenta=(EditText) findViewById(R.id.etCuenta);
    }

    public void clic(View view) {
        if (validacion()){
            Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();

            Intent i =new Intent(this,MainActivity2.class);
            //a="jordi";
            //b="olivares";
            //i.putExtra("a",a);
            //i.putExtra("b",b);
            alumno=new Alumno(etNombre.getText().toString(),etCuenta.getText().toString());
            Bundle bundle=new Bundle();
            bundle.putSerializable(getResources().getString(R.string.claveAlumno),alumno);
            i.putExtras(bundle);
            startActivity(i);
            finish();
        }
    }

    public boolean validacion(){
        if (etNombre.getText().toString().equals("")){
            etNombre.setError(getResources().getString(R.string.mErrorNombre));
            return false;
        }
        if (etCuenta.getText().toString().equals("")||etCuenta.getText().toString().length()<10){
            etCuenta.setError(getResources().getString(R.string.mErrorCuenta));
            return false;
        }
        return true;
    }
}