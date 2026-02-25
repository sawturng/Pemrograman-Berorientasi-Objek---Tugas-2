/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas_percabangan3;

import java.util.Scanner;

/**
 *
 * @author My MSI
 */
public class Tugas_percabangan3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jam Masuk : ");
        int masuk = input.nextInt();

        System.out.print("Masukkan Jam Keluar : ");
        int keluar = input.nextInt();

        int lamaKerja;

        if(keluar > masuk){
            lamaKerja = keluar - masuk;
        } else {
            lamaKerja = (12 - masuk) + keluar;
        }

        System.out.println("Lama Bekerja: " + lamaKerja + " jam");
    }
}