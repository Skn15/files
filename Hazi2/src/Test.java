/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrik
 */

//5.feladat
import java.util.Random;
    public class Test {
        public static void main(String[] args) {
    Random rnd = new Random();
     int[] t = new int[30];
        for (int i = 0; i < t.length; i++) {
                t[i] = rnd.nextInt(10);
                    }
            printArray(t);
        long timeStart = System.currentTimeMillis();
           insertionSort(t);
        long timeEnd = System.currentTimeMillis();
            printArray(t);
    System.out.println(timeEnd - timeStart);
}
        static void printArray(int[] a) {
            for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            }
        System.out.println();
}
static void insertionSort(int[] a) {
    int i,j,tmp;
	for(i=0;i<=a.length-1;i++){
	    for(j=i+1;j<a.length;j++)
                if(a[i]>a[j]){
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;}
	}
}

}
