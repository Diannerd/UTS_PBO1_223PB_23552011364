# UTS Pemrograman Berorientasi Obyek 1
<ul>
  <li>Mata Kuliah: Pemrograman Berorientasi Obyek 1</li>
  <li>Dosen Pengampu: <a href="https://github.com/Muhammad-Ikhwan-Fathulloh">Muhammad Ikhwan Fathulloh</a></li>
</ul>

## Profil
<ul>
  <li>Nama: Dianne Ramadhani</li>
  <li>NIM: 23552011364</li>
  <li>Studi Kasus: Manajemen Keuangan</li>
</ul>

## Judul Studi Kasus
<p>MANAJEMEN KEUANGAN</p>

## Penjelasan Studi Kasus
<p>Studi Kasus: Manajemen Keuangan Digital pada Koperasi atau Bank
Program di atas menggambarkan manajemen keuangan digital dalam konteks layanan rekening pada sebuah koperasi atau bank. Studi kasus ini berkaitan dengan penyediaan layanan perbankan yang memungkinkan pengguna untuk mengelola rekening mereka secara digital, termasuk melakukan setoran, penarikan, dan cetak saldo, serta menghitung bunga yang diperoleh dari saldo rekening.

Deskripsi Masalah:
Seiring berkembangnya teknologi digital, banyak koperasi dan bank beralih ke sistem yang berbasis perangkat lunak untuk meningkatkan pelayanan kepada nasabah. Salah satu fitur yang dapat diterapkan dalam sistem manajemen keuangan digital adalah pengelolaan rekening tabungan dan rekening giro secara efisien.

Dalam kasus ini, pengguna dapat memiliki dua jenis rekening: Rekening Tabungan dan Rekening Giro, dengan masing-masing memiliki aturan yang berbeda dalam hal bunga dan transaksi. Sistem ini juga menyediakan fitur untuk merekam transaksi yang dilakukan, seperti setoran dan penarikan, yang sangat penting untuk transparansi dan rekonsiliasi finansial.

Solusi yang Diberikan oleh Program:
Program ini dirancang untuk memodelkan layanan keuangan digital dengan menerapkan konsep Object-Oriented Programming (OOP), yang memungkinkan pengguna untuk berinteraksi dengan rekening dan melakukan transaksi yang sesuai dengan jenis rekening mereka.

Berikut adalah rincian dari solusi yang diberikan program ini:

Layanan Keuangan (Interface LayananKeuangan):

Mencakup metode dasar yang harus diimplementasikan oleh semua jenis rekening, yaitu setor, tarik, dan cetakSaldo.
Hal ini memastikan bahwa semua rekening, baik tabungan maupun giro, memiliki fungsi dasar yang sama, meskipun ada perbedaan dalam cara penerapan dan tambahan fungsionalitas lainnya.
Rekening (Kelas Abstrak Rekening):

Sebagai kelas induk, Rekening memiliki atribut umum seperti nomorRekening, pemilik, dan saldo, yang diperlukan oleh semua jenis rekening.
Metode seperti setor, tarik, dan cetakSaldo diimplementasikan di kelas ini, sehingga tidak perlu ditulis ulang di setiap kelas turunan.
Metode abstrak hitungBunga() disediakan, yang harus diimplementasikan oleh kelas turunan untuk menghitung bunga berdasarkan jenis rekening.
Rekening Tabungan dan Rekening Giro (Kelas Turunan):

RekeningTabungan memiliki bunga harian yang dihitung setiap kali metode hitungBunga() dipanggil.
RekeningGiro memiliki bunga bulanan yang dihitung dengan cara yang sama, tetapi dengan tingkat bunga yang berbeda.
Polimorfisme diterapkan di sini, karena meskipun kedua kelas tersebut memiliki metode hitungBunga(), cara perhitungannya berbeda berdasarkan jenis rekening.
Transaksi:

Program juga mengelola informasi transaksi melalui kelas Transaksi, yang mencatat tanggal, nominal, dan jenis transaksi (setoran atau penarikan).
Setiap transaksi dicetak untuk memberikan laporan kepada pengguna mengenai aktivitas rekening mereka.
Manajemen Keuangan:

Pada akhirnya, ManajemenKeuangan adalah kelas utama yang mengatur interaksi antara objek-objek tersebut.
Di sini, rekening dibuat dan transaksi dilakukan untuk menunjukkan cara kerja program: setoran dilakukan ke rekening tabungan, penarikan dilakukan pada rekening giro, dan bunga dihitung berdasarkan jenis rekening.
Pengguna dapat melihat saldo setelah transaksi, serta mencetak transaksi yang dilakukan, memberikan gambaran lengkap tentang aktivitas keuangan mereka.
Contoh Aplikasi dalam Kehidupan Nyata:
Misalnya, sebuah koperasi digital yang melayani nasabah dengan dua jenis rekening: Rekening Tabungan dan Rekening Giro.

