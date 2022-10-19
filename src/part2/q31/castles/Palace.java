package part2.q31.castles;

class OpenDoorException extends Exception {}
class CableSnapException extends OpenDoorException {}

public class Palace {
    public void openDrawbridge() throws Exception {
        try {
            throw new Exception("Problem");
        } catch(OpenDoorException e) {
            throw new OpenDoorException();
        } catch(CableSnapException ex) {
            try {
                throw new OpenDoorException();
            } catch (Exception ex) {
            } finally {
                System.out.println("Almost done");
            }
        } finally {
            throw new RuntimeException("Unending problem");
        }
    }

    public static void main(String[] moat) throws IllegalArgumentException {
        new Palace().openDrawbridge();
    }

}
