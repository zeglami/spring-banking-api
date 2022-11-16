package me.zegit.repositories;

import me.zegit.entities.Compte;
import me.zegit.eums.TypeCompe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte,Long> {
    @RestResource(path="byType")
    List<Compte> findByType(TypeCompe typeCompe);
}
