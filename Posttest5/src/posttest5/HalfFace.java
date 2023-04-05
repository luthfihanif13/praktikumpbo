/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

/**
 *
 * @author ahmad
 */
public class HalfFace extends Helm {
    private String warna;
    private final String IDhalfface;

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public String getIDhalfface() {
        return this.IDhalfface;
    }

    public HalfFace(String merk, int harga, String warna, String IDhalfface) {
        super(merk, harga);
        this.warna = warna;
        this.IDhalfface = IDhalfface;
    }

    @Override
    public void display(){
            System.out.println("Merk       : " + this.merk);
            System.out.println("Harga      : " + this.harga);
            System.out.println("Warna      : " + this.warna);
            System.out.println("ID         : " + this.IDhalfface);
        }
            
        public void display(boolean showWarna){
            if(showWarna) display();
            else {
                display();
        }
    }
}
