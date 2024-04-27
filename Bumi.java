public class Bumi extends Planet {

    String populasi;
    
    public Bumi() {
        super(1, 12742, "Bumi", "Matahari", true);
        populasi = "8.1 Miliar";

    }

    public Bumi(String population) {
        super(1, 12742, "Bumi", "Matahari", true);
        this.populasi = population;
    }

    public String getPopulation() {
        return populasi;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Populasi Manusia: "+populasi+" Orang");
    }
    

}
