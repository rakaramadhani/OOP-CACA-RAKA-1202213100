public class Laptop extends Perangkat {
    protected boolean webcam;
    protected String txt;

    public Laptop(String driver, int RAM, Double procie, boolean webcam){
        super(driver, RAM, procie);
        this.webcam = webcam;

    }

    @Override
    public void info(){
        if (webcam==true){
            txt="Webcam : Yes";
        }
        else{
            txt="Webcam : No";
        }
        System.out.println("Driver : " +driver+ "|| RAM : " +RAM+ "GB || Processor : " +procie+ "ghz || "+txt);
        
    }
    public void game(String gamename) {
        System.out.println("Berhasil menjalankan game " +gamename);
    }

    public void email(String email_) {
        System.out.println("Email terkirim ke " +email_);
    }

    public void email(String email_1, String email_2) {
        System.out.println("Email terkirim ke " +email_1+ "dan " +email_1);
    }



}