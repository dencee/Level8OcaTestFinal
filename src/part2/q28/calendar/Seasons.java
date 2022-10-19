package part2.q28.calendar;

public class Seasons {
    public static void seasons(String... names) {
        int l = names[1].length();
        System.out.println(names[l]);
    }

    public static void main(String[] args) {
        seasons("Summer", "Fall", "Winter", "Spring");
    }
}
