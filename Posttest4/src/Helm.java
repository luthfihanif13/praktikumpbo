class Helm{
    private String merk;
    private int harga;

    public Helm(String merk, int harga) {
        this.merk = merk;
        this.harga = harga;
    }
    
    public String getMerk() {
        return merk;
    }
    
    public int getHarga() {
        return harga;
    }

    public void SetMerk(String merk) {
        this.merk = merk;
    }

    public void SetHarga(int harga) {
        this.harga = harga;
    }


    public void display() {
        System.out.println("Merk       :" + this.merk);
        System.out.println("Harga      :" + this.harga);
    }

}

class FullFace extends Helm {
    private String ukuran;

    public String getUkuran() {
        return this.ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }


    public FullFace(String merk, int harga, String ukuran) {
        super(merk, harga);
        this.ukuran = ukuran;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Ukuran       : " + this.ukuran);
    }
        
    public void display(boolean showUkuran){
        if(showUkuran) display();
        else super.display();
    }
}


class HalfFace extends Helm {
    private String warna;

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public HalfFace(String merk, int harga, String warna) {
        super(merk, harga);
        this.warna = warna;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Warna      : " + this.warna);
    }
        
    public void display(boolean showWarna){
        if(showWarna) display();
        else super.display();
    }


}


