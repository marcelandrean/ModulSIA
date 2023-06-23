package model;

import java.util.ArrayList;

public class DosenTetap extends Dosen {
    int salary;

    public DosenTetap() {
    }

    public DosenTetap(String nama, String alamat, String TTL, String telepon, String NIK, String departemen,
            ArrayList<MatkulAjar> listMatkulAjar, int salary) {
        super(nama, alamat, TTL, telepon, NIK, departemen, listMatkulAjar);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary: " + salary;
    }
}