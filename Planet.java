public class Planet extends BendaLangit {
    
    private boolean habitable;


    public Planet(float massa, int diameter, String nama, String orbitor, boolean is_habitable) {
        super(massa, diameter, nama, orbitor);
        habitable = is_habitable;
    }

    @Override
    public void info() {
        System.out.println("Informasi Planet: ");
        System.out.println("Nama Planet: " + this.nama);
        System.out.println("Diameter Planet: " + Integer.toString(this.diameter) + "km");
        System.out.println("Massa Planet: " +Float.toString( this.massa)+ " Massa Bumi");
    }

    public void is_habitable() {
        if (habitable) {
            System.out.println("Planet ini bisa dihuni manusia.");
        }
        else {
            System.out.println("Planet ini tidak bisa dihuni manusia.");
        }
    }


    
}
