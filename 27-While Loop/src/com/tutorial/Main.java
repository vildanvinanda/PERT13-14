/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

/**
 *
 * @author Vildan Vinanda
 * Nama     :   Vildan Vinanda
 * NIM      :   A2.1900185
 * Kelas    :   TI-IA
 * Pertemuan 13-14
 */
public class Main {

    public static void main(String[] args) {
        

//        while (kondisi) {
//            aksi
//        }

        int a = 0;
        boolean kondisi = true;

        System.out.println("awal program");

        while (kondisi) {
            System.out.println("while loop ke-" + a);

            if (a == 10){
                kondisi = false;
            }

            a++;
        }

        System.out.println("akhir program");

    }
    
}
