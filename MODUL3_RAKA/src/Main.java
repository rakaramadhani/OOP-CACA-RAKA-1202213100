import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    boolean repeat = true;
    Scanner input = new Scanner(System.in);
    Calculation calc = new Calculation(0, 0, 0);
    Thread thread = new Thread(calc);
    thread.start();

    do {
        try {
            System.out.println("\nMenu:");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Trapezoid");
            System.out.println("0. Exit");

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("=== LUAS PERSEGI ===");
                    System.out.print("\nSisi Persegi: ");
                    double side = input.nextDouble();
                    calc.setSquare(side);
                    System.out.println("\nLuas Persegi: " + calc.getSquare());
                    break;
                case 2:
                    System.out.print("=== LUAS LINGKARAN ===");
                    System.out.print("\nJari-jari: ");
                    double radius = input.nextDouble();
                    calc.setCircle(radius);
                    System.out.println("\nLuas Lingkaran: " + calc.getCircle());
                    break;
                case 3:
                    System.out.print("=== LUAS TRAPESIUM ===");
                    System.out.print("\nSisi Atas Trapesium: ");
                    double a = input.nextDouble();
                    System.out.print("\nSisi Bawah Trapesium: ");
                    double b = input.nextDouble();
                    System.out.print("\nTinggi Trapesium: ");
                    double t = input.nextDouble();
                    calc.setTrapezoid(a, b, t);
                    System.out.println("\nLuas Trapesium: " + calc.getTrapezoid());
                    break;
                case 0:
                    System.out.println("=== PROGRAM SELESAI ===");
                    repeat = false;
                    break;
                default:
                    System.out.println("!!! OPSI TIDAK TERSEDIA !!!");
                    continue;
                }
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("!!! INPUTAN HARUS BERUPA ANGKA !!!");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                break;
            }

        } while (repeat);
        input.close();
    }
}
