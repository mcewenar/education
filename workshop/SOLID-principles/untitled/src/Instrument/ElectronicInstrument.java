package Instrument;

public class ElectronicInstrument implements MusicalInstrument {
    private String instrumentName;

    public ElectronicInstrument(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    @Override
    public void sound() {
        System.out.println("Sounds " + this.instrumentName);
    }
}
