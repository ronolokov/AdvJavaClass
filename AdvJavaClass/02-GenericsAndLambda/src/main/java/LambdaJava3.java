
public class LambdaJava3 {

    public static void main(String[] args) {
        String slogan = getSlogan(s -> "Steve Jobs says: " + s);

        System.out.println(slogan);
    }

    public static String getSlogan(DummyInterface3<String, String> dummyInterface) {
        return dummyInterface.applySlogan("Be Hungry Be Foolish");
    }
}

// T is not primitive type

interface DummyInterface3 <T, R> {
    R applySlogan(T t);
}
