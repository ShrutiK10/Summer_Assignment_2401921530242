package Week_2.OOPS.live;

import Week_2.OOPS.music.Playable;
import Week_2.OOPS.music.string.Veena;
import Week_2.OOPS.music.wind.Saxophone;


public class Test {

    public static void main(String[] args) {

        // a. Veena object
        Veena veena = new Veena();
        veena.play();

        // b. Saxophone object
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        // c. Interface reference
        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}