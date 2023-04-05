/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

/**
 *
 * @author ahmad
 */
public final class FullFace extends Helm{
    private String ukuran;
    private final String IDfullface;

    public String getUkuran() {
        return this.ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }
    
    public String getIDfullface() {
        return this.IDfullface;
    }
    

    public FullFace(String merk, int harga, String ukuran, String IDfullface) {
        super(merk, harga);
        this.ukuran = ukuran;
        this.IDfullface = IDfullface;
    }

    @Override
    public void display(){
            System.out.println("Merk       : " + this.merk);
            System.out.println("Harga      : " + this.harga);
            System.out.println("Ukuran     : " + this.ukuran);
            System.out.println("ID         : " + this.IDfullface);
        }
            
        public void display(boolean showUkuran){
            if(showUkuran) display();
            else {
                display();
        }
    }
}
