package com.example.jordan.proyectofinal_perezandrade;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Jordan on 28/06/2017.
 */

public class RegisterActivity extends AppCompatActivity{
    public final static String ARG_PERSONA="arg_persona";

    private EditText etRegisterNombre, etRegisterApellido, etRegisterDireccion, etRegisterEdad, etRegisterDocumento, etRegisterNDocumento, etRegisterBirthday;
    private Button btRegisterGuardar;
    private Persona mPersona;

    private final View.OnClickListener btRegisterGuardarOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(validateFields()){
                if (mPersona == null){
                    mPersona = new Persona();
                    mPersona.setId(java.util.UUID.randomUUID().toString());
                }

                mPersona.setNombre(etRegisterNombre.getText().toString());
                mPersona.setApellido(etRegisterApellido.getText().toString());
                mPersona.setDireccion(etRegisterDireccion.getText().toString());
                mPersona.setEdad(Integer.parseInt(etRegisterEdad.getText().toString()));
                mPersona.setDocumento(etRegisterDocumento.getText().toString());
                mPersona.setNumDocumento(Integer.parseInt(etRegisterNDocumento.getText().toString()));

                Intent intent = new Intent();
                intent.putExtra(ARG_PERSONA, mPersona);
                setResult(RESULT_OK,intent);
                finish();
            }
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        etRegisterNombre = (EditText) findViewById(R.id.etRegisterNombre);
        etRegisterApellido = (EditText) findViewById(R.id.etRegisterApellido);
        etRegisterDireccion = (EditText) findViewById(R.id.etRegisterDireccion);
        etRegisterEdad = (EditText) findViewById(R.id.etRegisterEdad);
        etRegisterDocumento = (EditText) findViewById(R.id.etRegisterDocumento);
        etRegisterNDocumento = (EditText) findViewById(R.id.etRegisterNroDocumento);

        btRegisterGuardar.setOnClickListener(btRegisterGuardarOnClickListener);

        if (getIntent().getExtras() != null && getIntent().getExtras().containsKey(ARG_PERSONA)){
            mPersona = getIntent().getParcelableExtra(ARG_PERSONA);
            setData();
        }
    }

    private void setData(){
        etRegisterNombre.setText(mPersona.getNombre());
        etRegisterApellido.setText(mPersona.getApellido());
        etRegisterDireccion.setText(mPersona.getDireccion());
        etRegisterEdad.setText(mPersona.getEdad());
        etRegisterDocumento.setText(mPersona.getDocumento());
        etRegisterNDocumento.setText(mPersona.getNumDocumento());
    }

    private boolean validateFields(){
        if (etRegisterNombre.getText().toString().trim().isEmpty()){
            Toast.makeText(RegisterActivity.this, "Ingese un nombre", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etRegisterApellido.getText().toString().trim().isEmpty()){
            Toast.makeText(RegisterActivity.this, "Ingese un nombre", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etRegisterDireccion.getText().toString().trim().isEmpty()){
            Toast.makeText(RegisterActivity.this, "Ingese un nombre", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etRegisterEdad.getText().toString().trim().isEmpty()){
            Toast.makeText(RegisterActivity.this, "Ingese un nombre", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etRegisterDocumento.getText().toString().trim().isEmpty()){
            Toast.makeText(RegisterActivity.this, "Ingese un nombre", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etRegisterNDocumento.getText().toString().trim().isEmpty()){
            Toast.makeText(RegisterActivity.this, "Ingese un nombre", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
