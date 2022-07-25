
package com.argprog.portfoliohrp.Controller;

import com.argprog.portfoliohrp.DTO.PersonaDto;
import com.argprog.portfoliohrp.Entity.Persona;
import com.argprog.portfoliohrp.Security.Controller.Mensaje;
import com.argprog.portfoliohrp.Service.ImpPersonaService;
import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @contact pereyrahugor@gmail.com
 * @author pereyra.hugo.r
 */

@RestController
@RequestMapping ("/Persona")
@CrossOrigin (origins = "http://localhost:4200")
public class PersonaController {
    @Autowired
    ImpPersonaService impPersonaService;
    
    @GetMapping ("/Listar")
    public ResponseEntity<Optional<Persona>> getPersona(){
        return new ResponseEntity(impPersonaService.getOne(1),HttpStatus.OK);
        }
    
    @PostMapping ("/Crear")
    public ResponseEntity<?> create(@RequestBody PersonaDto personaDto){
        if(StringUtils.isBlank(personaDto.getName()))
            return new ResponseEntity(new Mensaje("El Nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(personaDto.getLastName()))
            return new ResponseEntity(new Mensaje("El Apellido es obligatorio"), HttpStatus.BAD_REQUEST);
        if(impPersonaService.existsByContact(personaDto.getContact()))
            return new ResponseEntity(new Mensaje("El Correo ingresado ya existe"), HttpStatus.BAD_REQUEST);
        Persona persona = new Persona(personaDto.getName(), personaDto.getText(), personaDto.getLastName(),
                                      personaDto.getDescription(), personaDto.getImgPerfil(), personaDto.getImgBanner(),
                                      personaDto.getCountry(), personaDto.getEstate(), personaDto.getContact());
        impPersonaService.save(persona);
        return new ResponseEntity(new Mensaje("Nueva Persona Agregada Correctamente"), HttpStatus.OK);
    }
    
    @PutMapping ("/Actualizar/{id}")
    public ResponseEntity<?> update(@PathVariable("id")long id, @RequestBody PersonaDto personaDto){
        if(!impPersonaService.existById(id))
            return new ResponseEntity(new Mensaje("El ID no Existe"),HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(personaDto.getName()))
            return new ResponseEntity(new Mensaje("El Nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(personaDto.getLastName()))
            return new ResponseEntity(new Mensaje("El Apellido es obligatorio"), HttpStatus.BAD_REQUEST);
        Persona persona = impPersonaService.getOne(id).get();
        persona.setName(personaDto.getName());
        persona.setText(personaDto.getText());
        persona.setLastName(personaDto.getLastName());
        persona.setDescription(personaDto.getDescription());
        persona.setImgPerfil(personaDto.getImgPerfil());
        persona.setImgBanner(personaDto.getImgBanner());
        persona.setCountry(personaDto.getCountry());
        persona.setEstate(personaDto.getEstate());
        persona.setContact(personaDto.getContact());
            impPersonaService.save(persona);
            return new ResponseEntity(new Mensaje("Datos Personales Actualizados Correctamente"), HttpStatus.OK);
    }
    
}
    
