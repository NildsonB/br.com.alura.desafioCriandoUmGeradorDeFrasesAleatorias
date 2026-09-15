package br.com.alura.GeradorDeFrasesAleatorias.model;

import jakarta.persistence.*;

@Entity
@Table(name = "frases")
public class Frases {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String frase;
    private String personagem;
    private String titulo;
    private String poster;

    public Frases() {
    }

    public Frases(String frase, String personagem, String titulo, String poster) {
        this.frase = frase;
        this.personagem = personagem;
        this.titulo = titulo;
        this.poster = poster;
    }

    public String getFrase() {
        return frase;
    }

    public String getPersonagem() {
        return personagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPoster() {
        return poster;
    }

    @Override
    public String toString() {
        return "Frases{" +
                "frase='" + frase + '\'' +
                ", personagem='" + personagem + '\'' +
                ", titulo='" + titulo + '\'' +
                ", poster='" + poster + '\'' +
                '}';
    }
}
