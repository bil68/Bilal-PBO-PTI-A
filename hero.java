package dandyparaktek3;

class karakterstrong {
    String nama;
    double nyawa;
    double serangan;
   private double kerusakan;
   private String namamusuh;
    karakterstrong(){ 
    }
    void serangankekarakteragility(karakteragility musuh){
        this.kerusakan=(musuh.nyawa*2) - (this.serangan*6);
        this.namamusuh=musuh.nama;
    }
    void serangankekarakterintel(karakterintel musuh){
        this.kerusakan=(musuh.nyawa) - (this.serangan*6);
        this.namamusuh=musuh.nama;
    }
    void kondisi(){
        System.out.println(this.nama +" menyerang "+this.namamusuh+
        "\nnyawa "+this.namamusuh+" : "+this.kerusakan);
    }
}
/**
 * hero
 */
 class karakteragility {
    String nama;
    double nyawa;
    double serangan;
    private double kerusakan;
    private String namamusuh;
     karakteragility(){
    }void serangankekarakterintel(karakterintel musuh){
        this.kerusakan=(musuh.nyawa*2) - (this.serangan*5);
        this.namamusuh=musuh.nama;
    }
    void serangankekarakterstrong(karakterstrong musuh){
        this.kerusakan=(musuh.nyawa) - (this.serangan*5);
        this.namamusuh=musuh.nama;
    }
    void kondisi(){
        System.out.println(this.nama +" menyerang "+this.namamusuh+
        "\nnyawa "+this.namamusuh+" : "+this.kerusakan);
    }
}
/**
 * hero
 */
class karakterintel {
    String nama;
    double nyawa;
    double serangan;
    private double kerusakan;
    private String namamusuh;
    karakterintel(){
    }
    void serangankekarakteragility(karakteragility musuh){
        this.kerusakan=(musuh.nyawa*2) - this.serangan;
        this.namamusuh=musuh.nama;
    }
    void serangankekarakterstrong(karakterstrong musuh){
        this.kerusakan=(musuh.nyawa) - this.serangan;
        this.namamusuh=musuh.nama;
    }
    void kondisi(){
        System.out.println(this.nama +" menyerang "+this.namamusuh+
        "\nnyawa "+this.namamusuh+" : "+this.kerusakan);}
        
}
/**
 * hero
 */
public class hero {

    public static void main(String[] args) {
        karakteragility dinda = new karakteragility();
        dinda.nama =  "dinda";
        dinda.nyawa = 60;
        dinda.serangan = 12;

    karakterstrong dandy = new karakterstrong();
        dandy.nama =  "dandy";
        dandy.nyawa = 160;
        dandy.serangan = 10;
dinda.serangankekarakterstrong(dandy);
dinda.kondisi();

    }
}
