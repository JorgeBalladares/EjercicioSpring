package com.example.BS2.Spring;


import java.util.List;

public interface PersonaService {


    public void setNombre(String setNombre);

    public void setPoblacion(String poblacion);

    public void setEdad(String edad);

    public String getEdad();

    public Persona getPersona();
    public List<Ciudad> ListaCiudad();

    public List<Ciudad> getListaCiudad();
    public void addCiudad(Ciudad c);

    public Persona getPersona1();
    public Persona getPersona2();
    public Persona getPersona3();
}
