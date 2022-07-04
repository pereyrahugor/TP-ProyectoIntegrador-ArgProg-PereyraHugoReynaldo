
package com.argprog.portfoliohrp.Interface;

import com.argprog.portfoliohrp.Entity.Experience;
import java.util.List;

/**
 *
 * @author perey r
 */
public interface IExperienceService {
    //Buscar Lista Experience
    public List <Experience> getExperience();
    
    //Crear objeto Experience
    public void saveExperience (Experience experience);
    
    //Busca y Eliminar Experience
    public void deleteExperience (Long id);
    
    //Buscar Experience
    public Experience findExperience (Long id);
}
