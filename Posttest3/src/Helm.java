class Helm{
    private String nama;
    private String merk;
    private int harga;

    public Helm(String nama, String merk, int harga) {
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
    }

    
    public String getNama() {
        return nama;
    }
    
    public String getMerk() {
        return merk;
    }
    
    public int getHarga() {
        return harga;
    }

    public void SetNama(String nama) {
        this.nama = nama;
    }

    public void SetMerk(String merk) {
        this.merk = merk;
    }

    public void SetHarga(int harga) {
        this.harga = harga;
    }

}

class FullFace extends Helm {
    private String ukuran;
    private String warna;

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getUkuran() {
        return this.ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }


    public FullFace(String nama, String merk, int harga, String ukuran, String warna) {
        super(nama, merk, harga);
        this.ukuran = ukuran;
        this.warna = warna;
    }
}


class HalfFace extends Helm {
    private String warna;
    private String ukuran;

    public String getUkuran() {
        return this.ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public HalfFace(String nama, String merk, int harga, String ukuran, String warna) {
        super(nama, merk, harga);
        this.warna = warna;
        this.ukuran = ukuran;
    }


}


