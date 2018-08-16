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
public class Latihan5Glh {
    public static void main(String[] args){
        Scanner nilai = new Scanner (System.in);
        int nilai1, nilai2, nilai3, terbesar;
        System.out.print("nilai1 :");
        nilai1 = nilai.nextInt();
        System.out.print("nilai2 :");
        nilai2 = nilai.nextInt();
        System.out.print("nilai3 :");
        nilai3 = nilai.nextInt();
        
        terbesar = (nilai1>nilai2)?nilai1:nilai2;
        terbesar = (terbesar>nilai3)?terbesar:nilai3;
        System.out.println("Nilai tertinggi adalah :" + terbesar);
      
    }
    
}
