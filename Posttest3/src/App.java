import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class App {

    static ArrayList<Helm> pendataanHelm = new ArrayList<>(){
        {
            add(new Helm("helm tambang", "SNI", 10000 ));
            add(new Helm("helm tambang2", "SNI2", 10000));
        }
    };
    static ArrayList<FullFace> dtfullface = new ArrayList<>(){
        {
            add(new FullFace("helm tambang", "SNI", 10000, "L", "Kuning" ));
            add(new FullFace("helm tentara", "SNI", 12000, "L", "Merah" ));
        }
    };

    static ArrayList<HalfFace> dthalfface = new ArrayList<>(){
        {
            add(new HalfFace("helm polisi", "SNI", 11000, "L", "Biru" ));
            add(new HalfFace("helm tentara1", "SNI", 13000, "L", "Hijau" ));
        }
    };
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buff =  new BufferedReader(input);
        boolean ulang = true;

        do { bersihkan();
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
                    System.out.print("Masukan nama helm : ");
                    String nama = buff.readLine();
                    System.out.print("Masukan merk helm : ");
                    String merk = buff.readLine();
                    System.out.print("Masukan Harga helm : ");
                    int harga = Integer.parseInt(buff.readLine());
                    System.out.print("Masukan Ukuran helm : ");
                    String ukuran = buff.readLine();
                    System.out.print("Masukan Warna helm : ");
                    String warna = buff.readLine();
                    FullFace FullFacec = new FullFace(nama, merk, harga, ukuran, warna);
                    dtfullface.add(FullFacec);
                    break;

                    case 2:
                    System.out.print("Masukan nama helm : ");
                    String nama1 = buff.readLine();
                    System.out.print("Masukan merk helm : ");
                    String merk1 = buff.readLine();
                    System.out.print("Masukan Harga helm : ");
                    int harga1 = Integer.parseInt(buff.readLine());
                    System.out.print("Masukan Ukuran helm : ");
                    String ukuran1 = buff.readLine();
                    System.out.print("Masukan Warna helm : ");
                    String warna1 = buff.readLine();
                    HalfFace halfFace = new HalfFace(nama1, merk1, harga1, ukuran1, warna1);
                    dthalfface.add(halfFace);
                }
                break;

                case 2:
                System.out.println("======== Menu ========");
                System.out.println("=== Lihat data helm ===");
                System.out.println("1. Lihat data Helm FullFace");
                System.out.println("2. Lihat data Helm HalfFace");
                System.out.println("======================");
                System.out.println();
                System.out.print("Masukan pilihan : ");
                int menu2 = Integer.parseInt(buff.readLine());
                if (menu2 == 1) {
                    if (dtfullface.size() == 0) {
                        System.out.println("Data masih kosong, isi data dulu ya!");
                        System.out.println();
                    }
                    System.out.println("Data Helm FullFace");
                    System.out.println();
                    for (int i = 0; i < dtfullface.size(); i++) {
                        System.out.println("Nama Helm :" + dtfullface.get(i).getNama());
                        System.out.println("Merk :" + dtfullface.get(i).getMerk());
                        System.out.println("Harga :" + dtfullface.get(i).getHarga());
                        System.out.println("Ukuran :" + dtfullface.get(i).getUkuran());
                        System.out.println("Warna :" + dtfullface.get(i).getWarna());
                        System.out.println();
                    }
                }else if (menu2 == 2) {
                    if (dthalfface.size() == 0) {
                        System.out.println("Data masih Kosong, isi data dulu ya!");
                        System.out.println();
                        
                    }
                    System.out.println("Data Helm HalfFace");
                    System.out.println();
                    for (int i = 0; i < dthalfface.size(); i++) {
                        System.out.println("Nama Helm :" + dthalfface.get(i).getNama());
                        System.out.println("Merk :" + dthalfface.get(i).getMerk());
                        System.out.println("Harga :" + dthalfface.get(i).getHarga());
                        System.out.println("Ukuran :" + dthalfface.get(i).getUkuran());
                        System.out.println("Warna :" + dthalfface.get(i).getWarna());
                        System.out.println();
                    }
                }
                kosong();
                break;

                case 3:
                System.out.println("======== Menu ========");
                System.out.println("=== Ubah Data Helm ===");
                System.out.println("1. Ubah Data Helm FullFace ");
                System.out.println("2. Ubah Data Helm HalfFace ");
                System.out.println("======================");
                System.out.print("Masukkan pilihan :");
                int menu3 = Integer.parseInt(buff.readLine());

                if (menu3 == 1) {
                    System.out.print("Masukan nama Helm : "); String carihlm = buff.readLine();
                    for(FullFace hlm : dtfullface){
                        if (hlm.getNama().equals(carihlm)) {
                            System.out.print("Nama Helm : "); hlm.SetNama(buff.readLine());
                            System.out.print("Merk : "); hlm.SetMerk(buff.readLine());
                            System.out.print("Harga : "); hlm.SetHarga(Integer.parseInt(buff.readLine()));
                            System.out.print("Ukuran : "); hlm.setUkuran(buff.readLine());
                            System.out.print("Warnan : "); hlm.setWarna(buff.readLine());
                        }
                    }

                }else if (menu3 == 2) {
                    System.out.print("Masukan nama Helm : "); String carihlm = buff.readLine();
                    for(HalfFace hlm : dthalfface){
                        if (hlm.getNama().equals(carihlm)) {
                            System.out.print("Nama Helm : "); hlm.SetNama(buff.readLine());
                            System.out.print("Merk : "); hlm.SetMerk(buff.readLine());
                            System.out.print("Harga : "); hlm.SetHarga(Integer.parseInt(buff.readLine()));
                            System.out.print("Ukuran : "); hlm.setUkuran(buff.readLine());
                            System.out.print("Warnan : "); hlm.setWarna(buff.readLine());
                        }
                    }
                    
                }else{
                    System.out.println("Data tidak tersedia");
                }
                break;

                case 4:
                System.out.println("======== Menu =========");
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
                        if (dtfullface.get(i).getNama().equals(carihlm1)) {
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
                        if(dthalfface.get(i).getNama().equals(carihlm1)) {
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
        
        static void kosong(){
            String x = "\npencet enter untuk lanjut...";
            System.out.print(x);
            System.console().readPassword();
        }
    
        static void bersihkan(){
            try {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } catch (Exception ex) {
                System.out.println("\033\143");
            }
        }
}