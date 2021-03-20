/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorLingkaran;

import java.util.Scanner;

/**
 *
 * @author 62823
 */
public class programKalkulator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Double luasLingkaran, kelilingLingkaran, jarijari, phi = 3.14;
        
        int inputMenu;
        System.out.println("==MENU==\n1.Hitung Luas lingkaran\n2.Hitung Keliling lingkaran\nInput Menu : ");
        inputMenu = scan.nextInt();
        
        switch(inputMenu){
            case 1 -> {
                System.out.println("Input Jari-jari lingkaran : ");
                jarijari = scan.nextDouble();
            
                luasLingkaran = phi*jarijari*jarijari;
            
                System.out.println("Luas lingkaran adalah "+luasLingkaran);
            }
            
            case 2 -> {
                System.out.println("Input Jari-jari lingkaran : ");
                jarijari = scan.nextDouble();
                
                kelilingLingkaran = 2*phi*jarijari;
                
                System.out.println("Keliling lingkaran adalah : "+kelilingLingkaran);
            }
                
            default -> System.out.println("Inputan Anda Salah!");
        }
    }
}
