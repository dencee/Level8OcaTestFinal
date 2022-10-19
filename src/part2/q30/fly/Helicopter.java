package part2.q30.fly;
public class Helicopter {
    public int adjustPropellars(int length, String[] type) {
        length++;
        type[0] = "LONG";
        return length;
    }
    public static void main(String[] climb) {
        final Helicopter h = new Helicopter();
        int length = 5;
        String[] type = new String[1];
        length = h.adjustPropellars(length, type);
        System.out.println(length+ "," +type[0]);
    }
}
