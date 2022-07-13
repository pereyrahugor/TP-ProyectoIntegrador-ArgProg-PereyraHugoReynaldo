
package com.argprog.portfoliohrp.Controller;

import com.argprog.portfoliohrp.Entity.Persona;
import com.argprog.portfoliohrp.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin (origins = "http://localhost:4200/")
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping ("Personas/Listar")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
    @GetMapping ("Personas/Buscar")
    public Persona findPersona(){
        return ipersonaService.findPersona((long) 1);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("Personas/Crear")
    public String crearPersona (@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "Persona creada con exito!";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("Personas/Borrar/{id}")
    public String deletePersona (@PathVariable long id){
        ipersonaService.deletePersona(id);
        return "Persona id " + id + " fue Eliminada con exito!";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("Personas/Editar/{id}")
    public Persona editPersona (@PathVariable long id,
                                @RequestParam("Name")        String newName,
                                @RequestParam("LastName")    String newLastName,
                                @RequestParam("Text")        String newText,
                                @RequestParam("Description") String newDescription,
                                @RequestParam("ImgPerfil")   String newImgPerfil,
                                @RequestParam("ImgBanner")   String newImgBanner,
                                @RequestParam("Country")     String newCountry,
                                @RequestParam("Estate")      String newEstate,
                                @RequestParam("Contact")     String newContact){
        
        Persona persona = ipersonaService.findPersona(id);
        
        persona.setName(newName);
        persona.setLastName(newLastName);
        persona.setText(newText);
        persona.setDescription(newDescription);
        persona.setImgPerfil(newImgPerfil);
        persona.setImgBanner(newImgBanner);
        persona.setCountry(newCountry);
        persona.setEstate(newEstate);
        persona.setContact(newContact);
        
        
        ipersonaService.savePersona(persona);
        
        return persona;
    }
    
}
