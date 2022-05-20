package com.example.BS2.Spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
//@RequestMapping( value = "/controlador1")
public class Controlador1{

@Autowired
PersonaService personaService;
    @GetMapping("controlador1/addPersona")
    public Persona getEncabezado(@RequestHeader("nombre") String nombre, @RequestHeader("poblacion") String poblacion,
                                @RequestHeader("edad") String edad) {
        personaService.setNombre(nombre);
        personaService.setEdad(edad);
        personaService.setPoblacion(poblacion);
        return personaService.getPersona();
    }





    @Qualifier (value="listaUsuario")
    @PostMapping("controlador1/addCiu")
    public List<Ciudad> addCiudad (@RequestBody Ciudad ciud){
        personaService.addCiudad(ciud);
        List<Ciudad> ListaDos = personaService.getListaCiudad();
        return ListaDos;
    }
}
