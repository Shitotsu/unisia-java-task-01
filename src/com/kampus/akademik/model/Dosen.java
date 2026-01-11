package com.kampus.akademik.model;

public class Dosen {

    private String nidn;
    private String nama;
    private String matakuliah;

    // Constructor
    public Dosen(String nidn, String nama, String matakuliah) {
        this.nidn = nidn;
        this.nama = nama;
        this.matakuliah = matakuliah;
    }

    // Method untuk menampilkan data dosen
    public void tampilkanData() {
        System.out.println("NIDN       : " + nidn);
        System.out.println("Nama       : " + nama);
        System.out.println("Mata Kuliah: " + matakuliah);
    }
}

