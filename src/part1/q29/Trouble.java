package part1.q29;

public class Trouble {
    public Trouble() {}
    public Trouble(int deep) {
        super(false);
        this();
    }
    public Trouble(String now, int... deep) {
        this(3);
    }
    public Trouble(long deep) {
        this("check", deep);
    }
    public Trouble(double test) {
        super(test>5 ? true : false);
    }
}
