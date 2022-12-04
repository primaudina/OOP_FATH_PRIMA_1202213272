public class mainApp {
    public static void main (String[] arg) throws Exception{
        perangkat pErangkat = new perangkat ("Adata", 2, 2.7f);
        pErangkat.informasi();
        System.out.println();

        laptop lAptop= new laptop ("Seagate", 8, 2.4f, true);
        lAptop.informasi();
        lAptop.bukaGame("Valorant Game");
        lAptop.kirimEmail("prima@gmail.com");
        lAptop.kirimEmail("prima@gmail.com", "prima1@gmail.com");
        System.out.println();

        handphone hengpon = new handphone ("Toshiba", 3, 2.2f, false);
        hengpon.informasi();
        hengpon.telfon(812345);
        hengpon.kirimSMS(8158954);
        hengpon.kirimSMS(8195673,817234);
        System.out.println();



    };

    
}
