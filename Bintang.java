public class Bintang extends BendaLangit {

    private String fase;
    
    Bintang(int massa, int diameter, String nama, String orbitor, String phase) {
        super(massa, diameter, nama, orbitor);
        fase = phase;

    }

    @Override
    public void info() {

        System.out.println("Informasi Bintang: ");
        System.out.println("Nama Bintang: " + this.nama);
        System.out.println("Diameter Bintang: " + this.diameter);
        System.out.println("Massa Bintang: " + this.massa);
    }

    public void phase() {
        System.out.println("Bintang ini sedang dalam fase " + fase);
    }
    

    

    
    

    
}
