
package com.argprog.portfoliohrp.Controller;

import com.argprog.portfoliohrp.Entity.Experience;
import com.argprog.portfoliohrp.Interface.IExperienceService;
import java.util.Date;
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
@CrossOrigin (origins = "http://localhost:4200")
public class ExperienceController {
    @Autowired IExperienceService iexperienceService;
    
    @GetMapping ("Experiencia/Listar")
    public List<Experience> getExperience(){
        return iexperienceService.getExperience();
    }
    
    @GetMapping ("Experiencia/Buscar")
    public Experience findExperience(){
        return iexperienceService.findExperience((long) 1);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("Experiencia/Crear")
    public String crearEducation (@RequestBody Experience experience){
        iexperienceService.saveExperience(experience);
        return "Nueva Experiencia creada con exito!";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("Experiencia/Borrar/{id}")
    public String deleteExperience (@PathVariable long id){
        iexperienceService.deleteExperience(id);
        return "Experiencia id " + id + " fue Eliminada con exito!";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("Experiencia/Editar/{id}")
    public Experience editExperience (@PathVariable long id,
                                    @RequestParam("imgImgBusiness")        String newImgBusiness,
                                    @RequestParam("Business")           String newBusiness,
                                    @RequestParam("Position")            String newPosition,
                                    @RequestParam("YearIn")       Date newYearIn,
                                    @RequestParam("YearOut")        Date newYearOut,
                                    @RequestParam("DescriptionPosition") String newDescriptionPosition) {
        
        Experience experience = iexperienceService.findExperience(id);
        
        experience.setImgBusiness(newImgBusiness);
        experience.setBusiness(newBusiness);
        experience.setPosition(newPosition);
        experience.setYearIn(newYearIn);
        experience.setYearOut(newYearOut);
        experience.setDescriptionPosition(newDescriptionPosition);

        
        iexperienceService.saveExperience(experience);
        
        return experience;
    }
    
}
