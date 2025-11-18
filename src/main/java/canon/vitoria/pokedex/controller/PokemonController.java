package canon.vitoria.pokedex.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/pokemons")
public class PokemonController {
    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    //    private final PokemonValidator validator;
//
//    @InitBinder
//    public void initBinder (WebDataBinder binder) {
//        binder.addValidators(validator);
//    }
    @PostMapping
    public <CreatePokemonDTO> ResponseEntity<Void> addPokemon(@RequestBody CreatePokemonDTO pokemonDTO) {
        pokemonService.CreatePokemon(pokemonDTO);
        return ResponseEntity.ok().build();
    }

    private class PokemonService {
        public void CreatePokemon(CreatePokemonDTO pokemonDTO) {
        }
    }
}
