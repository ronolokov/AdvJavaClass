package homework.adina;

public class TaskGenerics {
    public static void main(String[] args) {
        //create dimensions instances
        Dimension<Integer> dimension1 = new Dimension<>(10, 120, 55);
        Dimension<Double> dimension2 = new Dimension<>(10.0, 120.0, 55.0);
        Dimension<String> dimension3 = new Dimension<>("10", "120", "55");


        //calculate area and V
        System.out.println(dimension1.length * dimension1.width);
        System.out.println(dimension2.length * dimension2.width);
        System.out.println(Integer.parseInt(dimension3.length) * Integer.parseInt(dimension3.width));

        System.out.println(dimension1.length * dimension1.width * dimension1.height);
        System.out.println(dimension2.length * dimension2.width * dimension2.height);
        System.out.println(Integer.parseInt(dimension3.length) * Integer.parseInt(dimension3.width) * Integer.parseInt(dimension3.height));


    }
}

class Dimension<T> {
    T length;
    T width;
    T height;

    public Dimension(T height, T length, T width) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}

class Pair<T1, T2> {
    T1 object1;
    T2 object2;

    Pair(T1 one, T2 two) {
        object1 = one;
        object2 = two;
    }

    public T1 getFirst() {
        return object1;
    }

    public T2 getSecond() {
        return object2;
    }

}

class PairTest {
    public static void main(String[] args) {
        Pair<Integer, String> worldCup = new Pair<Integer, String>(2018, "Russia");
        System.out.println("World cup " + worldCup.getFirst() + " was in " + worldCup.getSecond());
    }
}

