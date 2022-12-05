public class MainClass {
    public static void main(String[] args) throws Exception {
        TransportasiAir TransportasiAir_ = new TransportasiAir(50, 500000);
        TransportasiAir_.informasi();
        TransportasiAir_.berlabuh(0);   
        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("");
        Sampan Sampan_ = new Sampan(5, 30000, true, 1);
        Sampan_.informasi();
        Sampan_.berlayar(2);
        Sampan_.jangkar(0);
        Sampan_.jangkar2(1);
        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("");
        Kapal Kapal_ = new Kapal(30, 700000, false, 30);
        Kapal_.informasi();
        Kapal_.kecepatan(30);
        Kapal_.kecepatan2(0);
        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("");

    }
}


