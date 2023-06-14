package com.layouts;

import java.util.Scanner;

import com.controller.DatabaseController;

public class DeleteData {
    public static void deleteData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Pilih ID Barang untuk Dihapus: ");
        int idBarang = input.nextInt();
        DatabaseController.deleteData(idBarang);
    }
}