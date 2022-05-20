package com.example.BS2.Spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( value = "/controlador2")
public class controlador2{
    @Autowired
    PersonaService personaService;
    @GetMapping("/getPersona")
    public String getPersona(@RequestHeader("nombre") String nombre, @RequestHeader("edad") String edad,
                            @RequestHeader("poblacion") String poblacion) {
        personaService.setNombre(nombre);
        personaService.setEdad(edad);
        personaService.setPoblacion(poblacion);
        int valor = Integer.parseInt(personaService.getEdad())*2;
        return String.valueOf(valor);
    }


    @GetMapping("/bean/{name}")
    @ResponseBody
    public Persona obtenerPersona(@PathVariable("name") String name){
        if(name.equals("bean1")){
            return personaService.getPersona1();
        }
        else if (name.equals("bean2")){
            return personaService.getPersona2();
        }
        return personaService.getPersona3();
    }
}

