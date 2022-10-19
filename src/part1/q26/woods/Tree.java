package part1.q26.woods;

interface Plant {
    default String grow() { return "Grow!"; }
}
interface Living {
    public default String grow() { return "Growing!"; }
}
public class Tree implements Plant, Living {    // m1
    public String grow(int height) { return "Super Growing!"; }
    public static void main(String[] leaves) {
        Plant p = new Tree();                   // m2
        System.out.println(((Living)p).grow()); // m3
    }
}
