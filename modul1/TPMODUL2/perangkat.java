
public class perangkat {
    protected String drive ;
    protected int ram;
    protected float processor;

    public perangkat (String drive, int ram, float processor) {
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;

    }
    public void informasi() {
        System.out.printf("Perangkat tidak diketahui memiliki drive tipe %s dengan ram sebesar %d GB processor secepat %.2f ", drive, ram, processor);
    }
}
    

    

