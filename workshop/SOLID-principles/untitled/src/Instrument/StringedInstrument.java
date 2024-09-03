package Instrument;

public class StringedInstrument implements MusicalInstrument {
    private String nameInstrument;

    public StringedInstrument(String instrumento) {
        this.nameInstrument = instrumento;
    }

    public String getNameInstrument() {
        return nameInstrument;
    }

    @Override
    public void sound() {
        System.out.println("Sounds "+ nameInstrument);
    }

}
