package model;

import java.util.ArrayList;

public class DosenHonorer extends Dosen {
    int honorPerSKS;

    public DosenHonorer() {
    }

    public DosenHonorer(String nama, String alamat, String TTL, String telepon, String NIK, String departemen,
            ArrayList<MatkulAjar> listMatkulAjar, int honorPerSKS) {
        super(nama, alamat, TTL, telepon, NIK, departemen, listMatkulAjar);
        this.honorPerSKS = honorPerSKS;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHonor per SKS: " + honorPerSKS;
    }
}