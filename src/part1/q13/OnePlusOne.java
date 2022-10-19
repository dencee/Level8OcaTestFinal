package part1.q13;

import java.time.LocalTime;

public class OnePlusOne {

    public static void main(String... nums) {
        LocalTime time = LocalTime.of(1, 11);
        while(time.getHour() < 1) {
            time.plusHours(1);
            System.out.println("in loop");
        }
    }
}
