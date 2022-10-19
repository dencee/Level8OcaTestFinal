package part2.q39.arctic;

abstract class Bear{
    protected int sing;
    protected abstract int grunt();
    int sing() {
        return sing;
    }
}

public class PolarBear extends Bear {
    @Override
    int grunt() {
        sing() += 10;
        return super.grunt() + 1;
        return 10;
    }
}
