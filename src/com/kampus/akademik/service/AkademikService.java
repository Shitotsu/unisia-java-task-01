package com.kampus.akademik.service;

import com.kampus.akademik.model.Mahasiswa;
import com.kampus.akademik.model.Dosen;

public class AkademikService {

    public void tampilMahasiswa(Mahasiswa m) {
        System.out.println("=== Data Mahasiswa ===");
        m.tampilkanData();
        System.out.println();
    }

    public void tampilDosen(Dosen d) {
        System.out.println("=== Data Dosen ===");
        d.tampilkanData();
        System.out.println();
    }
}

