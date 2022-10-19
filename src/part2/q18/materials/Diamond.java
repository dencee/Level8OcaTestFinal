package part2.q18.materials;

import java.io.FileNotFoundException;
import java.io.IOException;

class CarbonStructure{
    protected long count;
    public abstract Number getCount() throws IOException;   // q1
    public CarbonStructure(int count) { this.count = count; }
}
public class Diamond extends CarbonStructure {
    public Diamond() { super(15); }
    @Override
    public Long getCount() throws FileNotFoundException {   // q2
        return count;
    }
    public static void main(String[] cost) {
        try {
            final CarbonStructure ring = new Diamond();     // q3
            System.out.println(ring.getCount());            // q4
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
