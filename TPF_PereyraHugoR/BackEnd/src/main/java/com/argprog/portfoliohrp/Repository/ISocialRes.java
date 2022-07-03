
package com.argprog.portfoliohrp.Repository;

import com.argprog.portfoliohrp.Entity.Social;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author perey r
 */

@Repository
public interface ISocialRes extends JpaRepository <Social, Long> {
    
}
