package model;

public class MatkulPilihan extends MataKuliah {
    private int jumlahMinMahasiswa;

    public MatkulPilihan() {
    }

    public MatkulPilihan(String kode, int SKS, String nama, int jumlahMinMahasiswa) {
        super(kode, SKS, nama);
        this.jumlahMinMahasiswa = jumlahMinMahasiswa;
    }

    public int getJumlahMinMahasiswa() {
        return jumlahMinMahasiswa;
    }

    public void setJumlahMinMahasiswa(int jumlahMinMahasiswa) {
        this.jumlahMinMahasiswa = jumlahMinMahasiswa;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJumlah Minimum Mahasiswa: " + jumlahMinMahasiswa;
    }
}