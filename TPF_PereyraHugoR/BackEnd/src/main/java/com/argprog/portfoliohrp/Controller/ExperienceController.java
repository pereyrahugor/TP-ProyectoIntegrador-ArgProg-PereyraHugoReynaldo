
package com.argprog.portfoliohrp.Controller;

import com.argprog.portfoliohrp.Entity.Experience;
import com.argprog.portfoliohrp.Interface.IExperienceService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    @GetMapping ("Experiencia/Buscar")
    public List<Experience> getExperience(){
        return iexperienceService.getExperience();
    }
    
    @PostMapping ("Experiencia/Crear")
    public String crearEducation (@RequestBody Experience experience){
        iexperienceService.saveExperience(experience);
        return "Nueva Experiencia creada con exito!";
    }
    
    @DeleteMapping ("Experiencia/Borrar/{id}")
    public String deleteExperience (@PathVariable Long id){
        iexperienceService.deleteExperience(id);
        return "Experiencia id " + id + " fue Eliminada con exito!";
    }
    
    @PutMapping ("Experiencia/Editar/{id}")
    public Experience editExperience (@PathVariable Long id,
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
