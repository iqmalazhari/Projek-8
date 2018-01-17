/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek8;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
       
        double nombor1;
        double nombor2;
        double tambah;
        double tolak;
        double darab;
        double bahagi;
        
        System.out.print("Masukkan nombor pertama : ");
        nombor1=input.nextDouble();
        
        System.out.print("Masukkan nombor kedua : ");
        nombor2=input.nextDouble();
        
        tambah = nombor1+nombor2;
        tolak=nombor1-nombor2;
        darab=nombor1*nombor2;
        bahagi=nombor1/nombor2;
        
        System.out.println("===================JAWAPAN====================");
        System.out.println("Jumlah bagi "+nombor1+" + "+nombor2+" = "+tambah);
        System.out.println("Jumlah bagi "+nombor1+" - "+nombor2+" = "+tolak);  
        System.out.println("Jumlah bagi "+nombor1+" * "+nombor2+" = "+darab);
        System.out.println("Jumlah bagi "+nombor1+" / "+nombor2+" = "+bahagi);
        System.out.println("===============================================");
}
}