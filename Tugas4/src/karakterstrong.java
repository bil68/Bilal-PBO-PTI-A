package punyab;

class karakterstrong {
    String nama;
    double nyawa;
    double serangan;
   private double kerusakan;
   private String namamusuh;
    karakterstrong(String nama, double nyawa){
        this.nama=nama; this.nyawa=nyawa; 
    }
    public void serangankekarakteragility(karakteragility musuh){
        this.kerusakan=(musuh.nyawa*2) - (this.serangan*6);
        this.namamusuh=musuh.nama;
    }
    public void serangankekarakterintel(karakterintel musuh){
        this.kerusakan=(musuh.nyawa) - (this.serangan*6);
        this.namamusuh=musuh.nama;
    }
    public void kondisi(){
        System.out.println(this.nama +" menyerang "+this.namamusuh+
        "\nnyawa "+this.namamusuh+" : "+this.kerusakan);
    }
}
