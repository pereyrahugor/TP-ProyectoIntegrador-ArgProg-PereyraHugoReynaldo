
package com.argprog.portfoliohrp.Interface;

import com.argprog.portfoliohrp.Entity.Persona;
import java.util.List;

/**
 *
 * @author perey r
 */

public interface IPersonaService {
    //Buscar Lista Personas
    public List <Persona> getPersona();
    
    //Crear objeto Përsona
    public void savePersona (Persona persona);
    
    //Busca y Eliminar Persona
    public void deletePersona (Long id);
    
    //Buscar Persona
    public Persona findPersona (Long id);
    
}
