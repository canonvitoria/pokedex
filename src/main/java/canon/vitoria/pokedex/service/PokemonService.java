package canon.vitoria.pokedex.service;

import canon.vitoria.pokedex.dto.CriarPokemonDTO;
import canon.vitoria.pokedex.model.Pokemon;
import canon.vitoria.pokedex.model.Tipo;
import canon.vitoria.pokedex.repository.PokemonRepository;
import canon.vitoria.pokedex.repository.TipoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PokemonService {
    private final PokemonRepository pokemonRepository;
    private final TipoRepository tipoRepository;

    public PokemonService(PokemonRepository pokemonRepository, TipoRepository tipoRepository) {
        this.pokemonRepository = pokemonRepository;
        this.tipoRepository = tipoRepository;
    }

    public void criarPokemon(CriarPokemonDTO pokemonDTO){
        List<Tipo> tipos = tipoRepository.findAllById(pokemonDTO.ids());
        var pokemon = new Pokemon();
        pokemon.setId(null);
        pokemon.setNome(pokemonDTO.nome());
        pokemon.setAltura(pokemonDTO.altura());
        pokemon.setPeso(pokemonDTO.peso());
        pokemon.setTipos(new HashSet<>(tipos));

    }
}
