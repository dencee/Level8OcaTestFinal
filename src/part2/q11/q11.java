package part2.q11;

import java.util.Arrays;
import java.util.List;

public class q11 {
    public static void main(String[] args) {
        List<String> drinks = Arrays.asList("can", "cup");
        for (int container = drinks.size(); container > 0; container++) {
            System.out.println(drinks.get(container - 1) + ",");
        }
    }
}
