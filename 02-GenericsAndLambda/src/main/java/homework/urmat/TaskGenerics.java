package homework.urmat;

public class TaskGenerics {

    public static void main(String[] args){
        double length = 3.14;
        double width = 3.14;
        double height = 3.14;

        Dimension<Double> dimension = new Dimension<>(length,width,height);

        Double area = dimension.getArea(length,width);
        Double volume = dimension.getVolume(length,width,height);
        System.out.println("The area is " + String.format("%.2f",area));
        System.out.println("The volume is " + String.format("%.2f",volume));
    }
}

class Dimension <T>{
    T length;
    T width;
    T height;

    public Dimension(T length, T width, T height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getArea(double length, double width){
        return length*width;
    }

    public double getVolume(double length, double width, double height){
        return length*height*width;
    }
}
