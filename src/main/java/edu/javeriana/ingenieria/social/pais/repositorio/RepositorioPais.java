package edu.javeriana.ingenieria.social.pais.repositorio;

import edu.javeriana.ingenieria.social.pais.dominio.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioPais extends JpaRepository<Pais, Integer> {
    Pais findOneByCodigoTelefonico(Integer codigoTelefonico);

    Pais findOneByIso2(String iso2);

    Pais findOneByIso3(String iso3);

    boolean existsByCodigoTelefonico(Integer codigoTelefonico);

    boolean existsByIso2(String iso2);

    boolean existsByIso3(String iso3);
}
