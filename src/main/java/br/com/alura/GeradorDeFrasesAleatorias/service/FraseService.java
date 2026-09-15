package br.com.alura.GeradorDeFrasesAleatorias.service;

import br.com.alura.GeradorDeFrasesAleatorias.DTO.SerieDTO;
import br.com.alura.GeradorDeFrasesAleatorias.model.Frase;
import br.com.alura.GeradorDeFrasesAleatorias.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository fraseRepository;

    public SerieDTO obterFrase(){
        Frase frase = fraseRepository.fraseAleatoria();
        return new SerieDTO(frase.getPoster(), frase.getTitulo(), frase.getFrase(), frase.getPersonagem());
    }
}
