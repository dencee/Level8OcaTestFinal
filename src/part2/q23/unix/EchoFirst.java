package part2.q23.unix;

import java.util.Arrays;

public class EchoFirst {
    // To run: Add command line arguments to the run configuration
    public static void main(String[] args) {
        int result = Arrays.binarySearch(args, args[0]);
        System.out.println(result);
    }
}
