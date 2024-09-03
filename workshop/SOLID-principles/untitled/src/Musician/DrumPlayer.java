package Musician;

import Instrument.PercusionInstrument;

public class DrumPlayer extends MusicianPercussive {
    private String genero;
    private String estilo;
    private String dificultad;
    private PercusionInstrument tambor;

    public DrumPlayer(String genero, String estilo, String dificultad, PercusionInstrument tambor) {
        this.genero = genero;
        this.estilo = estilo;
        this.dificultad = dificultad;
        this.tambor = tambor;
    }

    @Override
    public void play() {
        System.out.println("Play it " + this.tambor.getNombreInstrumento());
    }

    @Override
    public void calibrate() {
        System.out.println("SE TOCA LA " + this.tambor.getNombreInstrumento());
    }

    @Override
    public void clean() {
        System.out.println("SE TOCA LA " + this.tambor.getNombreInstrumento());
    }

    public String getGenero() {
        return genero;
    }

    public String getEstilo() {
        return estilo;
    }

    public String getDificultad() {
        return dificultad;
    }

    public PercusionInstrument getTambor() {
        return tambor;
    }
}
