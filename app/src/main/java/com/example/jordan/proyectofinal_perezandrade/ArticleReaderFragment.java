package com.example.jordan.proyectofinal_perezandrade;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Jordan on 22/06/2017.
 */

public class ArticleReaderFragment extends Fragment {

    EditText etNombre, etApellido, etDireccion, etEdad, etDocumento, etNDocumento, etBirthday;
    Button btnGuardar;

    public final View.OnClickListener btnGuardarOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (validateFields()){
                if (mCallback!=null){
                    Persona mPersona = new Persona();
                    mPersona.setNombre(etNombre.getText().toString());
                    mPersona.setApellido(etApellido.getText().toString());
                    mPersona.setDireccion(etDireccion.getText().toString());
                    mPersona.setEdad(Integer.valueOf(etEdad.getText().toString()));
                    mPersona.setDocumento(etDocumento.getText().toString());
                    mPersona.setNumDocumento(Integer.valueOf(etNDocumento.getText().toString()));
                    mPersona.setBirthday(etBirthday.getText().toString());
                }
            }
        }
    };

    interface Callback{
        void onOneFragmentClick(Persona persona);
    }

    private Callback mCallback;

    public void setmCallback(Callback callback){
        mCallback = callback;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_registro,container,false);
        etNombre = (EditText) view.findViewById(R.id.etRegisterNombre);
        etApellido = (EditText) view.findViewById(R.id.etRegisterApellido);
        etDireccion = (EditText) view.findViewById(R.id.etRegisterDireccion);
        etEdad = (EditText) view.findViewById(Integer.valueOf(R.id.etRegisterEdad));
        etDocumento = (EditText) view.findViewById(R.id.etRegisterDocumento);
        etNDocumento = (EditText) view.findViewById(Integer.valueOf(R.id.etRegisterNroDocumento));
        btnGuardar = (Button) view.findViewById(R.id.btRegisterGuardar);
        btnGuardar.setOnClickListener(btnGuardarOnClickListener);
        return view;
    }


    private boolean validateFields(){
        if (etNombre.getText().toString().trim().isEmpty()){
            Toast.makeText(this.getActivity(),"Ingrese un nombre", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etApellido.getText().toString().trim().isEmpty()){
            Toast.makeText(this.getActivity(),"Ingrese un nombre", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etDireccion.getText().toString().trim().isEmpty()){
            Toast.makeText(this.getActivity(),"Ingrese un nombre", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etEdad.getText().toString().trim().isEmpty()){
            Toast.makeText(this.getActivity(),"Ingrese un nombre", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etDocumento.getText().toString().trim().isEmpty()){
            Toast.makeText(this.getActivity(),"Ingrese un nombre", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etNDocumento.getText().toString().trim().isEmpty()){
            Toast.makeText(this.getActivity(),"Ingrese un nombre", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
