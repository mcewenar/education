package Musician;

import Instrument.StringedInstrument;

public class GuitarPlayer extends MusicianStringed {

    private String genre;
    private String estilo;
    private String dificultad;
    private StringedInstrument guitarra;

    public GuitarPlayer(String genre, String estilo, String dificultad, StringedInstrument guitarra) {
        this.genre = genre;
        this.estilo = estilo;
        this.dificultad = dificultad;
        this.guitarra = guitarra;
    }

    @Override
    public void play() {
        System.out.println("Play it " + this.guitarra.getNameInstrument());
    }

    @Override
    public void calibrate() {
        System.out.println("SE TOCA LA " + this.guitarra.getNameInstrument());
    }

    @Override
    public void clean() {
        System.out.println("SE TOCA LA " + this.guitarra.getNameInstrument());
    }

    public String getGenre() {
        return genre;
    }

    public String getEstilo() {
        return estilo;
    }

    public String getDificultad() {
        return dificultad;
    }

    public StringedInstrument getGuitarra() {
        return guitarra;
    }
}
