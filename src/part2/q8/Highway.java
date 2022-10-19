package part2.q8;

public class Highway {
    public int drive(long car) { return 2; }
    public int drive(double car) { return 3; }
    public int drive(int car) { return 5; }
    public int drive(short car) { return 3; }
    
    public static void main(String[] args) {
//        boolean value = 5;
//        short value = 5;
//        int value = 5;
//        byte value = 5;
//        long value = 5;
        float value = 5;
        System.out.print(new Highway().drive(value));
    }
}
