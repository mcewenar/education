package Instrument;

public class WindInstrument implements MusicalInstrument {
    private String instrumentName;

    public WindInstrument(String instrumento) {
        this.instrumentName = instrumento;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    @Override
    public void sound() {
        System.out.println("Sounds "+ instrumentName);
    }
}
