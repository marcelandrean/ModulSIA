package model;

import java.time.LocalDate;

public class Presensi implements StatusInterface {
    private LocalDate tanggal;
    private int status;

    public Presensi() {
    }

    public Presensi(LocalDate tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String isHadir() {
        return this.status == StatusInterface.HADIR ? "Hadir" : "Alpha";
    }

    @Override
    public String toString() {
        return "\nTanggal: " + tanggal + ", Status: " + isHadir();
    }
}