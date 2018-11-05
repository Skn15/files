
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Teszt {
    
    public static void rendez(List l){
        for(int i=0;i<l.size()-1;i++){
            for(int j=i+1;j<l.size();j++){
            if(l.get(i) instanceof hasonlithato && l.get(j) instanceof hasonlithato){
                if(((hasonlithato)l.get(i)).hasonlit((hasonlithato)l.get(j))<0){
                    hasonlithato tmp;
                    tmp=(hasonlithato)(l.get(i));
                    l.set(i,l.get(j));
                    l.set(j, tmp);
                    
                }
                
            }
            else throw new ClassFormatError();
                    }}
}
    
    public static void main(String[] args) {
        
        List<Hallgato> li = new ArrayList();
        List<Senki> li2= new LinkedList();
        
        li.add(new Hallgato("ABGWG",2.6,"Deb Ella",1312341));
        li.add(new Hallgato("BWGWA",2.1,"Borond Odon",2214147));
        li.add(new Hallgato("RAGAGW",4.3,"Vegh Bela",2467129));
        
        for(Hallgato i:li){
            System.out.println(i);
        }
        
//        li.set(0,new Hallgato("ABGBW",2.7,"Vicc Elek",4214455));
        
        
        System.out.println(li.isEmpty());
        System.out.println(li.remove(0));
             
//        Collections.sort(li);
        
//        li.remove(0);
        
        rendez(li);

        for(int i=0;i<li.size();i++){
            System.out.println(li.get(i));
        }
        
        li2.add(new Senki(2));
        li2.add(new Senki(5));
        
        rendez(li2);
//        Collection.sort(li); vmi nem jo
        
    }
}
