package part2.q3;

import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {
        args = new String[] {"0", "1", "01", "10"};
        
        Arrays.sort(args);
        System.out.println(Arrays.toString(args));
    }
}
