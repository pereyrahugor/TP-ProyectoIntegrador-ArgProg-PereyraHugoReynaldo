
package com.argprog.portfoliohrp.Controller;

import com.argprog.portfoliohrp.Entity.Education;
import com.argprog.portfoliohrp.Interface.IEducationService;
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
public class EducationController {
    @Autowired IEducationService ieducationService;
    
    @GetMapping ("Educacion/Listar")
    public List<Education> getEducation(){
        return ieducationService.getEducation();
    }
    
        @GetMapping ("Educacion/Buscar")
    public Education findEducation(){
        return ieducationService.findEducation((long) 1);
    }
    
    @PostMapping ("Educacion/Crear")
    public String crearEducation (@RequestBody Education education){
        ieducationService.saveEducation(education);
        return "Nueva Educación creada con exito!";
    }
    
    @DeleteMapping ("Educacion/Borrar/{id}")
    public String deleteEducation (@PathVariable Long id){
        ieducationService.deleteEducation(id);
        return "Educación id " + id + " fue Eliminada con exito!";
    }
    
    @PutMapping ("Educacion/Editar/{id}")
    public Education editEducation (@PathVariable Long id,
                                    @RequestParam("ImgInstitute")            String newImgInstitute,
                                    @RequestParam("Title")                   String newTitle,
                                    @RequestParam("YearStudied")            String newYearStudied,
                                    @RequestParam("Duration")                String newDuration,
                                    @RequestParam("DescriptionEducation")    String newDescriptionEducation) {
        
        Education education = ieducationService.findEducation(id);
        
        education.setImgInstitute(newImgInstitute);
        education.setTitle(newTitle);
        education.setYearStudied(newYearStudied);
        education.setDuration(newDuration);
        education.setDescriptionEducation(newDescriptionEducation);

        
        ieducationService.saveEducation(education);
        
        return education;
    }
    
}
