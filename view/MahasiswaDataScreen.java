package view;

import controller.MahasiswaController;

public class MahasiswaDataScreen {
    private MahasiswaController mhsController;

    public MahasiswaDataScreen(MahasiswaController mhsController) {
        this.mhsController = mhsController;
    }

    public void displayFinalScore() {
        String NIM = DialogView.showInputDialog("Input NIM:");
        String kodeMK = DialogView.showInputDialog("Input kode MK:");

        String nilaiAkhirText = mhsController.getFinalScore(NIM, kodeMK);

        DialogView.showMessageDialog(nilaiAkhirText);
    }

    public void displayAvgFinalScore() {
        String kodeMK = DialogView.showInputDialog("Input kode MK:");

        String NR = mhsController.getAvgFinalScore(kodeMK);

        DialogView.showMessageDialog("Rata-rata Nilai Akhir (NR) mata kuliah dengan kode " + kodeMK + ": " + NR);
    }

    public void displayFailedStudents() {
        String kodeMK = DialogView.showInputDialog("Input kode MK:");

        int totalMhs = mhsController.countStudentsByKodeMK(kodeMK);
        int mhsGagal = mhsController.countFailedStudents(kodeMK);
        String namaMatkul = mhsController.getMatkulName(kodeMK);

        String result = "<" + mhsGagal + ">" + " dari " + "<" + totalMhs + "> mahasiswa tidak lulus matakuliah <" + namaMatkul + ">";
        DialogView.showMessageDialog(result);
    }

    public void displayMatkulAmbilByNIM() {
        String NIM = DialogView.showInputDialog("Input NIM:");

        String result = mhsController.getMatkulAmbilByNIM(NIM);

        DialogView.showMessageDialog(result);
    }
}