package Week_4.OOPS;

public class Box3D extends Box {

    double height;

    Box3D(double length, double breadth, double height) {

        super(length, breadth);

        this.height = height;
    }

    public double volume() {

        return length * breadth * height;
    }

    public static void main(String[] args) {

        Box3D box = new Box3D(5, 4, 3);

        System.out.println("Area = " + box.area());

        System.out.println("Volume = " + box.volume());
    }
}
