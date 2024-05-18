package edu.javeriana.ingenieria.social.pais.servicio;

import edu.javeriana.ingenieria.social.pais.dominio.Pais;
import edu.javeriana.ingenieria.social.pais.repositorio.RepositorioPais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioPais {
    @Autowired
    private RepositorioPais repositorio;

    public List<Pais> obtenerPaies(){
        return repositorio.findAll();
    }

    public Pais obtenerPaisIso2(String iso2){
        return repositorio.findOneByIso2(iso2);
    }

    public Pais obtenerPaisIso3(String iso3){
        return repositorio.findOneByIso3(iso3);
    }

    public Pais obtenerPais(Integer codigoTelefonico){
        return repositorio.findOneByCodigoTelefonico(codigoTelefonico);
    }

    public boolean paisExiste(Integer codigoTelefonico){
        return repositorio.existsByCodigoTelefonico(codigoTelefonico);
    }

    public boolean paisExisteIso2(String iso2){
        return repositorio.existsByIso2(iso2);
    }

    public boolean paisExisteIso3(String iso3){
        return repositorio.existsByIso3(iso3);
    }
}
