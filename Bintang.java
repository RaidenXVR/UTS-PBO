public class Bintang extends BendaLangit {

    private String fase;
    
    Bintang(float massa, int diameter, String nama, String orbitor, String phase) {
        super(massa, diameter, nama, orbitor);
        fase = phase;

    }

    @Override
    public void info() {

        System.out.println("Informasi Bintang: ");
        System.out.println("Nama Bintang: " + this.nama);
        System.out.println("Diameter Bintang: " + Integer.toString(this.diameter));
        System.out.println("Massa Bintang: " + Float.toString( this.massa) + " Solar Mass");
    }

    public void phase() {
        System.out.println("Bintang ini sedang dalam tahap " + fase);
    }
    

    

    
    

    
}
