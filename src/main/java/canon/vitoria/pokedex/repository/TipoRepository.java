package canon.vitoria.pokedex.repository;

import canon.vitoria.pokedex.model.Tipo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface TipoRepository {
    void save(Tipo tipo);

    List<Tipo> findAllById(Set<Long> ids);
}
