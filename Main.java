public class Main {
    public static void main(String[] args) {

        Bintang matahari = new Bintang(1F, 1391400, "Matahari", null, "Main Sequence");
        matahari.info();
        matahari.phase();

        System.out.println("");
        Planet mars = new Planet(0.3F, 500, "Mars", "Matahari", false);
        mars.info();
        mars.mengorbit();

        System.out.println("");
        Bumi bumi = new Bumi();
        bumi.info();
        System.out.println("");
        bumi = new Bumi(" 8,106,001,983");
        bumi.info();
        bumi.mengorbit();


        System.out.println("");
        Bulan bulan = new Bulan();
        bulan.info();
        bulan.mengorbit();

        System.out.println("");
        Bulan europa = new Bulan(0.008F, 22, "Europa", "Jupiter");
        europa.info();
        europa.mengorbit();

    }
}
