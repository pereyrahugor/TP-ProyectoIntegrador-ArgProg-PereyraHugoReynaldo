
package com.argprog.portfoliohrp.Interface;

import com.argprog.portfoliohrp.Entity.Education;
import java.util.List;

/**
 *
 * @author perey r
 */

public interface IEducationService {
     //Buscar Lista Education
    public List <Education> getEducation();
    
    //Crear objeto Education
    public void saveEducation (Education education);
    
    //Busca y Eliminar Education
    public void deleteEducation (Long id);
    
    //Buscar Education
    public Education findEducation (Long id);

}
