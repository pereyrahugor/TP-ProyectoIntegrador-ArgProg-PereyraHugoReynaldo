
package com.argprog.portfoliohrp.Service;

import com.argprog.portfoliohrp.Entity.Project;
import com.argprog.portfoliohrp.Interface.IProjectService;
import com.argprog.portfoliohrp.Repository.IProjectRes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author perey r
 */

@Service
public class ImpProjectService implements IProjectService{
    @Autowired IProjectRes iprojectRes;
    
    @Override
    public List<Project> getProject() {
        List<Project> project = iprojectRes.findAll();
        return project;
    }

    @Override
    public void saveProject(Project project) {
        iprojectRes.save(project);
    }

    @Override
    public void deleteProject(Long id) {
        iprojectRes.deleteById(id);
    }

    @Override
    public Project findProject(Long id) {
        Project project = iprojectRes.findById(id).orElse(null);
        return project;
    }
}
