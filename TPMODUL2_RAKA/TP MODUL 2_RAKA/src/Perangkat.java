public class Perangkat {
    protected String driver;
    protected int RAM;
    protected double procie;

    public Perangkat(String driver, int RAM, double procie){
        this.driver = driver;
        this.RAM = RAM;
        this.procie = procie;

    }

    public void info() {
        System.out.println("Perangkat tidak diketahui memiliki driver dengan tipe " +driver+ "dengan RAM " +RAM+ "GB dan Processor " +procie+ "ghz");
    }

}
