
package com.argprog.portfoliohrp.Repository;

import com.argprog.portfoliohrp.Entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author perey r
 */

@Repository
public interface IExperienceRes extends JpaRepository <Experience, Long> {
    
}
