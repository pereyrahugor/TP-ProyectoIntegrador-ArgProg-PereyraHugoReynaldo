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
public class Persona{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
    @NotNull
    @Size(min = 1, max = 50, message="no cumple con la longitud")
    private String name;
    
    @Size(min = 1, max = 50, message="no cumple con la longitud")
    private String text;
    
    @NotNull
    @Size(min = 1, max = 50, message="no cumple con la longitud")
    private String lastName;
    
    @NotNull
    @Size(min = 1, max = 50, message="no cumple con la longitud")
    private String description;
    
    private String imgPerfil;
    
    private String imgBanner;
    
    @NotNull
    @Size(min = 1, max = 50, message="no cumple con la longitud")
    private String country;
        
    @NotNull
    @Size(min = 1, max = 50, message="no cumple con la longitud")
    private String estate;
            
    @NotNull
    @Size(min = 1, max = 50, message="no cumple con la longitud")
    private String contact;
}