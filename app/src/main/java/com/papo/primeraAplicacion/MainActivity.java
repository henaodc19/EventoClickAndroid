package com.papo.primeraAplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private Button btnAceptar1;
    private Button btnAceptar2;


    /**
     * no es necesario ni declararlo ni intanciarlo
     */
    private Button btnAceptar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
        onClickBtnLegacy();

    }

    private void initComponent(){
        txtNombre = findViewById(R.id.txtNombre);
        btnAceptar1 = findViewById(R.id.btnAceptar1);
        btnAceptar2 = findViewById(R.id.btnAceptar2);
    }

    private void onClickBtnLegacy(){

        btnAceptar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = txtNombre.getText().toString();
                Toast.makeText(getApplicationContext(), nombre, Toast.LENGTH_SHORT).show();
                txtNombre.setText("");
            }
        });
    }
}
