
package com.argprog.portfoliohrp.Interface;

import com.argprog.portfoliohrp.Entity.Project;
import java.util.List;

/**
 *
 * @author perey r
 */
public interface IProjectService {
    //Buscar Lista Project
    public List <Project> getProject();
    
    //Crear objeto Project
    public void saveProject (Project project);
    
    //Busca y Eliminar Project
    public void deleteProject (Long id);
    
    //Buscar Project
    public Project findProject (Long id);
}
