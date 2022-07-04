
package com.argprog.portfoliohrp.Service;

import com.argprog.portfoliohrp.Entity.Experience;
import com.argprog.portfoliohrp.Interface.IExperienceService;
import com.argprog.portfoliohrp.Repository.IExperienceRes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author perey r
 */

@Service
public class ImpExperienceService implements IExperienceService{
    @Autowired IExperienceRes iexperienceRes;
    
    @Override
    public List<Experience> getExperience() {
        List<Experience> experience = iexperienceRes.findAll();
        return experience;
    }

    @Override
    public void saveExperience(Experience experience) {
        iexperienceRes.save(experience);
    }

    @Override
    public void deleteExperience(Long id) {
        iexperienceRes.deleteById(id);
    }

    @Override
    public Experience findExperience(Long id) {
        Experience experience = iexperienceRes.findById(id).orElse(null);
        return experience;
    }
}
