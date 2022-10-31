package telephone;

import java.util.Scanner;

public class Telephone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan jumlah kontak yang ingin disimpan: ");
        int k = in.nextInt();
        in.nextLine();
        Phone con = new Contact();
        for(int i=1;i<=k;i++)
        {
            System.out.print(i + ".");
            System.out.println("Nama:");
            String nama = in.nextLine();
            System.out.println("Nomor:");
            String nomor = in.nextLine();
            con.save(nama, nomor);
        }
        System.out.println("Masukkan nama yang ingin Ditelfon: ");
        String nama = in.nextLine();
        con.call(nama);
        

        
    }
    
}
