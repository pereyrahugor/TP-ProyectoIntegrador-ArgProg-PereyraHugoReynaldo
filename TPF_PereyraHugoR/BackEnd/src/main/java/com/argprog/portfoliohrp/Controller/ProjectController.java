
package com.argprog.portfoliohrp.Controller;

import com.argprog.portfoliohrp.Entity.Project;
import com.argprog.portfoliohrp.Interface.IProjectService;
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
@CrossOrigin ("http://localhost:4200")
public class ProjectController {
    @Autowired IProjectService iprojectService;
    
    @GetMapping ("Proyectos/Listar")
    public List<Project> getProject(){
        return iprojectService.getProject();
    }
    
        @GetMapping ("Proyectos/Buscar")
    public Project findProject(long id){
        return iprojectService.findProject(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("Proyectos/Crear")
    public String crearProject (@RequestBody Project project){
        iprojectService.saveProject(project);
        return "Nuevo Proyecto creada con exito!";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("Proyectos/Borrar/{id}")
    public String deleteProject (@PathVariable Long id){
        iprojectService.deleteProject(id);
        return "Proyecto id " + id + " fue Eliminada con exito!";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("Proyectos/Editar/{id}")
    public Project editProject (@PathVariable long id,
                                @RequestParam("ImgProject")         String newImgProject,
                                @RequestParam("NameProject")        String newNameProject,
                                @RequestParam("DescriptionProject") String newDescriptionProject,
                                @RequestParam("LinkProject")        String newLinkProject) {
        
        Project project = iprojectService.findProject(id);
        
        project.setImgProject(newImgProject);
        project.setNameProject(newNameProject);
        project.setDescriptionProject(newDescriptionProject);
        project.setLinkProject(newLinkProject);
        
      
        return project;
    }
}
