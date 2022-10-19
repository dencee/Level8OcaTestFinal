package part1.q11;

public class Q11 {

    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        String race = "";
        outer:
        do {
        inner:
            do {
                race += "x";
            } while (race.length() <= 4);
        } while (race.length() < 4);
        System.out.println(race);
    }
}
