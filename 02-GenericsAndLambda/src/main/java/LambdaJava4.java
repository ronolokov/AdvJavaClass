import java.util.function.Function;

public class LambdaJava4 {
    public static void main(String[] args) {
        String slogan = getSlogan(s -> "Steve Jobs says: " + s);
        System.out.println(slogan);
    }

    public static String getSlogan(Function<String, String> function) {
        return function.apply("Be Hungry Be Foolish");
    }
}
