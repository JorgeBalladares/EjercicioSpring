package com.example.BS2.Spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PersonaServiceImp implements PersonaService {
    Persona persona = new Persona();
    Persona persona1;
    Persona persona2 = new Persona();
    Persona persona3 = new Persona();



    List<Ciudad> Listaciudades;

    public String getNombre(){
        return persona.getNombre();
    }
    public void setNombre(String setNombre){
        persona.nombre = setNombre;

    }
    public String getPoblacion() {
        return persona.getPoblacion();
    }

    public void setPoblacion(String setPoblacion) {
        persona.poblacion = setPoblacion;
    }

    public String getEdad() {
        return persona.getEdad();
    }

    public void setEdad(String setEdad) {
        persona.edad = setEdad;
    }

    public Persona getPersona() {
        return persona;
    }

    public List<Ciudad> getListaCiudad() {
        return Listaciudades;
    }
    public void addCiudad(Ciudad c){
        Listaciudades.add(c);
    }

    @Bean(value="listaUsuario")
    public List<Ciudad> ListaCiudad(){
        Listaciudades = new ArrayList<Ciudad>();
        Ciudad c = new Ciudad("Jaen",5568522);
        Ciudad c1 = new Ciudad ("Madrid", 64862236);
        Ciudad c2 = new Ciudad ("Málaga", 1862645);
        Listaciudades.add(c);Listaciudades.add(c1);Listaciudades.add(c2);
        return Listaciudades;
    }

    @Bean(value = "bean1")
    public Persona getPersona1() {
        persona1 = new Persona ("Manuel","Jaen","15");
        return persona1;
    }

    @Bean(value = "bean2")
    public Persona getPersona2() {
        persona2 = new Persona ("Juan","Jaen","16");
        return persona2;
    }

    @Bean(value = "bean3")
    public Persona getPersona3() {
        persona3 = new Persona ("Antonio","Granada","14");
        return persona3;
    }
}
