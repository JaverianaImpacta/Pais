package edu.javeriana.ingenieria.social.pais.controlador;

import edu.javeriana.ingenieria.social.pais.dominio.Pais;
import edu.javeriana.ingenieria.social.pais.servicio.ServicioPais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/api/paises")
@CrossOrigin(origins="http://localhost:4200")
public class ControladorPais {
    @Autowired
    private ServicioPais servicio;

    @GetMapping("listar")
    public List<Pais> obtenerPaises() {
        return servicio.obtenerPaies();
    }

    @GetMapping("obtener")
    public ResponseEntity<Pais> obtenerPais(@RequestParam Integer codigoTelefonico) {
        if(codigoTelefonico ==  null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if(!servicio.paisExiste(codigoTelefonico)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(servicio.obtenerPais(codigoTelefonico), HttpStatus.OK);
    }

    @GetMapping("obtenerIso2")
    public ResponseEntity<Pais> obtenerPaisIso2(@RequestParam String iso2) {
        if(iso2 ==  null || iso2.isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if(!servicio.paisExisteIso2(iso2)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(servicio.obtenerPaisIso2(iso2), HttpStatus.OK);
    }

    @GetMapping("obtenerIso3")
    public ResponseEntity<Pais> obtenerPaisIso3(@RequestParam String iso3) {
        if(iso3 ==  null || iso3.isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if(!servicio.paisExisteIso3(iso3)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(servicio.obtenerPaisIso3(iso3), HttpStatus.OK);
    }
}
