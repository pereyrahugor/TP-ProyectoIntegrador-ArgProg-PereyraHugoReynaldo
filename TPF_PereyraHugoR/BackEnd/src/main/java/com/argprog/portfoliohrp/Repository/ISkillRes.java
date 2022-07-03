
package com.argprog.portfoliohrp.Repository;

import com.argprog.portfoliohrp.Entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author perey r
 */

@Repository
public interface ISkillRes extends JpaRepository <Skill, Long> {
    
}
