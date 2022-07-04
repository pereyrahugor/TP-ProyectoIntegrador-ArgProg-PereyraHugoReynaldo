
package com.argprog.portfoliohrp.Controller;

import com.argprog.portfoliohrp.Entity.Project;
import com.argprog.portfoliohrp.Interface.IProjectService;
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
public class ProjectController {
    @Autowired IProjectService iprojectService;
    
    @GetMapping ("Proyectos/Buscar")
    public List<Project> getSocial(){
        return iprojectService.getProject();
    }
    
    @PostMapping ("Proyectos/Crear")
    public String crearProject (@RequestBody Project project){
        iprojectService.saveProject(project);
        return "Nuevo Proyecto creada con exito!";
    }
    
    @DeleteMapping ("Proyectos/Borrar/{id}")
    public String deleteProject (@PathVariable Long id){
        iprojectService.deleteProject(id);
        return "Proyecto id " + id + " fue Eliminada con exito!";
    }
    
    @PutMapping ("Proyectos/Editar/{id}")
    public Project editProject (@PathVariable Long id,
                                @RequestParam("imgProyecto")         String newImgProject,
                                @RequestParam("descripcionProyecto") String newDescriptionProject,
                                @RequestParam("linkProyecto")        String newLinkProject) {
        
        Project project = iprojectService.findProject(id);
        
        project.setImgProject(newImgProject);
        project.setDescriptionProject(newDescriptionProject);
        project.setLinkProject(newLinkProject);
        
      
        return project;
    }
}
