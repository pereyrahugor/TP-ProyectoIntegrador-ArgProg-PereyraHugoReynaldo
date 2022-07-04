
package com.argprog.portfoliohrp.Controller;

import com.argprog.portfoliohrp.Entity.Social;
import com.argprog.portfoliohrp.Interface.ISocialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author perey r
 */

@RestController
public class SocialController {
        @Autowired ISocialService isocialService;
    
    @GetMapping ("RedesSociales/Buscar")
    public List<Social> getSocial(){
        return isocialService.getSocial();
    }
    
    @PostMapping ("RedesSociales/Crear")
    public String crearSocial (@RequestBody Social social){
        isocialService.saveSocial(social);
        return "Nueva Red Social creada con exito!";
    }
    
    @DeleteMapping ("RedesSociales/Borrar/{id}")
    public String deleteSocial (@PathVariable Long id){
        isocialService.deleteSocial(id);
        return "Red Social id " + id + " fue Eliminada con exito!";
    }
    
    @PutMapping ("RedesSociales/Editar/{id}")
    public Social editSocial (@PathVariable Long id,
                              @RequestParam("imgRed")    String newImgSocial,
                              @RequestParam("nombreRed") String newNameSocial,
                              @RequestParam("linkRed")   String newLinkSocial) {
        
        Social social = isocialService.findSocial(id);
        
        social.setImgSocial(newImgSocial);
        social.setNameSocial(newNameSocial);
        social.setLinkSocial(newLinkSocial);

        
        isocialService.saveSocial(social);
        
        return social;
    }
}
