package Instrument;

public class PercusionInstrument implements MusicalInstrument {
    private String nombreInstrumento;

    public PercusionInstrument(String instrumento) {
        this.nombreInstrumento = instrumento;
    }

    public String getNombreInstrumento() {
        return nombreInstrumento;
    }

    @Override
    public void sound() {
        System.out.println("Sounds "+ nombreInstrumento);
    }
}
