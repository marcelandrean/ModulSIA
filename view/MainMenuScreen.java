package view;

import controller.*;

public class MainMenuScreen {
    private UserController userController;
    private MahasiswaController mhsController;
    private StaffController staffController;
    private UserDataScreen userDataScreen;
    private MahasiswaDataScreen mhsDataScreen;
    private StaffDataScreen staffDataScreen;

    public MainMenuScreen(UserController userController, MahasiswaController mhsController,
            StaffController staffController) {
        this.userController = userController;
        this.mhsController = mhsController;
        this.staffController = staffController;
        this.userDataScreen = new UserDataScreen(this.userController);
        this.mhsDataScreen = new MahasiswaDataScreen(this.mhsController);
        this.staffDataScreen = new StaffDataScreen(this.staffController);
    }

    public void displayMainMenu() {
        String menuOptions = "Main Menu\n"
                + "1. Print User Data\n"
                + "2. Print Nilai Akhir (NA) Mahasiswa\n"
                + "3. Print Rata-Rata Nilai Akhir (NR) Mahasiswa\n"
                + "4. Print Jumlah Mahasiswa Tidak Lulus\n"
                + "5. Print Matkul Ambil Mahasiswa\n"
                + "6. Print Total Jam Mengajar Dosen\n"
                + "7. Print Gaji Staff\n"
                + "0. Exit\n\n"
                + "Enter menu number:";

        boolean running = true;
        while (running) {
            String choice = DialogView.showInputDialog(menuOptions);
            switch (choice) {
                case "1":
                    userDataScreen.displayUserData();
                    break;
                case "2":
                    mhsDataScreen.displayFinalScore();
                    break;
                case "3":
                    mhsDataScreen.displayAvgFinalScore();
                    break;
                case "4":
                    mhsDataScreen.displayFailedStudents();
                    break;
                case "5":
                    mhsDataScreen.displayMatkulAmbilByNIM();
                    break;
                case "6":
                    staffDataScreen.displayTotalTeachingHoursByNIK();
                    break;
                case "7":
                    staffDataScreen.displaySalary();
                    break;
                case "0":
                    running = false;
                    break;
                default:
                    DialogView.showMessageDialog("Input error!");
                    break;
            }
        }
    }
}