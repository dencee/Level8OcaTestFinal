package part1.q32;

public class Legos {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("red");
        sb.deleteCharAt(0);
        sb.delete(1, 1);
        System.out.println(sb);
    }
}
