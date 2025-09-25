# Laporan Praktikum Pemrograman Berorientasi Objek
**Pertemuan Keenam**

**Nama:** Husain Asrarillah  
**NIM:** 09020624035  
**Mata Kuliah:** Pemrograman Berorientasi Objek  
**Dosen Pengampu:** Bapak Bayu Adhi Nugroho, Ph.D  

---

## Judul Praktikum
Pengelolaan Data Komik Menggunakan Java Swing dan PostgreSQL

---

## 1. Tujuan
Membuat aplikasi desktop Java Swing untuk mengelola data komik. Aplikasi ini harus dapat melakukan operasi dasar seperti menambah, membaca, mengubah, dan menghapus data (CRUD).

---

## 2. Teori Singkat
Aplikasi ini dibangun menggunakan beberapa teknologi inti:

- **Java Swing**: Membuat antarmuka grafis (GUI) aplikasi.  
- **JDBC (Java Database Connectivity)**: Menghubungkan program Java dengan database.  
- **PostgreSQL**: Tempat penyimpanan data komik.  
- **CRUD**: Akronim untuk empat operasi data: Create (membuat), Read (membaca), Update (mengubah), Delete (menghapus).  

---

## 3. Implementasi Program

### DataKomik.java
Kelas utama yang menampilkan tabel data komik. Kelas ini terhubung ke database dan menampilkan semua data dalam tabel saat aplikasi dimulai. Terdapat tombol untuk Insert, Update, dan Delete.  

**Logika utama:**  
- `showTable()` mengambil semua data dari tabel `toko_komik_jadoel` di PostgreSQL.  
- Data diubah menjadi format tabel yang dapat ditampilkan di GUI.  
- Tombol-tombol memanggil dialog terpisah untuk operasi lain.  

---

### InsertDialog.java
- Berfungsi sebagai dialog untuk memasukkan data komik baru.  
- Pengguna mengisi ID, Judul, Pengarang, Tahun, dan Genre.  
- Tombol **SAVE** menjalankan perintah `INSERT SQL`.  

---

### UpdateDialog.java
- Digunakan untuk mengubah data yang sudah ada.  
- Data dari baris yang dipilih otomatis dimuat ke kolom input.  
- Kolom ID tidak bisa diubah.  
- Tombol **UPDATE** menjalankan perintah `UPDATE SQL`.  

---

### DeleteDialog.java
- Dialog konfirmasi untuk menghapus data.  
- Menampilkan data yang akan dihapus di kolom non-editable.  
- Tombol **DELETE** menjalankan perintah `DELETE SQL` setelah konfirmasi.  

---

## 4. Kesimpulan
Aplikasi ini berhasil mengimplementasikan sistem manajemen data komik yang fungsional.  
- Java Swing menyediakan antarmuka yang jelas.  
- JDBC memungkinkan interaksi data efisien dengan PostgreSQL.  
- Operasi CRUD diimplementasikan dalam dialog terpisah, membuat alur kerja lebih terorganisir dan aman.  
