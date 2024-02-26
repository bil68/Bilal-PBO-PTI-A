package tugaspbo;


import java.util.Scanner;

public class apliksisehat {

    static String[][] users = {{"bilal", "mie goreng"}, {"samsung", "es teh"}, {"steve", "warmindo"}};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean prosespengenalan = false;

        System.out.println("=== proses pengenalan ===");

    
        while (!prosespengenalan) {
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();

        
            prosespengenalan = pengenalan(username, password);

            if (prosespengenalan) {
                System.out.println("Login berhasil. selamat, " + username + "!");
            } else {
                System.out.println("password atau nama anda salah");
            }
        }

        input.close();
    }

    
    static boolean pengenalan(String username, String password) {
        for (String[] user : users) {
            if (user[0].equals(username) && user[1].equals(password)) {
                return true;
            }
        }
        return false;
    }
}
