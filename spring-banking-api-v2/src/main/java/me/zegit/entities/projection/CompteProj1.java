package me.zegit.entities.projection;

import me.zegit.entities.Compte;
import org.springframework.data.rest.core.config.Projection;

//The projection should be in the same level of the class or in sub-package
@Projection(name = "p1" ,types = Compte.class)
public interface CompteProj1 {
    public Long getCode();
    public double getSolde();
}