Rekening Tabungan: Nasabah yang membuka rekening tabungan akan mendapatkan bunga harian berdasarkan saldo mereka. Setiap hari, bunga dihitung dan ditambahkan ke saldo akun nasabah. Program ini memungkinkan koperasi untuk secara otomatis menghitung bunga harian dan memperbarui saldo nasabah.

Rekening Giro: Nasabah yang membuka rekening giro memiliki bunga bulanan, yang dihitung berdasarkan saldo mereka. Meskipun bunga lebih rendah dibandingkan dengan rekening tabungan, nasabah tetap mendapatkan bunga bulanan yang otomatis ditambahkan ke saldo mereka setiap bulan.

Transaksi: Setiap kali nasabah melakukan setoran atau penarikan, transaksi tersebut dicatat dalam sistem untuk memastikan transparansi dan akurasi. Misalnya, nasabah melakukan setoran ke rekening tabungan, atau menarik uang dari rekening giro, sistem akan mengupdate saldo dan mencatat transaksi tersebut, yang dapat dilihat oleh nasabah kapan saja.

Manfaat Sistem Ini:
Efisiensi Operasional: Dengan menggunakan sistem otomatis yang berbasis perangkat lunak, koperasi atau bank dapat melayani lebih banyak nasabah dengan lebih efisien. Semua transaksi dan perhitungan bunga dilakukan secara otomatis.
Transparansi: Nasabah dapat melihat transaksi dan perhitungan bunga dengan jelas dan tepat, yang meningkatkan rasa percaya terhadap layanan yang diberikan.
Kemudahan Pengelolaan Rekening: Nasabah dapat dengan mudah mengelola rekening mereka, baik rekening tabungan maupun giro, hanya dengan menggunakan aplikasi atau perangkat lunak ini.
Fleksibilitas: Program ini dapat diperluas dengan menambahkan jenis rekening lain, jenis bunga lainnya, atau fitur tambahan tanpa mengubah struktur kode yang sudah ada.</p>

## Penjelasan 4 Pilar OOP dalam Studi Kasus

### 1. Inheritance
<p>Rekening sebagai kelas induk: Kelas Rekening adalah kelas abstrak yang digunakan sebagai dasar untuk kelas-kelas turunan seperti RekeningTabungan dan RekeningGiro. Dengan inheritance, kedua kelas turunan tersebut mewarisi atribut (nomorRekening, pemilik, dan saldo) serta metode (setor, tarik, dan cetakSaldo) dari kelas Rekening.</p>

### 2. Encapsulation
<p>Atribut seperti nomorRekening, pemilik, dan saldo pada kelas Rekening dibuat private atau protected, sehingga hanya dapat diakses melalui metode getter dan setter atau dalam kelas turunan.
Kelas Transaksi juga menggunakan enkapsulasi, di mana atribut tanggal, nominal, dan jenisTransaksi hanya dapat diakses melalui konstruktor atau metode khusus seperti cetakTransaksi.</p>

### 3. Polymorphism
<p>Polimorfisme diterapkan melalui penggunaan metode </hitungBunga> yang dideklarasikan di kelas abstrak Rekening. Setiap kelas turunan (RekeningTabungan dan RekeningGiro) mengimplementasikan versi spesifik dari metode ini.
Polimorfisme memungkinkan untuk memanggil metode hitungBunga pada objek RekeningTabungan dan RekeningGiro menggunakan referensi Rekening, tetapi hasilnya berbeda sesuai dengan implementasi masing-masing kelas turunan.</p>

### 4. Abstract
<p>Antarmuka LayananKeuangan: LayananKeuangan mendefinisikan kontrak berupa metode setor, tarik, dan cetakSaldo yang harus diimplementasikan oleh semua kelas yang menggunakannya (dalam hal ini, Rekening).
Kelas abstrak Rekening: Kelas ini menggunakan abstraksi dengan mendeklarasikan metode hitungBunga sebagai metode abstrak. Ini memaksa kelas turunan untuk memberikan implementasi spesifik.</p>

## Demo Proyek
<ul>
  <li>Github: <a href="">Github</a></li>
  <li>Youtube: <a href="https://youtu.be/z7xEc9xec3Y">Youtube</a></li>
</ul>
