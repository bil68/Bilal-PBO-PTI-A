package punyab;

class karakterintel {
    String nama;
    double nyawa;
    double serangan;
    private double kerusakan;
    private String namamusuh;
    karakterintel(String nama){
        this.nama=nama;
    }
    public void serangankekarakteragility(karakteragility musuh){
        this.kerusakan=(musuh.nyawa*2) - this.serangan;
        this.namamusuh=musuh.nama;
    }
    public void serangankekarakterstrong(karakterstrong musuh){
        this.kerusakan=(musuh.nyawa) - this.serangan;
        this.namamusuh=musuh.nama;
    }
    public void kondisi(){
        System.out.println(this.nama +" menyerang "+this.namamusuh+
        "\nnyawa "+this.namamusuh+" : "+this.kerusakan);}
}
