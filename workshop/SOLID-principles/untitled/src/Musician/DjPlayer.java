package Musician;

import Instrument.ElectronicInstrument;

public class DjPlayer extends MusicianElectronic {
    private String genero;
    private String estilo;
    private String dificultad;
    private ElectronicInstrument consola;

    public DjPlayer(String genero, String estilo, String dificultad, ElectronicInstrument consola) {
        this.genero = genero;
        this.estilo = estilo;
        this.dificultad = dificultad;
        this.consola = consola;
    }

    @Override
    public void play() {
        System.out.println("Play it " + this.consola.getInstrumentName());
    }

    @Override
    public void calibrate() {
        System.out.println("SE TOCA LA " + this.consola.getInstrumentName());
    }

    @Override
    public void clean() {
        System.out.println("SE TOCA LA " + this.consola.getInstrumentName());
    }

    @Override
    public void genericComposition() {
        System.out.println("SE TOCA LA " + this.consola.getInstrumentName());
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

    public ElectronicInstrument getConsola() {
        return consola;
    }
}
