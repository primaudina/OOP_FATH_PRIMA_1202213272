public class Sampan extends TransportasiAir {
    protected int layar;


    public Sampan (int jumlahkursi, int biaya, int layar){
        super(jumlahKursi,biaya,layar);
        this.jumlahKursi = jumlahaKursi;
        this.biaya = biaya;
        this.layar = layar;
    }

    @override
    public void informasi(){
        System.out.println("Transportasi Air jenis tidak diketahui dengan kursi berjumlah" + jumlahKursi + "ditetapkan dengan biaya sebesar Rp." );
    
    }
    @override
    public void berlayar(){
        System.out.println berlayar("Transportasi Air dengan jenis yang tidak diketahui sedang berlayar ");
    }

    @override
    public void berlabuh(){
        System.out.println berlabuh("Transportasi Air dengan jenis yang tidak diketahui berlabuh di pantai"); 
    }

    public void berlabuh(int jangkar){
        System.out.println berlabuh(int jangkar)
     }   


}
