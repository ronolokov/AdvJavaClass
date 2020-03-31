
public class LambdaJava2 {

    public static void main(String[] args) {

        // anonymous object
        String slogan = getSlogan(new DummyInterface2() {
            @Override
            public String applySlogan(String slogan) {
                return "Steve Jobs says: " + slogan;
            }
        });

        System.out.println(slogan);

    }

    public static String getSlogan(DummyInterface2 dummyInterface) {
        return dummyInterface.applySlogan("Be Hungry Be Foolish");
    }
}

interface DummyInterface2 {
    String applySlogan(String slogan);
}