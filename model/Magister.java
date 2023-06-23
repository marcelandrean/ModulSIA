package model;

import java.util.ArrayList;

public class Magister extends Mahasiswa {
    private ArrayList<MatkulAmbil> listMatkulAmbil = new ArrayList<>();
    private String judulTesis;

    public Magister() {
    }

    public Magister(String nama, String alamat, String TTL, String telepon, String NIM, String jurusan,
            ArrayList<MatkulAmbil> listMatkulAmbil, String judulTesis) {
        super(nama, alamat, TTL, telepon, NIM, jurusan);
        this.listMatkulAmbil = listMatkulAmbil;
        this.judulTesis = judulTesis;
    }

    public ArrayList<MatkulAmbil> getListMatkulAmbil() {
        return listMatkulAmbil;
    }

    public void setListMatkulAmbil(ArrayList<MatkulAmbil> listMatkulAmbil) {
        this.listMatkulAmbil = listMatkulAmbil;
    }

    public String getJudulPenelitianTesis() {
        return judulTesis;
    }

    public void setJudulPenelitianTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nList mata kuliah yang diambil: " + listMatkulAmbil
                + "\nJudul Penelitian Tesis: " + judulTesis;
    }
}