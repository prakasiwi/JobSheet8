/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9galih;

/**
 *
 * @author galih
 */
public class Latihan2Method01 {
    public static int hitung(int a,int b) 
    {
        int c = a+b;
        return c;
    }
    
    public static void main(String[] args) 
    {
        int x;
        int bill = 22, bil2 = 68;
        
        x = hitung(bill,bil2);
        
        System.out.println("Hasil : " + x);
        
    }
}
