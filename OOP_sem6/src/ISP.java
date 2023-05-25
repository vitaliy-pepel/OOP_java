/**
 *  Interface Segregation Principle - принцип разделения интерфейсов. Данный принцип обозначает, что не нужно заставлять клиента (класс) реализовывать интерфейс, который не имеет к нему отношения.
 */

//Интерфейс TwoDimensionalShape
public interface TwoDimensionalShape {
    double area();
}

//Интерфейс ThreeDimensionalShape
public interface ThreeDimensionalShape {
    double volume();
}

// Класс Circle имплементирующий TwoDimensionalShape
public class Circle Circle implements TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
// Класс Cube имплементирующий ThreeDimensionalShape и TwoDimensionalShape
public class Cube implements ThreeDimensionalShape, TwoDimensionalShape {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}


