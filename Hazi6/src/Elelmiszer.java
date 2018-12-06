/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class Elelmiszer extends TartosElelmiszer {
    private final char kezdo='E';
    private int szavatossag;

    public Elelmiszer(String nev, double egysegar, String megyseg, int szavatossag, int mennyiseg) {
        super(nev, egysegar, megyseg, mennyiseg);
        this.szavatossag = szavatossag;
    }

    public char getKezdo() {
        return this.kezdo;
    }

    
    
    public int getSzavatossag() {
        return szavatossag;
    }

    public void setSzavatossag(int szavatossag) {
        this.szavatossag = szavatossag;
    }

    @Override
    public String toString() {
        return super.toString();
    }
   
 
    

    
}
