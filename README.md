---
# Laporan Praktikum Pemrograman Berorientasi Objek

Pertemuan Keenam
Nama: Husain Asrarillah | NIM: 09020624035
Mata Kuliah: Pemrograman Berorientasi Objek
Dosen Pengampu: Bapak Bayu Adhi Nugroho, Ph.D

---
### Pengelolaan Data Komik Menggunakan Java Swing dan PostgreSQL

## 1. Tujuan
Tujuan praktikum ini adalah membuat aplikasi desktop Java Swing untuk mengelola data komik. Aplikasi ini harus dapat melakukan operasi dasar seperti menambah, membaca, mengubah, dan menghapus data (CRUD).

---

## 2. Teori Singkat
Aplikasi ini dibangun menggunakan beberapa teknologi inti:
* **Java Swing**: Digunakan untuk membuat antarmuka grafis (GUI) aplikasi.
* **JDBC (Java Database Connectivity)**: Digunakan untuk menghubungkan program Java dengan database.
* **PostgreSQL**: Digunakan sebagai tempat penyimpanan data komik.
* **CRUD**: Akronim untuk empat operasi data: **Create** (membuat), **Read** (membaca), **Update** (mengubah), dan **Delete** (menghapus).

---

## 3. Implementasi Program
Program ini terdiri dari beberapa kelas yang memiliki fungsi spesifik:

### `DataKomik.java`
Ini adalah kelas utama yang menampilkan tabel data komik. Kelas ini terhubung ke database dan menampilkan semua data dalam tabel saat aplikasi dimulai. Terdapat tombol untuk melakukan operasi Insert, Update, dan Delete.

**Logika Utama**:
* Metode `showTable()` mengambil semua data dari tabel `toko_komik_jadoel` di PostgreSQL.
* Data ini kemudian diubah menjadi format tabel yang dapat ditampilkan di GUI.
* Tombol-tombol memanggil dialog terpisah untuk operasi lain.

### `InsertDialog.java`
Kelas ini berfungsi sebagai dialog untuk memasukkan data komik baru.
* Pengguna mengisi data di kolom yang disediakan, seperti ID, Judul, Pengarang, Tahun, dan Genre.
* Tombol **SAVE** menjalankan perintah `INSERT` SQL untuk menyimpan data ke database.

### `UpdateDialog.java`
Kelas ini digunakan untuk mengubah data yang sudah ada.
* Ketika dialog terbuka, data dari baris yang dipilih di tabel utama akan dimuat otomatis ke dalam kolom.
* Kolom ID tidak dapat diubah karena berfungsi sebagai identifikasi unik.
* Tombol **UPDATE** menjalankan perintah `UPDATE` SQL untuk memperbarui data.

### `DeleteDialog.java`
Kelas ini adalah dialog konfirmasi untuk menghapus data.
* Dialog ini menampilkan data yang akan dihapus di kolom yang tidak dapat diedit.
* Tombol **DELETE** menjalankan perintah `DELETE` SQL setelah pengguna memberikan konfirmasi.

---

## 4. Kesimpulan
Aplikasi ini berhasil mengimplementasikan sistem manajemen data komik yang fungsional. Penggunaan Java Swing menyediakan antarmuka yang jelas, sementara JDBC memungkinkan interaksi data yang efisien dengan database PostgreSQL. Setiap operasi (tambah, ubah, hapus) diimplementasikan dalam dialog terpisah, membuat alur kerja pengguna lebih terorganisir dan aman.
