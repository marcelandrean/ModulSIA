package controller;

import java.util.ArrayList;

import model.Doktor;
import model.Magister;
import model.Mahasiswa;
import model.MataKuliah;
import model.MatkulAmbil;
import model.Sarjana;

public class MahasiswaController {
    private ArrayList<Mahasiswa> listMahasiswa;

    public MahasiswaController() {
    }

    public MahasiswaController(ArrayList<Mahasiswa> listMahasiswa) {
        this.listMahasiswa = listMahasiswa;
    }

    public String getFinalScore(String NIM, String kodeMK) {
        String namaMK = "";
        for (Mahasiswa mhs : listMahasiswa) {
            if (mhs.getNIM().equals(NIM)) {
                double NA = 0;
                if (mhs instanceof Sarjana) {
                    Sarjana mhsSarjana = (Sarjana) mhs;
                    for (MatkulAmbil matkulAmbil : mhsSarjana.getListMatkulAmbil()) {
                        if (matkulAmbil.getMataKuliah().getKode().equals(kodeMK)) {
                            NA = (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3()) / 3;
                            namaMK = matkulAmbil.getMataKuliah().getNama();
                            return "Nama mahasiswa: " + mhs.getNama()
                                    + "\nNilai Akhir (NA) matkul " + namaMK + ": " + String.format("%.2f", NA);
                        }
                    }
                } else if (mhs instanceof Magister) {
                    Magister mhsMagister = (Magister) mhs;
                    for (MatkulAmbil matkulAmbil : mhsMagister.getListMatkulAmbil()) {
                        if (matkulAmbil.getMataKuliah().getKode().equals(kodeMK)) {
                            NA = (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3()) / 3;
                            namaMK = matkulAmbil.getMataKuliah().getNama();
                            return "Nama mahasiswa: " + mhs.getNama()
                                    + "\nNilai Akhir (NA) matkul " + namaMK + ": " + String.format("%.2f", NA);
                        }
                    }
                } else if (mhs instanceof Doktor) {
                    Doktor mhsDoktor = (Doktor) mhs;
                    NA = (mhsDoktor.getSidang1() + mhsDoktor.getSidang2() + mhsDoktor.getSidang3()) / 3;
                    return "Nama mahasiswa: " + mhs.getNama() + "\nNilai Akhir (NA): " + String.format("%.2f", NA);

                }
                return "Mata kuliah dengan Kode " + kodeMK + " tidak ditemukan.";
            }
        }
        return "Mahasiswa dengan NIM " + NIM + " tidak ditemukan.";
    }

    public String getAvgFinalScore(String kodeMK) {
        double NA = 0;
        int counter = 0;

        for (Mahasiswa mhs : listMahasiswa) {
            if (mhs instanceof Sarjana) {
                Sarjana mhsSarjana = (Sarjana) mhs;
                for (MatkulAmbil matkulAmbil : mhsSarjana.getListMatkulAmbil()) {
                    if (matkulAmbil.getMataKuliah().getKode().equals(kodeMK)) {
                        NA += (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3()) / 3;
                        counter++;
                    }
                }
            } else if (mhs instanceof Magister) {
                Magister mhsMagister = (Magister) mhs;
                for (MatkulAmbil matkulAmbil : mhsMagister.getListMatkulAmbil()) {
                    if (matkulAmbil.getMataKuliah().getKode().equals(kodeMK)) {
                        NA += (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3()) / 3;
                        counter++;
                    }
                }
            }
        }
        double NR = NA / counter;

        return String.format("%.2f", NR);
    }

    public int countStudentsByKodeMK(String kodeMK) {
        int counter = 0;
        for (Mahasiswa mhs : listMahasiswa) {
            if (mhs instanceof Sarjana) {
                Sarjana mhsSarjana = (Sarjana) mhs;
                for (MatkulAmbil matkulAmbil : mhsSarjana.getListMatkulAmbil()) {
                    if (matkulAmbil.getMataKuliah().getKode().equals(kodeMK)) {
                        counter++;
                    }
                }
            } else if (mhs instanceof Magister) {
                Magister mhsMagister = (Magister) mhs;
                for (MatkulAmbil matkulAmbil : mhsMagister.getListMatkulAmbil()) {
                    if (matkulAmbil.getMataKuliah().getKode().equals(kodeMK)) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    public int countFailedStudents(String kodeMK) {
        int counter = 0;
        for (Mahasiswa mhs : listMahasiswa) {
            if (mhs instanceof Sarjana) {
                Sarjana mhsSarjana = (Sarjana) mhs;
                for (MatkulAmbil matkulAmbil : mhsSarjana.getListMatkulAmbil()) {
                    if (matkulAmbil.getMataKuliah().getKode().equals(kodeMK)) {
                        double NA = (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3()) / 3;
                        if (NA < 56) {
                            counter++;
                        }
                    }
                }
            } else if (mhs instanceof Magister) {
                Magister mhsMagister = (Magister) mhs;
                for (MatkulAmbil matkulAmbil : mhsMagister.getListMatkulAmbil()) {
                    if (matkulAmbil.getMataKuliah().getKode().equals(kodeMK)) {
                        double NA = (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3()) / 3;
                        if (NA < 56) {
                            counter++;
                        }
                    }
                }
            }
        }
        return counter;
    }

    public String getMatkulName(String kodeMK) {
        for (Mahasiswa mhs : listMahasiswa) {
            if (mhs instanceof Sarjana) {
                Sarjana mhsSarjana = (Sarjana) mhs;
                for (MatkulAmbil matkulAmbil : mhsSarjana.getListMatkulAmbil()) {
                    if (matkulAmbil.getMataKuliah().getKode().equals(kodeMK)) {
                        return matkulAmbil.getMataKuliah().getNama();
                    }
                }
            } else if (mhs instanceof Magister) {
                Magister mhsMagister = (Magister) mhs;
                for (MatkulAmbil matkulAmbil : mhsMagister.getListMatkulAmbil()) {
                    if (matkulAmbil.getMataKuliah().getKode().equals(kodeMK)) {
                        return matkulAmbil.getMataKuliah().getNama();
                    }
                }
            }
        }
        return "null";
    }

    public String getMatkulAmbilByNIM(String NIM) {
        Mahasiswa selectedMhs = null;
        for (Mahasiswa mhs : listMahasiswa) {
            if (mhs.getNIM().equals(NIM)) {
                selectedMhs = mhs;
                break;
            }
        }

        if (selectedMhs == null) {
            return "Mahasiswa dengan NIM " + NIM + " tidak ditemukan.";
        }

        String str = "Matkul Ambil untuk mahasiswa dengan NIM " + NIM + ":\n";
        if (selectedMhs instanceof Sarjana) {
            Sarjana mhsSarjana = (Sarjana) selectedMhs;
            for (MatkulAmbil matkulAmbil : mhsSarjana.getListMatkulAmbil()) {
                MataKuliah mataKuliah = matkulAmbil.getMataKuliah();
                int totalPresensi = matkulAmbil.getListPresensi().size();
                str += "\n" + mataKuliah.toString() + "\nTotal Presensi: " + totalPresensi + "\n";
            }
        } else if (selectedMhs instanceof Magister) {
            Magister mhsMagister = (Magister) selectedMhs;
            for (MatkulAmbil matkulAmbil : mhsMagister.getListMatkulAmbil()) {
                MataKuliah mataKuliah = matkulAmbil.getMataKuliah();
                int totalPresensi = matkulAmbil.getListPresensi().size();
                str += "\n" + mataKuliah.toString() + "\nTotal Presensi: " + totalPresensi + "\n";
            }
        }
        return str;
    }
}