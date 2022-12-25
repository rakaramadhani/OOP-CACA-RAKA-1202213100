public class Waiters implements Runnable {
    private final int orderQuantity;
    private final int customerID;
    static int foodPrice = 25000;
    public Waiters(int customerID, int orderQuantity) {
        this.customerID = customerID;
        this.orderQuantity = orderQuantity;
    }
    @Override
    public void run() {
        while (true) {
            getFood();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void orderInfo() {
        System.out.println("==========================================================");
        System.out.println("Customer ID: " + this.customerID);
        System.out.println("Food Number: " + this.orderQuantity);
        System.out.println("Total      : " + this.orderQuantity * foodPrice);
        System.out.println("==========================================================");
    }
    public void getFood() {
        synchronized(Restaurant.getLock()) {
            System.out.println("Waitres: Makanan siap diantar !");
            Restaurant Restaurant = new Restaurant();
            Restaurant.setWaitingForPickup(false);
            if (Restaurant.getFoodNumber() == this.orderQuantity + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waitres: Meminta restauran untuk membuat makanan lainnya !\n");
        }
    }
}