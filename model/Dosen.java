package model;

import java.util.ArrayList;

public class Dosen extends Staff {
    private String departemen;
    private ArrayList<MatkulAjar> listMatkulAjar = new ArrayList<>();

    public Dosen() {
    }

    public Dosen(String nama, String alamat, String TTL, String telepon, String NIK, String departemen,
            ArrayList<MatkulAjar> listMatkulAjar) {
        super(nama, alamat, TTL, telepon, NIK);
        this.departemen = departemen;
        this.listMatkulAjar = listMatkulAjar;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatkulAjar> getListMatkulAjar() {
        return listMatkulAjar;
    }

    public void setListMatkulAjar(ArrayList<MatkulAjar> listMatkulAjar) {
        this.listMatkulAjar = listMatkulAjar;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartemen: " + departemen + "\nList Matkul Ajar: " + listMatkulAjar;
    }
}