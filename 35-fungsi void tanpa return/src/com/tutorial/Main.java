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
        
        // void itu artinya hampa

        System.out.println(simpel());

        fungsiVoid("apa pun");
        selamatPagi("emak");
        selamatPagi("abah");

    }

    private static void selamatPagi(String nama){
        System.out.println("selamat pagi " + nama);
    }


    // fungsi atau method tanpa kembalian
    private static void fungsiVoid(String input){
        System.out.println(input);
    }

    // fungsi atau method dengan kembalian
    // sehingga menggunakan return untuk
    // mengembalikan nilainya (10.0f)
    private static float simpel(){
        return 10.0f;
    }
    
}
