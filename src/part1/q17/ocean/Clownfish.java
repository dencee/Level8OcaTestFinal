package part1.q17.ocean;

class BubbleException extends Exception {}
class Fish {
    Fish getFish() throws BubbleException {
        throw new RuntimeException("fish!");
    }
}

public class Clownfish extends Fish {
    @Override
    public final Clownfish getFish() {
        throw new RuntimeException("clown!");
    }

    public static void main(String[] bubbles) {
        final Fish f = new Clownfish();
        f.getFish();
        System.out.println("swim!");
    }

}
