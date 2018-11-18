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
public class Dolgozat implements egyetem.Pontozhato {
    private int pontszam;

    public Dolgozat(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public boolean megfelelt() {
        if(this.pontszam > 35) return true;
        else if(this.pontszam == -1) return false;
            else return false;
    }

     
    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public String toString() {
        return "Dolgozat{" + "pontszam=" + pontszam + '}';
    }
    
    
}
