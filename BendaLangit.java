abstract class BendaLangit {
    int massa;
    int diameter;
    String nama;
    String orbitor;

    public BendaLangit(int massa, int diameter, String nama, String orbitor) {
        this.massa = massa;
        this.diameter = diameter;
        this.nama = nama;
        this.orbitor = orbitor;
    }

    public void info() {
        
    }

    public void mengorbit() {
        if (orbitor != null) {
            System.out.println(this.getClass().getName() + " ini mengorbit " + orbitor);
        }
        else {
            System.out.println(this.getClass().getName()+" ini tidak mengorbit apapun.");
        }
}
}