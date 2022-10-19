package part2.q34.unix;

import java.util.Arrays;

public class EchoFirst {

    public static void main(String[] args) {
        Arrays.sort(args);
        int result = Arrays.binarySearch(args, args[0]);
        System.out.println(result);
    }
}
