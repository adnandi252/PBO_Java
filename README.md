# App.java
di dalam `App.java` terdapat method main yang menjalankan object dari class Menu dan method menu().
```java
Menu.menu();
```
tujuannya adalah untuk menjalankan dan menampilkan program.

# com
terdapat beberapa package, yaitu:
1. config
2. controllers
3. layouts
4. models


## 1. config
class DatabaseConnection: Tujuan class ini adalah untuk membuat koneksi dengan database yang sesuai dengan URL.


## 2. controllers
class DatabaseController berisi method-method yang berguna untuk melakukan operasi dengan database. method ini yaitu:
1. readData(); untuk mengambil atau membaca data yang tersimpan dalam database.
2. insertData(); untuk menambahkan data ke dalam database.
3. editData(); untuk mengedit data yang ada dalam database menjadi data yang baru.
4. deleteData(); untuk menghapu data yang ada dalam database.


## 3. layouts
terdapat beberapa class dalam package ini, yaitu:
1. GetData
2. InsertData
3. EditData
4. DeleteData
5. Menu

### 1. GetData
class ini akan memanggil method getData() dari class DatabaseConfig

### 2. InsertData
class ini akan memanggil method insertData() dari class DatabaseConfig.

### 3. EditData
class ini akan memanggil method editData() dari class DatabaseConfig.

### 4. DeleteData
class ini akan memanggil method deleteData() dari class DatabaseConfig.

### 5. Menu
untuk menyimpan template dari program/aplikasi ini. class ini akan mengimport method dari class GetData, InsertData, EditData, dan DeleteData.


## 4. models
class Barang: berisi model dari barang yang ada dalam database. memiliki atribut nama barang, harga barang, dan jumlah barang, serta method setter getter untuk setiap atrbutnya.