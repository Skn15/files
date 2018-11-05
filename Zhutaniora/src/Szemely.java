/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public abstract class Szemely {
    private String nev;
    private int szemelyiszam;

    public Szemely(String nev, int szemelyiszam) {
        this.nev = nev;
        this.szemelyiszam = szemelyiszam;
    }
    
    public abstract void metodus1();
   
    public void metodus2(){
        System.out.println("nem vagyok abstract");
    }
    
}
