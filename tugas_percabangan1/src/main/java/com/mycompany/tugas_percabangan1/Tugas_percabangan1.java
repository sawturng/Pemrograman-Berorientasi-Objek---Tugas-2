/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas_percabangan1;

import java.util.Scanner;

/**
 *
 * @author My MSI
 */
public class Tugas_percabangan1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan huruf pertama: ");
        char h1 = input.next().charAt(0);

        System.out.print("Masukkan huruf kedua: ");
        char h2 = input.next().charAt(0);

        System.out.print("Masukkan huruf ketiga: ");
        char h3 = input.next().charAt(0);

        // Mengecek huruf vokal
        boolean h1Konsonan = !(h1=='a'||h1=='i'||h1=='u'||h1=='e'||h1=='o');
        boolean h2Vokal = (h2=='a'||h2=='i'||h2=='u'||h2=='e'||h2=='o');
        boolean h3Konsonan = !(h3=='a'||h3=='i'||h3=='u'||h3=='e'||h3=='o');

        if(h1Konsonan && h2Vokal && h3Konsonan){
            System.out.println("Urutan Konsonan-Vokal-Konsonan");
        } else {
            System.out.println("Bukan urutan Konsonan-Vokal-Konsonan");
        }
    }
}