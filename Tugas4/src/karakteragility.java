package punyab;

class karakteragility {
    String nama;
    double nyawa;
    double serangan;
    private double kerusakan;
    private String namamusuh;
    karakteragility(String nama){
        this.nama=nama;
    }
    karakteragility(String nama, double nyawa){
        this.nama=nama; this.nyawa=nyawa;
    }
    karakteragility(String nama, double nyawa, double serangan){
        this.nama=nama; this.nyawa=nyawa; this.serangan=serangan;
    }
    public void serangankekarakterintel(karakterintel musuh){
        this.kerusakan=(musuh.nyawa*2) - (this.serangan*5);
        this.namamusuh=musuh.nama;
    }
    public void serangankekarakterintel(karakterintel musuh, karakterstrong combo){
    this.kerusakan=(musuh.nyawa*2) - ((this.serangan*5)+combo.serangan);
    this.namamusuh=musuh.nama;
    }
    public void serangankekarakterintel(karakterstrong musuh){
    this.kerusakan=(musuh.nyawa*2) - (this.serangan*5);
    this.namamusuh=musuh.nama;
}
    public void serangankekarakterstrong(karakterstrong musuh){
        this.kerusakan=(musuh.nyawa) - (this.serangan*5);
        this.namamusuh=musuh.nama;
    }
    public void kondisi(){
        System.out.println(this.nama +" menyerang "+this.namamusuh+
        "\nnyawa "+this.namamusuh+" : "+this.kerusakan);
    }
    public karakteragility kemabalikanKarakteragility(){
        karakteragility karakteragility = new karakteragility(nama, nyawa, serangan);
        return karakteragility;
    }
 }
