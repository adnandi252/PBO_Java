package com.layouts;

import java.util.Scanner;

import com.controller.DatabaseController;

public class InsertData {
    public static void insertData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Barang    : ");
        String namaBarang = input.nextLine();
        System.out.print("Harga Barang   : ");
        int hargaBarang = input.nextInt();
        System.out.print("Jumlah         : ");
        int jumlahBarang = input.nextInt();
        DatabaseController.insertData(namaBarang, hargaBarang, jumlahBarang);
    }
}
