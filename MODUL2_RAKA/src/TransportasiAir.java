public class TransportasiAir {
    protected int jumlahKursi;
    protected int biaya;

    public TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;

    }

    public void informasi(){
        System.out.println("Transportasi Air yang tidak diketahui dengan jumlah kursi " +jumlahKursi+ "ditetapkan dengan biaya Rp." +biaya);
    }

    public void berlabuh(int labuh) {
        System.out.println("Transportasi Air yang tidak diketahui sedang berlabuh");
    }


}