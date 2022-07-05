
package com.argprog.portfoliohrp.Controller;

import com.argprog.portfoliohrp.Entity.Skill;
import com.argprog.portfoliohrp.Interface.ISkillService;
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
public class SkillController {
    @Autowired ISkillService iskillService;
    
    @GetMapping ("Habilidades/Buscar")
    public List<Skill> getSkill(){
        return iskillService.getSkill();
    }
    
    @PostMapping ("Habilidades/Crear")
    public String crearSkill (@RequestBody Skill skill){
        iskillService.saveSkill(skill);
        return "Nueva Habilidad creada con exito!";
    }
    
    @DeleteMapping ("Habilidades/Borrar/{id}")
    public String deleteSkill (@PathVariable Long id){
        iskillService.deleteSkill(id);
        return "Habilidad id " + id + " fue Eliminada con exito!";
    }
    
    @PutMapping ("Habilidad/Editar/{id}")
    public Skill editSkill (@PathVariable Long id,
                            @RequestParam("imgHabilidad")    String newImgSkill,
                            @RequestParam("colorInterno")    String newColorIn,
                            @RequestParam("colorExterno")    String newColorOut,
                            @RequestParam("nombreHabilidad") String newNameSkill,
                            @RequestParam("progreso")        int newProgress) {
        
        Skill skill = iskillService.findSkill(id);
        
        skill.setImgSkill(newImgSkill);
        skill.setColorIn(newColorIn);
        skill.setColorOut(newColorOut);
        skill.setNameSkill(newNameSkill);
        skill.setProgress(newProgress);
        
      
        return skill;
    }    
}
