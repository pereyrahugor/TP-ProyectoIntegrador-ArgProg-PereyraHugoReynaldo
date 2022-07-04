
package com.argprog.portfoliohrp.Service;

import com.argprog.portfoliohrp.Entity.Social;
import com.argprog.portfoliohrp.Interface.ISocialService;
import com.argprog.portfoliohrp.Repository.ISocialRes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author perey r
 */

@Service
public class ImpSocialService implements ISocialService{
    @Autowired ISocialRes isocialRes;
    
    @Override
    public List<Social> getSocial() {
        List<Social> social = isocialRes.findAll();
        return social;
    }

    @Override
    public void saveSocial(Social social) {
        isocialRes.save(social);
    }

    @Override
    public void deleteSocial(Long id) {
        isocialRes.deleteById(id);
    }

    @Override
    public Social findSocial(Long id) {
        Social social = isocialRes.findById(id).orElse(null);
        return social;
    }
}
