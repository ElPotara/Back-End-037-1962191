package com.fcfm.backend.model;

import java.sql.Date;

public class Alumno{
    private String primerNombre;
    private String segundoNombre;
    private String apellidoPat;
    private String apellidoMat;
    private String curp;
    private String email;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public String getPrimerNombre() {return primerNombre;}

    public void setPrimerNombre(String primerNombre) {this.primerNombre = primerNombre;}

    public String getSegundoNombre() {return segundoNombre;}

    public void setSegundoNombre(String segundoNombre) {this.segundoNombre = segundoNombre;}

    public String getCurp() {return curp;}

    public void setCurp(String curp) {this.curp = curp;}
}
