package com.kampus.akademik.main;

import com.kampus.akademik.model.Mahasiswa;
import com.kampus.akademik.model.Dosen;
import com.kampus.akademik.service.AkademikService;

public class MainApp {

    public static void main(String[] args) {

        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa(
                "2023001",
                "Andi Pratama",
                "Teknik Informatika"
        );

        // Membuat objek Dosen
        Dosen dosen1 = new Dosen(
                "123456",
                "Dr. Budi Santoso",
                "Pemrograman Java"
        );

        // Menggunakan AkademikService
        AkademikService service = new AkademikService();

        // Menampilkan data
        service.tampilMahasiswa(mahasiswa1);
        service.tampilDosen(dosen1);
    }
}

