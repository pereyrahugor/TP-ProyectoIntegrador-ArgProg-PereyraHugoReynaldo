
package com.argprog.portfoliohrp.Repository;

import com.argprog.portfoliohrp.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author perey r
 */

@Repository
public interface IProjectRes extends JpaRepository <Project, Long> {
    
}
