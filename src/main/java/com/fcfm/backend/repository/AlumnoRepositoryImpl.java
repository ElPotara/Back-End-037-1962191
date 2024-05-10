package com.fcfm.backend.repository;

import com.fcfm.backend.repository.entity.Alumno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class AlumnoRepositoryImpl implements AlumnoRepository{
    @PersistenceContext
    private EntityManager em;
    @Transactional
    public void insertar(Alumno alumno){
        em.persist(alumno);
    }
    @Override
    public Alumno getAlumnoById(Long id){
        return em.find(Alumno.class, id);
    }
    @Transactional
    @Override
    public void eliminar(Long id) {em.remove(getAlumnoById(id));}

    @Transactional
    @Override
    public void actualizar(Alumno alumno) {
        em.merge(alumno);
    }


    @Override
    public List<Alumno> getAllAlumnos() {
        TypedQuery<Alumno> query = em.createQuery("SELECT a FROM Alumno a", Alumno.class);
        return query.getResultList();
    }

}

