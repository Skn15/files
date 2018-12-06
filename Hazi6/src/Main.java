
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class Main {
    public static void main(String[] args) {
      List <TartosElelmiszer> li=new ArrayList();
        
        try{    
        FileReader fr=new FileReader(new File("elelmiszeres.txt"));
        BufferedReader br=new BufferedReader(fr);
        
        String sor;
        while((sor=br.readLine())!=null){
            String [] tmp=sor.split(";");
            
            if(tmp.length>5){
                Elelmiszer k1=new Elelmiszer(tmp[tmp.length-4],Double.parseDouble(tmp[tmp.length-3]),tmp[tmp.length-2],Integer.parseInt(tmp[tmp.length-1]),Integer.parseInt(tmp[tmp.length]));
                li.add(k1);
            }
            else {TartosElelmiszer k2 = new TartosElelmiszer(tmp[tmp.length-3],Double.parseDouble(tmp[tmp.length-2]),tmp[tmp.length-1],Integer.parseInt(tmp[tmp.length]));
                li.add(k2);
            }
        }
         br.close();
          
    }catch(IOException e){
           System.out.println("File Hiba!");
    }
        
         try{
            FileWriter fw=new FileWriter(new File("ki.txt"));
            BufferedWriter bw=new BufferedWriter(fw);
           
           for(int i=0;i<li.size()-1;i++){
                bw.write(li.get(i).toString());
                bw.newLine();
         
         }
         }catch(IOException e){
             System.out.println("File Hiba!");
         }
        
}


    





}
