package part2.q19;

import java.time.LocalDate;
import java.time.Period;

public class HowLong {
    public void main(String[] args) {
        LocalDate newYears = new LocalDate(2017, 1, 1);
        Period period = Period.ofYears(1).ofDays(1);
        DateTimeFormat format = DateTimeFormat.ofPattern("MM-dd-yyyy");
        System.out.println(format.format(newYears.minus(period)));
    }
}
