/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal.pkg1;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Jurnal1 {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
       Scanner yo=new Scanner(System.in);
        System.out.print("Masukan angka :");
        int input=yo.nextInt()+1;
        long fibo[]=new long[input];
        fibo[0]=0;
        fibo[1]=1;
        long jumlah=1;
        System.out.println("Output :");
       for (int i = 2; i < input; i++) {
           fibo[i]=fibo[i-1]+fibo[i-2];
           jumlah=jumlah + fibo[i];
            
       }
        
           System.out.print(jumlah+ " ");
        // TODO code application logic here
    }
    
}
