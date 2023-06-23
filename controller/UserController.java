package controller;

import java.util.ArrayList;

import model.Doktor;
import model.DosenHonorer;
import model.DosenTetap;
import model.Karyawan;
import model.Magister;
import model.Sarjana;
import model.User;

public class UserController {
    private ArrayList<User> listUser;

    public UserController() {
    }

    public UserController(ArrayList<User> listUser) {
        this.listUser = listUser;
    }

    public String getUserData(String name) {
        User selectedUser = null;
        for (User user : listUser) {
            if (user.getNama().equalsIgnoreCase(name)) {
                selectedUser = user;
                break;
            }
        }

        String status = "Status: ";
        if (selectedUser instanceof Sarjana) {
            status += "Mahasiswa Sarjana";
        } else if (selectedUser instanceof Magister) {
            status += "Mahasiswa Magister";
        } else if (selectedUser instanceof Doktor) {
            status += "Mahasiswa Doktor";
        } else if (selectedUser instanceof DosenTetap) {
            status += "Dosen Tetap";
        } else if (selectedUser instanceof DosenHonorer) {
            status += "Dosen Honorer";
        } else if (selectedUser instanceof Karyawan) {
            status += "Karyawan";
        }

        if (selectedUser != null) {
            return status + "\n" + selectedUser.toString();
        } else {
            return "User tidak ditemukan.";
        }
    }
}