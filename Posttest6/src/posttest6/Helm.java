/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

/**
 *
 * @author ahmad
 */
public abstract class Helm implements SpekHelm{
    protected String merk;
    protected int harga;

    public Helm(String merk, int harga) {
        this.merk = merk;
        this.harga = harga;
    }
    
    @Override
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

}