
package com.argprog.portfoliohrp.Service;

import com.argprog.portfoliohrp.Entity.Persona;
import com.argprog.portfoliohrp.Interface.IPersonaService;
import com.argprog.portfoliohrp.Repository.IPersonaRes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author perey r
 */

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRes ipersonaRes;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRes.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRes.save(persona);
    }

    @Override
    public void deletePersona(long id) {
        ipersonaRes.deleteById(id);
    }

    @Override
    public Persona findPersona(long id) {
        Persona persona = ipersonaRes.findById(id).orElse(null);
        return persona;
    }
    
}
