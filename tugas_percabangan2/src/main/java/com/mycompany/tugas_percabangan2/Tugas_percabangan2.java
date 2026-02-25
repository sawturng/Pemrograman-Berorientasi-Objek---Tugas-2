/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas_percabangan2;

import java.util.Scanner;

/**
 *
 * @author My MSI
 */
public class Tugas_percabangan2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi pertama: ");
        int s1 = input.nextInt();

        System.out.print("Masukkan sisi kedua: ");
        int s2 = input.nextInt();

        System.out.print("Masukkan sisi ketiga: ");
        int s3 = input.nextInt();

        if(s1 == s2 && s2 == s3){
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
    }
}