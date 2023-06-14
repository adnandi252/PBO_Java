package com.layouts;

import java.util.Scanner;
import com.controller.DatabaseController;

public class EditData {
    public static void editData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Pilih ID barang: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Nama Baru      : ");
        String namaBaru = input.nextLine();
        System.out.print("Harga Baru     : ");
        int hargaBaru = input.nextInt();
        System.out.print("Jumlah Baru    : ");
        int jumlahBaru = input.nextInt();
        DatabaseController.editData(id, namaBaru, hargaBaru, jumlahBaru);
    }
}
