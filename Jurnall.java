/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnall;

/**
 *
 * @author Praktikan
 */
public class Jurnall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int l = 1;
    int tinggo = 10;
    int nilai = 12/2;
    for(int i=1;i<=nilai;i++){
    for(int k=nilai;k>i;k--){
    System.out.print(" ");
    }
    for(int j=1;j<=l;j++){
    System.out.print("+");
    }
    l+=2;

    System.out.println("");
    }
    l -= 4;

    for(int i=(nilai-1);i>=1;i--){
    for(int k=i;k<=(nilai-1);k++){
    System.out.print(" ");
    }
    for(int j=l;j>=1;j--){
    System.out.print("+");
    }
    l-=2;

    System.out.println("");
    }
    }
    
    
}
