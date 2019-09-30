package pkg2120180198.sk02.pbo.ti20192020.pkg3.pkg4.pkg02;
public class SK02PBOTI201920203402 {

    public static void main(String[] args) {
        //instansiasi
        Handphone Handphone_Rahma=new Handphone ();
        
        //inisialisasi
        Handphone_Rahma.ukuran_layar=5 ;
        Handphone_Rahma.jaringan=4;
        Handphone_Rahma.kamera=5;
        

        //pemanggilan property
        System.out.println(Handphone_Rahma.nama);
        System.out.println(Handphone_Rahma.ukuran_layar + " inci ");
        System.out.println(Handphone_Rahma.jaringan + " lite ");
        System.out.println(Handphone_Rahma.warna);
        System.out.println(Handphone_Rahma.fitur);
        System.out.println(Handphone_Rahma.kamera + " megapixel ");
        
        //pemanggilan method
        Handphone_Rahma.memotret();
        Handphone_Rahma.menulis_pesan(10);
        Handphone_Rahma.memutar_musik();
        Handphone_Rahma.bermain_game();
        Handphone_Rahma.membuat_video();

    }
    
}
