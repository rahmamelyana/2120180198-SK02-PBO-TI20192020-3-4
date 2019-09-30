package pkg2120180198.sk02.pbo.ti20192020.pkg3.pkg4.pkg02;
public class Handphone {
    //property
    String nama="Handphone_Rahma";
    int ukuran_layar;
    int jaringan;
    int warna;
    int fitur;
    int kamera;
        
    
    //method
    void memotret (){
        
        System.out.println("kamera akan siap beberapa detik lagi");   
    }
    void menulis_pesan(int waktu){
        System.out.println("pesan akan dikirim="+waktu);
    }
    void memutar_musik(){
        System.out.println("memutar musik");
    }
    void bermain_game(){
        System.out.println("bermain game di "+this.nama);
    }
    void membuat_video(){
        System.out.println("membuat video");
    }
  
}
