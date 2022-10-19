package part2.q26.nyc;

public class TouristBus {

    public static void main(String... args) {
        String[] nycTourLoops = new String[] {"Downtown ", "Uptown", "Brooklyn"};
        String[] times = new String[] {"Day", "Night"};
        
        for (int i = 0, j = 0; i < nycTourLoops.length; i++, j++) {
            System.out.println(nycTourLoops[i] + " " + times[j]);
        }
    }
}
