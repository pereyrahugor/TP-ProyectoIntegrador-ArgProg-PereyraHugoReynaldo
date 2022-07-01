
package com.argprog.portfoliohrp.Repository;

import com.argprog.portfoliohrp.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author perey r
 */

@Repository
public interface IPersonaRes extends JpaRepository <Persona, Long> {
    
}
