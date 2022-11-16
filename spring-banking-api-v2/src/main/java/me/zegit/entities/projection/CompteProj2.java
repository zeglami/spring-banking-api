package me.zegit.entities.projection;

import me.zegit.entities.Compte;
import org.springframework.data.rest.core.config.Projection;

//The projection should be in the same level of the class or in sub-package
@Projection(name = "p2" ,types = Compte.class)
public interface CompteProj2 {
    public Long getCode();
    public String getType();
}
