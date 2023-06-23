package model;

import java.util.ArrayList;

public class Karyawan extends Staff {
    private int salary;
    private ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<>();

    public Karyawan() {
    }

    public Karyawan(String nama, String alamat, String TTL, String telepon, String NIK, int salary,
            ArrayList<PresensiStaff> listPresensiStaff) {
        super(nama, alamat, TTL, telepon, NIK);
        this.salary = salary;
        this.listPresensiStaff = listPresensiStaff;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary: " + salary + "\nList Presensi Staff: " + listPresensiStaff;
    }
}