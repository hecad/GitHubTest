package githubtest;

/**
 *
 * @author hector
 */
public class Greeter {

    private final String message;

    public Greeter(String message) {
        this.message = message;
    }

    public void greet(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
