/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan22.lingkaran;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan22Lingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Diameter;
        double JariJari;
        double LuasLingkaran;
        double KelilingLingkaran;
        
        System.out.println("=====Perhitungan Lingkaran=====");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai diameter lingkaran : ");
        Diameter = sc.nextDouble();
        
        System.out.println();
        
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        JariJari = Diameter / 2;
        LuasLingkaran = 3.14 * Diameter; //Nilai phi = 3.14 atau 22/7
        KelilingLingkaran = 2 * 3.14 * JariJari; //Nilai phi 3.14 atau 22/7
        System.out.println("Jari-jari lingkaran = " + JariJari);
        System.out.println("Luas lingkaran = " + LuasLingkaran);
        System.out.println("Keliling Lingkaran = " + KelilingLingkaran);
        
    }
    
}
