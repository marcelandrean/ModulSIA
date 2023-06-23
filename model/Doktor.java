package model;

public class Doktor extends Mahasiswa {
    private String judulDisertasi;
    private double sidang1, sidang2, sidang3;

    public Doktor() {
    }

    public Doktor(String nama, String alamat, String TTL, String telepon, String NIM, String jurusan,
            String judulDisertasi, double sidang1, double sidang2, double sidang3) {
        super(nama, alamat, TTL, telepon, NIM, jurusan);
        this.judulDisertasi = judulDisertasi;
        this.sidang1 = sidang1;
        this.sidang2 = sidang2;
        this.sidang3 = sidang3;
    }

    public String getJudulPenelitianDisertasi() {
        return judulDisertasi;
    }

    public void setJudulPenelitianDisertasi(String judulDisertasi) {
        this.judulDisertasi = judulDisertasi;
    }

    public double getSidang1() {
        return sidang1;
    }

    public void setSidang1(double sidang1) {
        this.sidang1 = sidang1;
    }

    public double getSidang2() {
        return sidang2;
    }

    public void setSidang2(double sidang2) {
        this.sidang2 = sidang2;
    }

    public double getSidang3() {
        return sidang3;
    }

    public void setSidang3(double sidang3) {
        this.sidang3 = sidang3;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nJudul Penelitian Disertasi: " + judulDisertasi
                + "\nSidang 1: " + sidang1
                + "\nSidang 2: " + sidang2
                + "\nSidang 3: " + sidang3;
    }
}