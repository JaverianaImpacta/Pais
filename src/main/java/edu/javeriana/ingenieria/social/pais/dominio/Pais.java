package edu.javeriana.ingenieria.social.pais.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pais {
    @Id
    private Integer id;
    private String nombre, iso2, iso3;
    @Column(name="nombre_internacional")
    private String nombreInternacional;
    @Column(name="codigo_telefonico")
    private Integer codigoTelefonico;
}
