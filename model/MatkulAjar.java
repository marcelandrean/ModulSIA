package model;

import java.util.ArrayList;

public class MatkulAjar {
    private MataKuliah mataKuliah;
    private ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<>();

    public MatkulAjar() {
    }

    public MatkulAjar(MataKuliah mataKuliah, ArrayList<PresensiStaff> listPresensiStaff) {
        this.mataKuliah = mataKuliah;
        this.listPresensiStaff = listPresensiStaff;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String toString() {
        return "\nMata Kuliah: " + mataKuliah
                + "\nList Presensi Staff: " + listPresensiStaff + "\n";
    }
}