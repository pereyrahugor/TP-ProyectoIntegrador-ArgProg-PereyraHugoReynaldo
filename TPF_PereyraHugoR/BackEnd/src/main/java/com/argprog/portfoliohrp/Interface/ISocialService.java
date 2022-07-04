
package com.argprog.portfoliohrp.Interface;

import com.argprog.portfoliohrp.Entity.Social;
import java.util.List;

/**
 *
 * @author perey r
 */
public interface ISocialService {
    //Buscar Lista Social
    public List <Social> getSocial ();
    
    //Crear objeto Social
    public void saveSocial (Social social);
    
    //Busca y Eliminar Social
    public void deleteSocial (Long id);
    
    //Buscar Social
    public Social findSocial (Long id);
}
