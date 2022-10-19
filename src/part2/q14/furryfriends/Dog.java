package part2.q14.furryfriends;

interface Friend {
    protected String getName();     // h1
}

class Cat implements Friend {
    @Override
    String getName() {              // h2
        return "Kitty";
    }
}

public class Dog implements Friend {
    @Override
    String getName() throws RuntimeException {      // h3
        return "Doggy";
    }
    public static void main(String[] args) {
        Friend friend = new Dog();                      // h4
        System.out.println(((Cat)friend).getName());    // h5
        System.out.println(((Dog)null).getName());      // h6
    }
}
