package controller;

import java.util.ArrayList;

import model.Dosen;
import model.DosenHonorer;
import model.DosenTetap;
import model.Karyawan;
import model.MatkulAjar;
import model.PresensiStaff;
import model.Staff;

public class StaffController {
    private ArrayList<Staff> listStaff;

    public StaffController() {
    }

    public StaffController(ArrayList<Staff> listStaff) {
        this.listStaff = listStaff;
    }

    public String getTotalTeachingHoursByNIK(String NIK) {
        int totalHours = 0;
        Dosen selectedDosen = null;

        for (Staff staff : listStaff) {
            if (staff instanceof Dosen) {
                Dosen dosen = (Dosen) staff;
                if (dosen.getNIK().equals(NIK)) {
                    selectedDosen = dosen;
                }
            }
        }

        if (selectedDosen != null) {
            for (MatkulAjar matkulAjar : selectedDosen.getListMatkulAjar()) {
                for (PresensiStaff presensi : matkulAjar.getListPresensiStaff()) {
                    if (presensi.getStatus() == 1) {
                        totalHours += matkulAjar.getMataKuliah().getSKS();
                    }
                }
            }
            return "Total jam mengajar dosen dengan NIK " + NIK + ": " + totalHours + " jam.";
        } else {
            return "Dosen dengan NIK " + NIK + " tidak ditemukan.";
        }
    }

    public String calculateSalary(String NIK) {
        int unit = 0;
        int salary = -1;

        for (Staff staff : listStaff) {
            if (staff.getNIK().equals(NIK)) {
                if (staff instanceof Karyawan) {
                    Karyawan karyawan = (Karyawan) staff;
                    for (PresensiStaff presensi : karyawan.getListPresensiStaff()) {
                        if (presensi.getStatus() == 1) {
                            unit++;
                        }
                    }
                    salary = unit * karyawan.getSalary() / 22;
                } else if (staff instanceof DosenTetap) {
                    DosenTetap dsnTetap = (DosenTetap) staff;
                    for (MatkulAjar matkulAjar : dsnTetap.getListMatkulAjar()) {
                        for (PresensiStaff presensi : matkulAjar.getListPresensiStaff()) {
                            if (presensi.getStatus() == 1) {
                                unit++;
                            }
                        }
                    }
                    salary = dsnTetap.getSalary() + (unit * 25000);
                } else if (staff instanceof DosenHonorer) {
                    DosenHonorer dsnHonorer = (DosenHonorer) staff;
                    for (MatkulAjar matkulAjar : dsnHonorer.getListMatkulAjar()) {
                        for (PresensiStaff presensi : matkulAjar.getListPresensiStaff()) {
                            if (presensi.getStatus() == 1) {
                                unit++;
                            }
                        }
                    }
                    salary = (unit * dsnHonorer.getHonorPerSKS());
                }
            }
        }
        if (salary != -1) {
            return "Gaji staff dengan NIK " + NIK + ": " + salary;
        } else {
            return "Staff dengan NIK " + NIK + " tidak ditemukan.";
        }
    }
}