package br.com.alura.GeradorDeFrasesAleatorias.controller;

import br.com.alura.GeradorDeFrasesAleatorias.DTO.SerieDTO;
import br.com.alura.GeradorDeFrasesAleatorias.repository.FraseRepository;
import br.com.alura.GeradorDeFrasesAleatorias.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FraseController {

    @Autowired
    private FraseService fraseService;

    @GetMapping("/frases")
    public SerieDTO obterFrase(){
        return fraseService.obterFrase();
    }
}
