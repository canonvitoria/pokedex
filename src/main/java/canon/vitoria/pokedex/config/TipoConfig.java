package canon.vitoria.pokedex.config;

import canon.vitoria.pokedex.model.Tipo;
import canon.vitoria.pokedex.model.Tipo.*;
import canon.vitoria.pokedex.repository.*;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

public class TipoConfig {
    private final TipoRepository tipoRepository;

    public TipoConfig(TipoRepository tipoRepository) {
        this.tipoRepository = tipoRepository;
    }

    @PostConstruct
    public void init(){
        Tipo tipo = new Tipo();
        tipo.setId(null);
        tipo.setNome(Tipo.NomeTipo.AGUA);
        tipoRepository.save(tipo);

        Tipo tipo2 = new Tipo();
        tipo2.setId(null);
        tipo2.setNome(Tipo.NomeTipo.FOGO);
        tipoRepository.save(tipo2);
    }
}
