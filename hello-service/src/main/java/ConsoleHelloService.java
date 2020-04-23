public class ConsoleHelloService implements HelloService {
    private final String prefix;
    private final String suffix;

    public ConsoleHelloService(String prefix, String suffix) {
        this.prefix = prefix != null ? prefix: "Hello";
        this.suffix = suffix != null? suffix: "!";
    }

    public ConsoleHelloService() {
        this(null, null);
    }

    public void SayHello(String name) {
        String msg = String.format("%s %s%s", prefix, name, suffix);
        System.out.println(msg);
    }
}
