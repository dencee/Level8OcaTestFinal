package part2.q29.percussion;

interface MakesNoise {}
abstract class Instrument implements MakesNoise {
    public Instrument(int beats) {}
    public void play() {}
}
public class Drum extends Instrument {
    public void play(int count) {}
    public void concert() {
        super.play(5);
    }
    
    public static void main(String[] beats) {
        MakesNoise mn = new Drum();
        mn.concert();
    }
}
