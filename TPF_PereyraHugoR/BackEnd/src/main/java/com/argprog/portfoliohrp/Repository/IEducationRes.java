
package com.argprog.portfoliohrp.Repository;

import com.argprog.portfoliohrp.Entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author perey r
 */

@Repository
public interface IEducationRes extends JpaRepository <Education, Long> {
    
}
