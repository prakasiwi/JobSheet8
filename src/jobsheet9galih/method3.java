/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9galih;

import java.util.Scanner;

/**
 *
 * @author galih
 */
public class method3 {
    public static int terbesar(int a,int b,int c,int hasil) {
        if (a>b&& a>c){
            hasil = a;
        } else if (b>a && b > c){
        hasil = b;
        }else if(c>a && c>b){
            hasil = c;
        }
            return hasil;
        }
        
    public static void main(String[] args){
        
        Scanner scanner = new Scanner (System.in);
           System.out.println("Masukkan angka I : ");
           int a =  scanner.nextInt();
           System.out.println("Masukkan angka II : ");
           int b =  scanner.nextInt();
           System.out.println("Masukkan angka III : ");
           int c =  scanner.nextInt();
           int hasil = 0;
           
           int z;
           z=terbesar (a,b,c,hasil);
           System.out.println("Angka terbesar adalah : " + z);
           
        }
        
    }
    

