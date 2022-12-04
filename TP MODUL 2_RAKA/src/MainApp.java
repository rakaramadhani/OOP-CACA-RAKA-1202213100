public class MainApp {
    
    public static void main(String[] args) throws Exception {
        Perangkat perangkat_ = new Perangkat("Corsair ", 16, 3.00);
        perangkat_.info();
        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("");
        Laptop laptop_ = new Laptop("Lenovo Legion ", 32, 5.60, true);
        laptop_.info();
        laptop_.game("Call of Duty : Modern Warfare 2 ");
        laptop_.email("rakaramadhani2001@gmail.com ");
        laptop_.email("rakaramadhani2001@gmail.com ", "mynameghost@gmail.com ");
        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("");
        HP HP_ = new HP("iPhone 12", 2, 3.00, false);
        HP_.info();
        HP_.telp("081353252678 ");
        HP_.sms("085353575888 ");
        HP_.sms("085353575888 ", "085353666777 ");
        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("");

    }
}
