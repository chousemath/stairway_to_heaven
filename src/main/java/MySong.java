/**
 * Created by jo on 6/22/17.
 */

import jm.JMC;
import jm.music.data.*;
import jm.util.Play;

public final class MySong implements JMC {
    public static void main(String[] args) {
        Play.midi(new Note(C4, QN));
    }
}
