package com.argprog.portfoliohrp.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author pereyra.hugo.r
 */

@Entity
@Setter @Getter
public class Project{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    private Long idPersona;
    
    private String imgProject;
    
    @NotNull
    @Size(min = 1, max = 50, message="no cumple con la longitud")
    private String nameProject;
    
    @NotNull
    @Size(min = 1, max = 50, message="no cumple con la longitud")
    private String descriptionProject;
    
    @NotNull
    @Size(min = 1, max = 50, message="no cumple con la longitud")
    private String linkProject;
        
}