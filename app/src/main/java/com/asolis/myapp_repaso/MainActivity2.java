package com.asolis.myapp_repaso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    //Declaracion componentes
    private EditText campo1, campo2;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Activar componentes para ser utilizados en el main
        campo1 = findViewById(R.id.txtN1);
        campo2 = findViewById(R.id.txtN2);
        resultado = findViewById(R.id.txtResultado);

    }

    //metodos a utilizar
    private void sumar(){
        String num1 = campo1.getText().toString();
        String num2 = campo2.getText().toString();
        if(!num1.isEmpty()&&!num2.isEmpty()){
            int suma = Integer.parseInt(num1)+ Integer.parseInt(num2);
            resultado.setText("La suma es = "+suma);
        }else {
            Toast.makeText(this, "Campos vacíos", Toast.LENGTH_SHORT).show();
        }



    }

    public void onClick(View view) {

        if (view.getId()==R.id.btnSumar){
            this.sumar();
        }


    }
}