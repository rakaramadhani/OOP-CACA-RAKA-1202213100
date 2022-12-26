import java.lang.IllegalArgumentException;

public class Calculation implements Runnable {
    private double radius;
    private double side;
    private double area;
    private double phi = 3.14;
    public Calculation(double radius, double side, double area) {
        this.radius = radius;
        this.side = side;
        this.area = area;
    }
    public void setSquare(double side) throws IllegalArgumentException {
        if (side < 1) {
            throw new IllegalArgumentException("SISI MINIMAL 1");
        }
        this.side = side;
        this.area = side * side;
    }
    public double getSquare() {
        return this.area;
    }
    public void setCircle(double radius) throws IllegalArgumentException {
        if (radius < 1) {
            throw new IllegalArgumentException("JARI-JARI MINIMAL 1");
        }
        this.radius = radius;
        this.area = phi * radius * radius;
    }
    public double getCircle() {
        return this.area;
    }
    public void setTrapezoid(double a, double b, double t) throws IllegalArgumentException {
        if (a < 1 || b < 1 || t < 1) {
            throw new IllegalArgumentException("ATAS BAWAH DAN TINGGI MINIMAL 1");
        }
        this.side = a;
        this.area = ((a + b) / 2) * t;
    }
    public double getTrapezoid() {
        return this.area;
    }
    @Override
    public void run() {
        System.out.println("Program will start in");
        try {
            for (int i = 3; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Program has started");
        System.out.print("Enter your choice: ");
    }
}
