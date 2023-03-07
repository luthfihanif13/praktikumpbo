package posttest1;


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


