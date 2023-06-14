package com.controller;

import com.config.DatabaseConnection;

public class DatabaseController {
 

    public static void getData(){
        DatabaseConnection.connection();
        try {
            DatabaseConnection.statement = DatabaseConnection.connect.createStatement();
            DatabaseConnection.resultSet = DatabaseConnection.statement.executeQuery("SELECT * FROM tb_barang ORDER BY ID DESC");

            while(DatabaseConnection.resultSet.next()){
                System.out.println(
                    DatabaseConnection.resultSet.getInt("ID") + ": " +
                    DatabaseConnection.resultSet.getString("Nama") + ": Rp."+
                    DatabaseConnection.resultSet.getString("Harga") + " (" +
                    DatabaseConnection.resultSet.getString("Jumlah") + ")"
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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

    public static void editData(int id, String namaBaru, int hargaBaru, int jumlahBaru) {
        try {
            DatabaseConnection.connection();
            DatabaseConnection.statement = DatabaseConnection.connect.createStatement();
            DatabaseConnection.statement.executeUpdate("UPDATE tb_barang SET Nama = '" + namaBaru + "', Harga = '" + hargaBaru + "', Jumlah = " + jumlahBaru + " WHERE id = " + id);
            System.out.println("Data berhasil diperbarui!");
            DatabaseConnection.statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteData(int id){
        try {
            DatabaseConnection.connection();
            DatabaseConnection.statement = DatabaseConnection.connect.createStatement();
            DatabaseConnection.statement.executeUpdate("DELETE FROM tb_barang WHERE `ID` = " + id);
        
            System.out.println("Data berhasil dihapus");
        
            DatabaseConnection.statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
