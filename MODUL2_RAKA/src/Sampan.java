public class Sampan extends TransportasiAir {
    protected boolean berlabuh;
    protected int jangkar;
    protected String txt;

    public Sampan(int jumlahKursi, int biaya, boolean berlabuh, int jangkar){
        super(jumlahKursi, biaya);
        this.berlabuh=berlabuh;
        this.jangkar=jangkar;

    }

    @Override
    public void informasi(){
        if(berlabuh==true){
            txt="sedang berlabuh";
        }
        else{
            txt="sedang berlayar";
        }
        System.out.println("Transportasi Air yang tidak diketahui dengan jumlah kursi " +jumlahKursi+ "ditetapkan dengan biaya Rp." +biaya + berlabuh);
    }

    public void berlayar(int layar) {
        System.out.println("Sampan sedang berlayar dengan " +layar+ "layar");
    }

    public void jangkar(int jangkar_) {
        System.out.println("Sampan berlabuh di pantai tanpa jangkar");
    }

    public void jangkar2(int jangkar_2) {
        System.out.println("Sampan berlabuh di pantai " +jangkar+ "jangkar");
    }
}
