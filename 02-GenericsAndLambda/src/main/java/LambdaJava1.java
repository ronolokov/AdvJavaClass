
public class LambdaJava1 {

    public static void main(String[] args) {
        DummyInterface dummyInterface = new DummyClass1();
        String slogan = getSlogan(dummyInterface);
        System.out.println(slogan);
    }

    public static String getSlogan(DummyInterface dummyInterface) {
        return dummyInterface.applySlogan("Be Hungry Be Foolish");
    }
}

// functional interface
interface DummyInterface {
    String applySlogan(String slogan);
}

class DummyClass1 implements DummyInterface {

    @Override
    public String applySlogan(String slogan) {
        return "Steve Jobs says: " + slogan;
    }
}
