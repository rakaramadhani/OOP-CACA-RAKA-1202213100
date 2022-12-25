import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant chef = new Restaurant();
        int customerID, orderQuantity;
        try {
            System.out.println("Customer ID: ");
            customerID = input.nextInt();
            System.out.println("Jumlah Makanan: ");
            orderQuantity = input.nextInt();
            Thread t1 = new Thread(chef);
            Waiters waiters = new Waiters(customerID, orderQuantity);
            Thread t2 = new Thread(waiters);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Customer ID harus menggunakan angka!!!");
        }
    }

}