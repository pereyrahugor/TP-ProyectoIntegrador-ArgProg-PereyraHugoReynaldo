
package com.argprog.portfoliohrp.Interface;

import com.argprog.portfoliohrp.Entity.Skill;
import java.util.List;

/**
 *
 * @author perey r
 */
public interface ISkillService {
   //Buscar Lista Skill
    public List <Skill> getSkill();
    
    //Crear objeto Skill
    public void saveSkill (Skill skill);
    
    //Busca y Eliminar Skill
    public void deleteSkill (Long id);
    
    //Buscar Skill
    public Skill findSkill (Long id);
}
