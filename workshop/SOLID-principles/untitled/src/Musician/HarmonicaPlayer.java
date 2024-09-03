package Musician;

import Instrument.WindInstrument;

public class HarmonicaPlayer extends MusicianWind {
    private String gender;
    private String style;
    private String difficult;
    private WindInstrument acordeon;

    public HarmonicaPlayer(String gender, String style, String difficult, WindInstrument acordeon) {
       this.gender = gender;
       this.style = style;
       this.difficult = difficult;
       this.acordeon = acordeon;
    }

    @Override
    public void play() {
        System.out.println("Play it " + this.acordeon.getInstrumentName());
    }

    @Override
    public void calibrate() {
        System.out.println("Caliber the " + this.acordeon.getInstrumentName());
    }

    @Override
    public void clean() {
        System.out.println("Clean the " + this.acordeon.getInstrumentName());
    }

    public String getGender() {
        return gender;
    }

    public String getStyle() {
        return style;
    }

    public String getDifficult() {
        return difficult;
    }

    public WindInstrument getAcordeon() {
        return acordeon;
    }
}
