abstract class BendaLangit {
    protected float massa;
    protected int diameter;
    protected String nama;
    protected String orbitor;

    public BendaLangit(float massa, int diameter, String nama, String orbitor) {
        this.massa = massa;
        this.diameter = diameter;
        this.nama = nama;
        this.orbitor = orbitor;
    }

    public void info() {
        
    }

    public final void mengorbit() {
        if (orbitor != null) {
            System.out.println(this.getClass().getName() + " ini mengorbit " + orbitor);
        }
        else {
            System.out.println(this.getClass().getName()+" ini tidak mengorbit apapun.");
        }
}
}