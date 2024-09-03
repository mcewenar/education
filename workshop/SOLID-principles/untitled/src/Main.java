import Band.Band;
import Instrument.*;
import Musician.*;

public class Main {
    public static void main(String[] args) {

        //Musical Instruments instances
        WindInstrument harmonic = new WindInstrument("harmonic");
        ElectronicInstrument console = new ElectronicInstrument("DJ Console");
        PercusionInstrument drum = new PercusionInstrument("drum");
        StringedInstrument guitar = new StringedInstrument("guitar");

        //Music players instances
        MusicianWind musician1 = new HarmonicaPlayer("a","b","c",harmonic);
        MusicianElectronic musician2 = new DjPlayer("a","b","c",console);
        MusicianPercussive musician3 = new DrumPlayer("a","b","c",drum);
        MusicianStringed musician4 = new GuitarPlayer("a","b","c",guitar);


        //Mix instances:
        Band band = new Band(musician1,musician2,musician3,musician4);

        //Must be sound all instruments together
        band.playConcert();

        harmonic.sound();

    }
}