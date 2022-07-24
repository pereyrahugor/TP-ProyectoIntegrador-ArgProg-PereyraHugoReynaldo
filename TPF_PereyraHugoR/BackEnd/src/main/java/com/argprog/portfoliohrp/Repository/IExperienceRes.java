
package com.argprog.portfoliohrp.Repository;

import com.argprog.portfoliohrp.Entity.Experience;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author perey r
 */

@Repository
public interface IExperienceRes extends JpaRepository <Experience, Long> {
   
    public Optional<Experience> findByPosition (String position);
    
    public boolean existByPosition(String position);
}
