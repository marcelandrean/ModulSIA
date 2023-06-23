package view;

import javax.swing.JOptionPane;

public class DialogView {
    public static String showInputDialog(String str) {
        return JOptionPane.showInputDialog(null, str);
    }

    public static void showMessageDialog(String str) {
        JOptionPane.showMessageDialog(null, str);
    }
}