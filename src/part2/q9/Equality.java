package part2.q9;

import java.time.LocalTime;

public class Equality {

    public void main(String[] args) {
        System.out.println(new StringBuilder("zelda") == new StringBuilder("zelda"));
        System.out.println(3 == 3);
        System.out.println("bart" == "bart");
        System.out.println(new int[0] == new int[0]);
        System.out.println(LocalTime.now() == LocalTime.now());
    }
}
