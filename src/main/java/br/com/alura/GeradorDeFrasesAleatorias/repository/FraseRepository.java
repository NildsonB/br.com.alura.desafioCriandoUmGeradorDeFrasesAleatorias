package br.com.alura.GeradorDeFrasesAleatorias.repository;

import br.com.alura.GeradorDeFrasesAleatorias.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    public Frase fraseAleatoria();
}
