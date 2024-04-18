package com.fcfm.backend.service;

import com.fcfm.backend.model.Alumno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService{
    List<Alumno> alumnoList = new ArrayList<>();
    public List<Alumno> getAlumnoList(){
        return alumnoList;
    }   //Agregado Linea 14

    public void createAlumno(Alumno newAlumno){
        alumnoList.add(newAlumno);
    } //Agregad Linea 17

    public Alumno getAlumnoById(int id){
        return alumnoList.get(id);
    }   //Agregado Linea 21

    public void deleteAlumno(int id){alumnoList.remove(id);}

    public void updateAlumno(int id, Alumno alumnoNuevo){alumnoList.set(id, alumnoNuevo);}

    public int getAlumnoListSize(){return  alumnoList.size();}
}
