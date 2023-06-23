package view;

import controller.StaffController;

public class StaffDataScreen {
    private StaffController staffController;

    public StaffDataScreen(StaffController staffController) {
        this.staffController = staffController;
    }

    public void displayTotalTeachingHoursByNIK() {
        String NIK = DialogView.showInputDialog("Input NIK:");

        String totalHoursText = staffController.getTotalTeachingHoursByNIK(NIK);

        DialogView.showMessageDialog(totalHoursText);
    }

    public void displaySalary() {
        String NIK = DialogView.showInputDialog("Input NIK:");

        String salaryText = staffController.calculateSalary(NIK);

        DialogView.showMessageDialog(salaryText);
    }
}