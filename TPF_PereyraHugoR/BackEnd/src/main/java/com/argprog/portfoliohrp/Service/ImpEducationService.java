
package com.argprog.portfoliohrp.Service;

import com.argprog.portfoliohrp.Entity.Education;
import com.argprog.portfoliohrp.Interface.IEducationService;
import com.argprog.portfoliohrp.Repository.IEducationRes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author perey r
 */

@Service
public class ImpEducationService implements IEducationService{
    @Autowired IEducationRes ieducationRes;
    
    @Override
    public List<Education> getEducation() {
        List<Education> education = ieducationRes.findAll();
        return education;
    }

    @Override
    public void saveEducation(Education education) {
        ieducationRes.save(education);
    }

    @Override
    public void deleteEducation(Long id) {
        ieducationRes.deleteById(id);
    }

    @Override
    public Education findEducation(Long id) {
        Education education = ieducationRes.findById(id).orElse(null);
        return education;
    }
}
