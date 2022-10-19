package part1.q40.woods;

// A
//import static part1.q40.food.Grass.getGrass;
//import static part1.q40.food.Grass.seeds;

// B
//import static part1.q40.food.*;

// C
//static import part1.q40.food.Grass.*;

// D
//import part1.q40.food.Grass.*;

// E
//static import part1.q40.Grass.getGrass;
//static import part1.q40.food.Grass;.seeds;

// F
import static part1.q40.food.Grass.getGrass;
import static part1.q40.food.Grass.seeds;

public class Deer {
    public void eat() {
        getGrass();
        System.out.println(seeds);
    }
}
