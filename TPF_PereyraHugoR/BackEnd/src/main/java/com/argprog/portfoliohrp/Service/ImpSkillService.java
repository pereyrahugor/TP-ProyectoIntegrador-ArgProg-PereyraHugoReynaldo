
package com.argprog.portfoliohrp.Service;

import com.argprog.portfoliohrp.Entity.Skill;
import com.argprog.portfoliohrp.Interface.ISkillService;
import com.argprog.portfoliohrp.Repository.ISkillRes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author perey r
 */

@Service
public class ImpSkillService implements ISkillService{
    @Autowired ISkillRes iskillRes;
    
    @Override
    public List<Skill> getSkill() {
        List<Skill> skill = iskillRes.findAll();
        return skill;
    }

    @Override
    public void saveSkill(Skill skill) {
        iskillRes.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        iskillRes.deleteById(id);
    }

    @Override
    public Skill findSkill(Long id) {
        Skill skill = iskillRes.findById(id).orElse(null);
        return skill;
    }
}
