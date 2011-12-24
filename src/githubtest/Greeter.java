package githubtest;

/**
 *
 * @author hector
 */
public class Greeter {

    private final String helloMessage;
    private final String goodbyeMessage;

    public Greeter(String helloMessage, String goodbyeMessage) {
        this.helloMessage = helloMessage;
        this.goodbyeMessage = goodbyeMessage;
    }

    public void greet(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(helloMessage);
        }
    }

    public void sayGoodbye() {
        System.out.println(goodbyeMessage);
    }
}
