package punyab;

public class karaktermain {

    public static void main(String[] args) {
      karakterintel bil5 = new karakterintel(null);
      karakterstrong bil7 = new karakterstrong(null, 0);
      karakteragility bil18 = new karakteragility("bilal");
      karakteragility bil33 = new karakteragility("the bilal", 70);
      karakteragility bil70 = new karakteragility("bilal core of them", 80, 5);
      bil70.serangankekarakterintel(bil5);
      bil70.kondisi();
      bil70.serangankekarakterintel(bil5, bil7);
      bil70.kondisi();
      bil70.serangankekarakterintel(bil7);
      bil70.kondisi();

    }
}
