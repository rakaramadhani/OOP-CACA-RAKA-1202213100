public class HP extends Perangkat {
    protected boolean fingerprint;
    protected String txt;

    public HP(String driver, int RAM, Double procie, boolean fingerprint) {
        super(driver, RAM, procie);
        this.fingerprint=fingerprint;

    }

    @Override
    public void info(){
        if(fingerprint==true){
            txt="Fingerprint : Yes";
        }
        else{
            txt="Fingerprint : No";
        }
        System.out.println("Driver : " +driver+ " || RAM : " +RAM+ "GB || Processor : " +procie+ "Ghz || " +txt);
    }

    public void telp(String no_hp) {
        System.out.println("Berhasil menyambungkan ke nomor " +no_hp);
    }

    public void sms(String no_hp) {
        System.out.println("SMS terkirim ke nomor " +no_hp);
    }

    public void sms(String no_hp1, String no_hp2) {
        System.out.println("SMS terkirim ke nomor " +no_hp1+ "dan " +no_hp2);
    }
}
