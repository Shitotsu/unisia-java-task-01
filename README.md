# Aplikasi Akademik Sederhana (Java)

## Deskripsi
Aplikasi ini merupakan program Java sederhana untuk mengelola dan menampilkan data Mahasiswa dan Dosen. Aplikasi dibuat dengan menerapkan konsep Object-Oriented Programming (OOP) serta penggunaan struktur package yang terorganisasi.

## Penjelasan Package
- model  
  Berisi class Mahasiswa dan Dosen sebagai representasi data.
- service  
  Berisi class AkademikService untuk memproses dan menampilkan data.
- main  
  Berisi class MainApp sebagai entry point aplikasi.

## Fitur Aplikasi
- Menyimpan dan menampilkan data Mahasiswa
- Menyimpan dan menampilkan data Dosen
- Menggunakan struktur package yang rapi
- Menerapkan konsep dasar OOP Java

## Cara Compile dan Menjalankan Program

1. Masuk ke direktori src
   cd project-akademik/src

2. Compile seluruh file Java
   javac com/kampus/akademik/model/*.java \
         com/kampus/akademik/service/*.java \
         com/kampus/akademik/main/*.java

3. Jalankan aplikasi
   java com.kampus.akademik.main.MainApp

## Contoh Output
=== Data Mahasiswa ===
NIM     : 2023001
Nama    : Andi Pratama
Jurusan : Teknik Informatika

=== Data Dosen ===
NIDN       : 123456
Nama       : Dr. Budi Santoso
Mata Kuliah: Pemrograman Java
