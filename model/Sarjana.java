package model;

import java.util.ArrayList;

public class Sarjana extends Mahasiswa {
    private ArrayList<MatkulAmbil> listMatkulAmbil = new ArrayList<>();

    public Sarjana() {
    }

    public Sarjana(String nama, String alamat, String TTL, String telepon, String NIM, String jurusan,
            ArrayList<MatkulAmbil> listMatkulAmbil) {
        super(nama, alamat, TTL, telepon, NIM, jurusan);
        this.listMatkulAmbil = listMatkulAmbil;
    }

    public ArrayList<MatkulAmbil> getListMatkulAmbil() {
        return listMatkulAmbil;
    }

    public void setListMatkulAmbil(ArrayList<MatkulAmbil> listMatkulAmbil) {
        this.listMatkulAmbil = listMatkulAmbil;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\nList mata kuliah yang diambil: " + listMatkulAmbil;
    }
}