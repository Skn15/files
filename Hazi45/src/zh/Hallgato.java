/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

/**
 *
 * @author Patrik
 */
public class Hallgato extends Dolgozat{
    private int mennyitKeszult;
    private boolean sokatTanul;

    public Hallgato(int mennyitKeszult, boolean sokatTanul, int pontszam) {
        super(pontszam);
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanul = sokatTanul;
    }

    

    public int getMennyitKeszult() {
        return mennyitKeszult;
    }

    public void setMennyitKeszult(int mennyitKeszult) {
        this.mennyitKeszult = mennyitKeszult;
    }

    public boolean isSokatTanul() {
        return this.sokatTanul;
    }

    public void setSokatTanul(boolean sokatTanul) {
        this.sokatTanul = sokatTanul;
    }

//    public Dolgozat dolgozatotIr(Dolgozat o){
//    if (o.isSokatTanul());
//    }
    
    
}
