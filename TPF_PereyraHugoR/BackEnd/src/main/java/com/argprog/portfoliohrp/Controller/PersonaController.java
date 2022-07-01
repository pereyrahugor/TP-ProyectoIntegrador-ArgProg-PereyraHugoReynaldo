
package com.argprog.portfoliohrp.Controller;

import com.argprog.portfoliohrp.Entity.Persona;
import com.argprog.portfoliohrp.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author perey r
 */

@RestController
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping ("personas/Buscar")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
    @PostMapping ("Personas/Crear")
    public String crearPersona (@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "Persona creada con exito!";
    }
    
    @DeleteMapping ("Personas/Borrar/{id}")
    public String deletePersona (@PathVariable Long id){
        ipersonaService.deletePersona(id);
        return "Persona id " + id + "fue Eliminada con exito!";
    }
    
    @PutMapping ("Personas/Editar/{id}")
    public Persona editPersona (@PathVariable Long id,
                                @RequestParam("nombre") String newNombre,
                                @RequestParam("apellido") String newApellido,
                                @RequestParam("img") String newImg){
        
        Persona persona = ipersonaService.findPersona(id);
        
        persona.setNombre(newNombre);
        persona.setApellido(newApellido);
        persona.setImg(newImg);
        
        ipersonaService.savePersona(persona);
        
        return persona;
    }
    
}
