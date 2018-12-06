/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class TartosElelmiszer {
    private final char kezdo='T';
    private String nev;
    private double egysegar;
    private String megyseg;
    private int mennyiseg;

    public TartosElelmiszer(String nev, double egysegar, String megyseg, int mennyiseg) {
        this.nev = nev;
        this.egysegar = egysegar;
        this.megyseg = megyseg;
        this.mennyiseg = mennyiseg;
    }

    public char getKezdo() {
        return kezdo;
    }

    
    
    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public double getEgysegar() {
        return egysegar;
    }

    public void setEgysegar(double egysegar) {
        this.egysegar = egysegar;
    }

    public String getMegyseg() {
        return megyseg;
    }

    public void setMegyseg(String megyseg) {
        this.megyseg = megyseg;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    @Override
    public String toString() {
        return this.kezdo+";"+this.nev+";"+this.egysegar+";"+this.megyseg+";"+this.mennyiseg;
    }
    
    
    
}
