package br.com.alura.GeradorDeFrasesAleatorias.controller;

import br.com.alura.GeradorDeFrasesAleatorias.DTO.SerieDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FraseController {

    @GetMapping("/frases")
    public SerieDTO obterFrase(){
        return null;
    }
}
