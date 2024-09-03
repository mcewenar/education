package Band;

import Musician.Musician;

public class Band {

    private Musician musician1;
    private Musician musician2;
    private Musician musician3;
    private Musician musician4;


    public Band(Musician musician1, Musician musician2, Musician musician3, Musician musician4) {
        this.musician1 = musician1;
        this.musician2 = musician2;
        this.musician3 = musician3;
        this.musician4 = musician4;

    }

    public Musician getMusician1() {
        return musician1;
    }

    public Musician getMusician2() {
        return musician2;
    }

    public Musician getMusician3() {
        return musician3;
    }

    public Musician getMusician4() {
        return musician4;
    }

    public void playConcert() {
        this.musician1.play();
        this.musician2.play();
        this.musician3.play();
        this.musician4.play();

    }
}
