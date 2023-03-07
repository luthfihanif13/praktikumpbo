package posttest1;

import java.util.ArrayList;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;
import java.util.Scanner;

public class App {

    static ArrayList<Helm> pendataanHelm = new ArrayList<>(){
        {
            add(new Helm("helm tambang", "SNI", 10000));
            add(new Helm("helm tambang2", "SNI2", 10000));
        }
    };
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // InputStreamReader input = new InputStreamReader(System.in);
        // BufferedReader buff =  new BufferedReader(input);
        int menu;
        boolean ulang = true;

        do {
            System.out.println("+++++++++++++++++++");
            System.out.println("|| 1. Tambah Data ||");
            System.out.println("|| 2. Lihat Data  ||");
            System.out.println("|| 3. Ubah Data   ||");
            System.out.println("|| 4. Hapus Data  ||");
            System.out.println("|| 5. Keluar      ||");
            System.out.println("+++++++++++++++++++");
            System.out.println();
            System.out.print("Pilihan : ");
            // int pilihan = Integer.parseInt(buff.readLine());
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    tambahData();                    
                    break;
                case 2:
                    lihatData();
                    break;
                case 3:
                    ubahData();
                    break;
                case 4:
                    hapusData();
                    break;
                case 5:
                    ulang = false;
                    System.out.println("Selamat & semoga sukses");
                    break;
                default:
                    System.out.println("inputan tidak ada");
                    break;
            }


        } while (ulang);
    }

    static void tambahData() {
        System.out.println("=== Tambah Data ===");
        System.out.print("Nama Helm (ex: tambang, proyek) : ");
        String nama = input.next();
        input.nextLine();
        System.out.print("Merk : ");
        String merk = input.next();
        input.nextLine();
        System.out.print("Harga: ");
        int harga = input.nextInt();

        Helm helm = new Helm(nama, merk, harga);
        pendataanHelm.add(helm);

        System.out.println("Data Berhasil ditambahkan");
    }


    static void lihatData () {
        if (pendataanHelm.size() == 0) {
            System.out.println("Data masih kosong nih, tambahkan data dulu ya!");
            System.out.println();
        } else {
            System.out.println("=== Data Helm ===");

            for (int i = 0; i < pendataanHelm.size(); i++) {
                Helm helm = pendataanHelm.get(i);
                System.out.println("Data ke " + (i+1));
                System.out.println("Nama : " + helm.getNama());
                System.out.println("Merk : " + helm.getMerk());
                System.out.println("Harga: " + helm.getHarga());
                System.out.println();

                
            }
        }
    }

    static void ubahData() {
        lihatData();
        if (pendataanHelm.size() == 0) {
            System.out.println("Data masih kosong nih, tambahkan data dulu ya!");
            System.out.println();          
        } else {
            System.out.println("=== Ubah Data ===");
            System.out.println();
            System.out.print("Masukan Nama Helm yang ingin diubah : "); 
            String namaHelm = input.next();
            for (Helm helm : pendataanHelm) {
                if (helm.getNama().equals(namaHelm)) {
                    System.out.print("Masukan nama Helm yang baru : "); 
                    helm.SetNama(input.next());
                    System.out.print("Masukan nama Merk yang baru : "); 
                    helm.SetMerk(input.next());
                    System.out.print("Masukan Harga yang baru : "); 
                    helm.SetHarga(input.nextInt());



                }
            }
        }
    }

    static void hapusData() throws NumberFormatException{
        lihatData();
        if (pendataanHelm.size() == 0) {
            System.out.println("Data masih kosong nih, tambahkan data dulu ya!");
            System.out.println();          
        } else {
            System.out.println("=== Hapus Data ===");
            System.out.println();
            System.out.print("Mau hapus data keberapa ? ");
            int angka = input.nextInt();

            // int ang = Integer.parseInt(angka);
            pendataanHelm.remove(angka-1);


        }
    }
}
