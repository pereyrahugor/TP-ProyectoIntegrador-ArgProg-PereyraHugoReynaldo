package com.argprog.portfoliohrp.Entity;
import java.util.Date;
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
public class Experience{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
    private long idPersona;
    
    private String imgBusiness;
    
    @NotNull
    @Size(min = 1, max = 50, message="no cumple con la longitud")
    private String business;
    
    @NotNull
    @Size(min = 1, max = 50, message="no cumple con la longitud")
    private String position;
    
    @NotNull
    @Size(min = 1, max = 10, message="el formato decha es dd/mm/yyyy")
    private Date yearIn;
    
    @Size(min = 1, max = 10, message="el formato decha es dd/mm/yyyy")
    private Date yearOut;
    
    @NotNull
    @Size(min = 1, max = 50, message="no cumple con la longitud")
    private String descriptionPosition;

    public Experience(String imgBusiness, String business, String position, Date yearIn, Date yearOut, String descriptionPosition) {
        this.imgBusiness = imgBusiness;
        this.business = business;
        this.position = position;
        this.yearIn = yearIn;
        this.yearOut = yearOut;
        this.descriptionPosition = descriptionPosition;
    }
    
    
    
}