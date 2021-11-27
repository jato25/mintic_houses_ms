package houses_ms.controllers;

import houses_ms.exceptions.BusyInmuebleException;
import houses_ms.exceptions.InmuebleNotFoundException;
import houses_ms.models.Arrendamiento;
import houses_ms.models.Inmueble;
import houses_ms.repositories.ArrendamientoRepository;
import houses_ms.repositories.InmuebleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArrendamientoController {

    private final InmuebleRepository inmuebleRepository;
    private final ArrendamientoRepository arrendamientoRepository;

    public ArrendamientoController(InmuebleRepository inmuebleRepository, ArrendamientoRepository arrendamientoRepository){
        this.arrendamientoRepository = arrendamientoRepository;
        this.inmuebleRepository = inmuebleRepository;
    }

    @PostMapping("/arrendamientos")
    Arrendamiento newArrendamiento(@RequestBody Arrendamiento arrendamiento){
        Inmueble inmueble = inmuebleRepository.findById(arrendamiento.getId_inmueble()).orElse(null);

        if (inmueble == null){
            throw new InmuebleNotFoundException("No se encontró el inmueble especificado");
        }

        if (!inmueble.getDisponible()) {
            throw new BusyInmuebleException("El inmueble que se intenta arrendar se encuentra ocupado");
        }

        inmueble.setDisponible(Boolean.FALSE);
        inmuebleRepository.save(inmueble);

        return arrendamientoRepository.save(arrendamiento);
    }

    @GetMapping("/arrendamientos/{username}")
    List<Arrendamiento> userArrendamientos (@PathVariable String username){
        return arrendamientoRepository.findByArrendatario(username);
    }
}
