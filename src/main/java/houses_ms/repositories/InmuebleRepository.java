package houses_ms.repositories;

import houses_ms.models.Inmueble;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface InmuebleRepository extends MongoRepository<Inmueble, String> {

    List<Inmueble> findByPropietario (String propietario);
    List<Inmueble> findByDisponible (Boolean disponible);

}
