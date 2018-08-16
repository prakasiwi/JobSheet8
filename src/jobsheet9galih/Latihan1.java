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
public class Latihan1 {
    public static void hitung(int a, int b) 
    {
        System.out.println("Hasil: " + (a+b));
    }
    
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Masukkan ilangan I : ");
       int bilI = input.nextInt();
       
       System.out.print("Masukkan bilangan II : ");
       int bilI2 = input.nextInt();
       
       hitung (bilI,bilI2);
    }
    }

