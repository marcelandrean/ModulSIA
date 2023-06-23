package view;

import controller.UserController;

public class UserDataScreen {
    private UserController userController;

    public UserDataScreen(UserController userController) {
        this.userController = userController;
    }

    public void displayUserData() {
        String name = DialogView.showInputDialog("Input nama:");

        String userData = userController.getUserData(name);

        DialogView.showMessageDialog(userData);
    }
}
