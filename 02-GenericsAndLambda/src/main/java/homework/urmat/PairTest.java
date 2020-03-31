package homework.urmat;

public class PairTest {
    public static void main(String[] args){
        Pair<Integer,String> worldCup = new Pair<>(2018, "Russia");
        System.out.println("World Cup " + worldCup.getFirst() + " was in " + worldCup.getSecond());
    }
}

class Pair<T1, T2>{
    private T1 object1;
    private T2 object2;

    Pair(T1 one, T2 two){
        object1 = one;
        object2 = two;
    }

    public T1 getFirst(){
        return object1;
    }

    public T2 getSecond(){
        return object2;
    }
}
