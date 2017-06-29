package com.example.jordan.proyectofinal_perezandrade;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Jordan on 22/06/2017.
 */

public class Persona implements Parcelable {
    private String id;
    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    private String documento;
    private int numDocumento;
    private String birthday;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(int numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.nombre);
        dest.writeString(this.apellido);
        dest.writeString(this.direccion);
        dest.writeInt(this.edad);
        dest.writeString(this.documento);
        dest.writeInt(this.numDocumento);
        dest.writeString(this.birthday);
    }

    public Persona() {
    }

    protected Persona(Parcel in){
        this.id = in.readString();
        this.nombre = in.readString();
        this.apellido = in.readString();
        this.direccion = in.readString();
        this.edad = in.readInt();
        this.documento = in.readString();
        this.numDocumento = in.readInt();
        this.birthday = in.readString();
    }

    public static final Parcelable.Creator<Persona> CREATOR = new Creator<Persona>() {
        @Override
        public Persona createFromParcel(Parcel source) {
            return new Persona(source);
        }

        @Override
        public Persona[] newArray(int size) {
            return new Persona[size];
        }
    };
}
