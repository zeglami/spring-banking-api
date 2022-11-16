package me.zegit.web;

import me.zegit.entities.Compte;
import me.zegit.repositories.CompteRepository;
import org.springframework.cache.interceptor.CacheableOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletionException;

//@RestController
public class CompteRestController {
    private CompteRepository compteRepository;

    public CompteRestController(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }


    @GetMapping(path = "/comptes")
    public List<Compte> listComptes(){

        return compteRepository.findAll();
    }

    @GetMapping(path = "/compte/{id}")
    public Compte getComptes(@PathVariable(name = "id") Long code){

        return compteRepository.findById(code).get();
    }

    @PostMapping(path = "compte")
    public Compte saveCompte(@RequestBody Compte compte){
        return compteRepository.save(compte);
    }


    @PutMapping(path = "compte/{code}")
    public Compte updateCompte(@PathVariable Long code,@RequestBody Compte compte){
        compte.setCode(code);
        return compteRepository.save(compte);
    }

    @DeleteMapping(path = "/compte/{id}")
    public void deleteComptes(@PathVariable(name = "id") Long code){

         compteRepository.deleteById(code);
    }




}
