/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.config;

/**
 *
 * @author ASUS
 */
public class DatabaseConfig {
    public static void insertData(String namaBaru, int hargaBaru, int jumlahBaru){
        try {
            DatabaseConnection.connection();
            DatabaseConnection.statement = DatabaseConnection.connect.createStatement();
            DatabaseConnection.statement.executeUpdate("INSERT INTO `tb_barang` (`ID`, `Nama`, `Harga`, `Jumlah`) VALUES (NULL, '"+namaBaru+"', '"+hargaBaru+"', '"+jumlahBaru+"')");
            System.out.println("Data berhasil di simpan");
            DatabaseConnection.statement.close();            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
