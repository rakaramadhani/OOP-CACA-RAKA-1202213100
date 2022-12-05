public class Kapal extends TransportasiAir {
    protected boolean berlabuh;
    protected int kecepatan;
    protected String txt;

    public Kapal(int jumlahKursi, int biaya, boolean berlabuh, int kecepatan){
        super(jumlahKursi, biaya);
        this.berlabuh=berlabuh;
        this.kecepatan=kecepatan;

    }

    @Override
    public void informasi(){
        if(berlabuh==true){
            txt="sedang berlabuh";
        }
        else{
            txt="sedang berlayar";
        }
        System.out.println("Kapal dengan jumlah kursi " +jumlahKursi+ "ditetapkan dengan biaya Rp." +biaya + berlabuh);
    }

    public void kecepatan(int kecepatan_) {
        System.out.println("Kapal sedang berlayar dengan kecepatan " +kecepatan_+ "knot");
    }

    public void kecepatan2(int kecepatan_2) {
        System.out.println("Kapal berlabuh di pantai dengan kecepatan tidak stabil");
        System.out.println("Kapal " +berlabuh);
    }
    
}
