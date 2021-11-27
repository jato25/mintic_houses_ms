package houses_ms.controllers;

import houses_ms.models.Inmueble;
import houses_ms.repositories.InmuebleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InmuebleController {

    private final InmuebleRepository inmuebleRepository;

    public InmuebleController(InmuebleRepository inmuebleRepository){
        this.inmuebleRepository = inmuebleRepository;
    }

    @GetMapping("/inmuebles/{username}")
    List<Inmueble> getInmuebles(@PathVariable String username){
        List<Inmueble> inmuebles = inmuebleRepository.findByPropietario(username);
        return inmuebles;
    }

    @PostMapping("/inmuebles")
    Inmueble newInmueble(@RequestBody Inmueble newInmueble) {
        return inmuebleRepository.save(newInmueble);
    }

    @GetMapping("/inmueblesDisponibles")
    List<Inmueble> getInmueblesDisponibles(){
       return inmuebleRepository.findByDisponible(Boolean.TRUE);
       //En el front filtrar los inmuebles que corresponde al usuario que realiza la consulta
    }
}
