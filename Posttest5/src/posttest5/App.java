/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest5;

/**
 *
 * @author ahmad
 */
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class App {
    
    static ArrayList<FullFace> dtfullface = new ArrayList<>(){
        {
            add(new FullFace("KYT", 10000, "L", "H001"));
            add(new FullFace("NHK", 12000, "M", "H002"));
        }
    };

    static ArrayList<HalfFace> dthalfface = new ArrayList<>(){
        {
            add(new HalfFace("Bogo", 11000, "Biru", "A001" ));
            add(new HalfFace("Kiwi", 13000, "Hijau", "A002" ));
        }
    };
    
    
    // static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buff =  new BufferedReader(input);
        // int menu;
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
            int menu = Integer.parseInt(buff.readLine());

            switch (menu) {
                case 1:
                System.out.println("======== Menu ========");
                System.out.println("===Tambah data helm===");
                System.out.println("1. Helm fullface");
                System.out.println("2. Helm halfface");
                System.out.println("======================");
                System.out.println();
                System.out.print("Input :");
                int menu1 = Integer.parseInt(buff.readLine());

                switch (menu1) {
                    case 1:
                    System.out.print("Masukan merk helm : ");
                    String merk = buff.readLine();
                    System.out.print("Masukan Harga helm : ");
                    int harga = Integer.parseInt(buff.readLine());
                    System.out.print("Masukan Ukuran helm : ");
                    String ukuran = buff.readLine();
                    System.out.print("Masukan ID Helm     : ");
                    String IDfullface = buff.readLine();
                    FullFace FullFacec = new FullFace(merk, harga, ukuran, IDfullface);
                    dtfullface.add(FullFacec);
                    break;

                    case 2:
                    System.out.print("Masukan merk helm : ");
                    String merk1 = buff.readLine();
                    System.out.print("Masukan Harga helm : ");
                    int harga1 = Integer.parseInt(buff.readLine());
                    System.out.print("Masukan Warna helm : ");
                    String warna1 = buff.readLine();
                    System.out.print("Masukan ID Helm     : ");
                    String IDhalfface = buff.readLine();
                    HalfFace halfFace = new HalfFace(merk1, harga1, warna1, IDhalfface);
                    dthalfface.add(halfFace);
                }
                break;

                case 2: 
                System.out.println("=== Lihat data helm ===");
                System.out.println("1. Lihat data Helm FullFace");
                System.out.println("2. Lihat data Helm HalfFace");
                System.out.println("======================");
                System.out.println();
                System.out.print("Masukan pilihan : ");
                int menu2 = Integer.parseInt(buff.readLine());
                if (menu2 == 1) {
                    System.out.println("=== Lihat helm FullFace===");
                    System.out.println("1. Lihat data Helm");
                    System.out.println("2. Lihat Ukuran Helm");
                    System.out.println("======================");
                    System.out.print("Masukan pilihan : ");
                    int ukuran=Integer.parseInt(buff.readLine());
//                    if (dtfullface.size() == 0) {
//                        System.out.println("Data masih kosong, isi data dulu ya!");
//                        System.out.println();
//
//                    }
                    System.out.println();
                    boolean showUkuran = false;
                    if (ukuran == 1) showUkuran = false;
                    if(ukuran == 2) showUkuran = true;
                    for (int i = 0; i < dtfullface.size(); i++) {
                        dtfullface.get(i).display(showUkuran);
                        System.out.println();
                    }
                }else if (menu2 == 2) {
                    System.out.println("=== Lihat helm halfFace===");
                    System.out.println("1. Lihat data Helm");
                    System.out.println("2. Lihat warna Helm");
                    System.out.println("======================");
                    System.out.print("Masukan pilihan : ");
                    int ukuran=Integer.parseInt(buff.readLine());
                    if (dthalfface.size() == 0) {
                        System.out.println("Data masih Kosong, isi data dulu ya!");
                        System.out.println();
 
                    }
                    System.out.println();
                    boolean showWarna = false;
                    if (ukuran == 1) showWarna = false;
                    
                    if (ukuran == 2) showWarna = true; 
                    for (int i = 0; i < dthalfface.size(); i++) {
                        dthalfface.get(i).display();
                        System.out.println();
                    }
                }
                
                break;

                case 3:
                System.out.println("=== Ubah Data Helm ===");
                System.out.println("1. Ubah Data Helm FullFace ");
                System.out.println("2. Ubah Data Helm HalfFace ");
                System.out.println("======================");
                System.out.print("Masukkan pilihan :");
                int menu3 = Integer.parseInt(buff.readLine());

                if (menu3 == 1) {
                    System.out.print("Masukan nama Merk : "); String carihlm = buff.readLine();
                    for(FullFace hlm : dtfullface){
                        if (hlm.getMerk().equals(carihlm)) {
                            System.out.print("Merk : "); hlm.SetMerk(buff.readLine());
                            System.out.print("Harga : "); hlm.SetHarga(Integer.parseInt(buff.readLine()));
                            System.out.print("Ukuran : "); hlm.setUkuran(buff.readLine());
                        }
                    }

                }else if (menu3 == 2) {
                    System.out.print("Masukan nama Helm : "); String carihlm = buff.readLine();
                    for(HalfFace hlm : dthalfface){
                        if (hlm.getMerk().equals(carihlm)) {
                            System.out.print("Merk : "); hlm.SetMerk(buff.readLine());
                            System.out.print("Harga : "); hlm.SetHarga(Integer.parseInt(buff.readLine()));
                            System.out.print("Warnan : "); hlm.setWarna(buff.readLine());
                        }
                    }
                    
                }else{
                    System.out.println("Data tidak tersedia");
                }
                break;

                case 4:
                System.out.println("=== Hapus data Helm ===");
                System.out.println("1. Hapus data Helm Fullface");
                System.out.println("2. Hapus data Helm Halfface");
                System.out.println("=======================");
                System.out.println();
                System.out.print("Masukan Pilihan :");
                int menu4 = Integer.parseInt(buff.readLine());
                if (menu4 == 1) {
                    if (dtfullface.size() == 0) {
                        System.out.println("Data masih kosong nih, tambahkan data dulu ya!");
                        System.out.println();
                    }
                    System.out.print("Masukan nama Helm :"); String carihlm1 = buff.readLine();
                    for (int i = 0; i < dtfullface.size(); i++) {
                        if (dtfullface.get(i).getMerk().equals(carihlm1)) {
                            dtfullface.remove(i);
                            System.out.println("Data berhasil terhapus");
                        }
                    }
                }else if (menu4 == 2) {
                    if (dthalfface.size() == 0) {
                        System.out.println("Data masih kosong nih, tambahkan data dulu ya!");
                        System.out.println();
                    }
                    System.out.print("Masukan nama Helm : "); String carihlm1 = buff.readLine();
                    for (int i = 0; i < dthalfface.size(); i++) {
                        if(dthalfface.get(i).getMerk().equals(carihlm1)) {
                            dthalfface.remove(i);
                            System.out.println("Data berhasil terhapus");
                        }
        
                    }
                    
                }
                break;

                case 5:
                ulang = false;
            
                default:
                System.out.println("Alhamdulillah... Semoga Sukses");
                    break;
                }
                
                
            } while (ulang);
        }
        
//        static void kosong(){
//            String x = "\npencet enter untuk lanjut...";
//            System.out.print(x);
//            System.console().readPassword();
//        }
    
//        static void bersihkan(){
//            try {
//                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
//            } catch (Exception ex) {
//                System.out.println("\033\143");
//            }
//        }
    }
