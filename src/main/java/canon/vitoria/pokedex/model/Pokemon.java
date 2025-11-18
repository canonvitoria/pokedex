package canon.vitoria.pokedex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Set<Tipo> tipo;
    private Float altura;
    private Float peso;

    public void setNome(String nome) {
    }

    public void setId(Object o) {
    }

    public void setAltura(Float altura) {
    }

    public void setPeso(Float peso) {
    }

    public void setTipos(HashSet<Tipo> tipos) {
    }
}
