package houses_ms.repositories;

import houses_ms.models.Arrendamiento;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ArrendamientoRepository extends MongoRepository<Arrendamiento, String> {

    List<Arrendamiento> findByArrendatario (String arrendatario);

}

