public class Bulan extends BendaLangit {
    public Bulan() {
        super(0.012F, 3474, "Bulan", "Bumi");
    }

    public Bulan(float massa, int diameter, String nama, String orbitor) {
        super(massa, diameter, nama, orbitor);
    }

    @Override
    public void info() {
        System.out.println("Informasi Bulan: ");
        System.out.println("Nama Bulan: " + this.nama);
        System.out.println("Diameter Bulan: " + Integer.toString(this.diameter) + "km");
        System.out.println("Massa Bulan: " +Float.toString( this.massa)+ " kg");
    }
}
