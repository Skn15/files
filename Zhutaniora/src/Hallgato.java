/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Hallgato extends Szemely implements IGyenge,hasonlithato<Hallgato>,Comparable<Hallgato>{

    private String neptunkod;
    private double atlag;

    public Hallgato(String neptunkod, double atlag, String nev, int szemelyiszam) {
        super(nev, szemelyiszam);
        this.neptunkod = neptunkod;
        this.atlag = atlag;
    }

    public String getNeptunkod() {
        return neptunkod;
    }

    public void setNeptunkod(String neptunkod) {
        this.neptunkod = neptunkod;
    }

    public double getAtlag() {
        return atlag;
    }

    public void setAtlag(double atlag) {
        this.atlag = atlag;
    }

    @Override
    public String toString() {
        return "Hallgato{" + "neptunkod=" + neptunkod + ", atlag=" + atlag + '}';
    }

    @Override
    public void metodus1() {
        System.out.println("meg lettem valositva :)");
        
    }

    @Override
    public boolean gyengeE() {
        if (this.atlag<IGyenge.GYENGE) return true;
        else return false;
    }

    @Override
    public int hasonlit(Hallgato o) {
       return Double.compare(this.getAtlag(),o.getAtlag());
    }

    @Override
    public int compareTo(Hallgato o) {
        return Double.compare(this.getAtlag(),o.getAtlag());
    }
    
    

    

   
    
}
