import java.time.LocalDate;
import java.util.ArrayList;

import controller.*;
import model.*;
import view.MainMenuScreen;

public class Main {
    private ArrayList<User> listUser;
    private ArrayList<Mahasiswa> listMahasiswa;
    private ArrayList<MataKuliah> listMatkul;
    private ArrayList<Staff> listStaff;

    public Main() {
        this.listUser = new ArrayList<>();
        this.listMahasiswa = new ArrayList<>();
        this.listMatkul = new ArrayList<>();
        this.listStaff = new ArrayList<>();
    }

    public void getDummy() {
        // Data dummy mata kuliah
        MataKuliah matkul1 = new MataKuliah("MK-001", 4, "Algoritma");
        MataKuliah matkul2 = new MataKuliah("MK-002", 2, "Struktur Data");
        MataKuliah matkul3 = new MatkulPilihan("MP-001", 3, "Biologi", 10);
        MataKuliah matkul4 = new MatkulPilihan("MP-002", 3, "Matematika", 6);

        // Data dummy list mata kuliah
        listMatkul.add(matkul1);
        listMatkul.add(matkul2);
        listMatkul.add(matkul3);
        listMatkul.add(matkul4);

        System.out.println("==== DATA DUMMY MATA KULIAH =====");
        for (MataKuliah m : listMatkul) {
            System.out.println(m.toString() + "\n-----------------------------------");
        }

        // Data dummy presensi
        ArrayList<Presensi> listPresensi = new ArrayList<>();
        listPresensi.add(new Presensi(LocalDate.of(2022, 9, 22), 1));
        listPresensi.add(new Presensi(LocalDate.of(2022, 9, 29), 0));

        // Data dummy matkul yang diambil 1
        ArrayList<MatkulAmbil> listMatkulAmbil1 = new ArrayList<>();
        listMatkulAmbil1.add(new MatkulAmbil(matkul1, listPresensi, 98, 95, 100));
        listMatkulAmbil1.add(new MatkulAmbil(matkul2, listPresensi, 85, 84, 91));
        listMatkulAmbil1.add(new MatkulAmbil(matkul4, listPresensi, 86, 92, 97));

        // Data dummy mahasiswa sarjana
        Sarjana mhsSarjana = new Sarjana(
                "Marcel",
                "Rahayu",
                "Bandung, 13 Des 2003",
                "081398",
                "1122017",
                "Informatika",
                listMatkulAmbil1);

        System.out.println("\n==== DATA DUMMY MAHASISWA SARJANA =====");
        System.out.println(mhsSarjana.toString());

        // Data dummy matkul yang diambil 2
        ArrayList<MatkulAmbil> listMatkulAmbil2 = new ArrayList<>();
        listMatkulAmbil2.add(new MatkulAmbil(matkul2, listPresensi, 94, 99, 81));
        listMatkulAmbil2.add(new MatkulAmbil(matkul3, listPresensi, 93, 80, 89));

        // Data dummy mahasiswa magister
        Magister mhsMagister = new Magister(
                "Karina",
                "Dipatiukur",
                "Bandung, 11 Apr 2000",
                "082117",
                "1118004",
                "Informatika",
                listMatkulAmbil2,
                "Pemanfaatan AI");

        System.out.println("\n==== DATA DUMMY MAHASISWA MAGISTER =====");
        System.out.println(mhsMagister.toString());

        // Data dummy mahasiswa doktor
        Doktor mhsDoktor = new Doktor(
                "Bruno",
                "Kopo",
                "Bandung, 22 Sept 1995",
                "081997",
                "2214029",
                "Kedokteran",
                "Solusi Kanker",
                98, 99, 100);

        System.out.println("\n==== DATA DUMMY MAHASISWA DOKTOR =====");
        System.out.println(mhsDoktor.toString());

        // Data dummy presensi staff
        ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<>();
        listPresensiStaff.add(new PresensiStaff(LocalDate.of(2022, 3, 24), 1, 7));
        listPresensiStaff.add(new PresensiStaff(LocalDate.of(2022, 3, 31), 1, 8));

        // Data dummy karyawan
        Karyawan karyawan = new Karyawan(
                "Albert",
                "Padjajaran",
                "Jakarta, 29 Des 1996",
                "081358",
                "123456",
                4000000,
                listPresensiStaff);

        System.out.println("\n==== DATA DUMMY KARYAWAN =====");
        System.out.println(karyawan.toString());

        // Data dummy matkul ajar 1
        ArrayList<MatkulAjar> listMatkulAjar1 = new ArrayList<>();
        listMatkulAjar1.add(new MatkulAjar(matkul1, listPresensiStaff));
        listMatkulAjar1.add(new MatkulAjar(matkul2, listPresensiStaff));

        // Data dummy dosen tetap
        DosenTetap dsnTetap = new DosenTetap(
                "Steven",
                "Dago",
                "Bandung, 29 Mar 1991",
                "0821860",
                "987654",
                "Informatika",
                listMatkulAjar1,
                8000000);

        System.out.println("\n==== DATA DUMMY DOSEN TETAP =====");
        System.out.println(dsnTetap.toString());

        // Data dummy matkul ajar 2
        ArrayList<MatkulAjar> listMatkulAjar2 = new ArrayList<>();
        listMatkulAjar2.add(new MatkulAjar(matkul3, listPresensiStaff));
        listMatkulAjar2.add(new MatkulAjar(matkul4, listPresensiStaff));

        // Data dummy dosen honorer
        DosenHonorer dsnHonorer = new DosenHonorer(
                "Bambang",
                "Cihampelas",
                "Bandung, 24 Mar 1997",
                "081234",
                "456128",
                "Informatika",
                listMatkulAjar2,
                500000);

        System.out.println("\n==== DATA DUMMY DOSEN HONORER =====");
        System.out.println(dsnHonorer.toString());

        // Data dummy user
        listUser.add(mhsSarjana);
        listUser.add(mhsMagister);
        listUser.add(mhsDoktor);
        listUser.add(karyawan);
        listUser.add(dsnTetap);
        listUser.add(dsnHonorer);

        // Data dummy mahasiswa
        for (User user : listUser) {
            if (user instanceof Mahasiswa) {
                Mahasiswa mhs = (Mahasiswa) user;
                listMahasiswa.add(mhs);
            }
        }

        // Data dummy staff
        listStaff.add(dsnTetap);
        listStaff.add(dsnHonorer);
        listStaff.add(karyawan);
    }

    public ArrayList<User> getListUser() {
        return listUser;
    }

    public void setListUser(ArrayList<User> listUser) {
        this.listUser = listUser;
    }

    public ArrayList<Mahasiswa> getListMahasiswa() {
        return listMahasiswa;
    }

    public void setListMahasiswa(ArrayList<Mahasiswa> listMahasiswa) {
        this.listMahasiswa = listMahasiswa;
    }

    public ArrayList<MataKuliah> getListMatkul() {
        return listMatkul;
    }

    public void setListMatkul(ArrayList<MataKuliah> listMatkul) {
        this.listMatkul = listMatkul;
    }

    public ArrayList<Staff> getListStaff() {
        return listStaff;
    }

    public void setListStaff(ArrayList<Staff> listStaff) {
        this.listStaff = listStaff;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.getDummy();

        UserController userController = new UserController(main.getListUser());
        MahasiswaController mhsController = new MahasiswaController(main.getListMahasiswa());
        StaffController staffController = new StaffController(main.getListStaff());

        MainMenuScreen mainMenu = new MainMenuScreen(userController, mhsController, staffController);

        mainMenu.displayMainMenu();
    }

}