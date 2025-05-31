package uap.bases;

import uap.interfaces.Bentuk;

public abstract class CetakanDonat implements Bentuk {
    protected static final int pi_num = 22;
    protected static final int pi_deno = 7;
    protected static final double tebal = 0.5;
    protected static final double densitas = 8.0;

    @Override
    public abstract double getVolume();

    @Override
    public abstract double getLuasPermukaan();

    public double getMassa() {
        return getVolume() * tebal * densitas;
    }

    public double getMassaKg() {
        return getMassa() / 1000;
    }

    public int getBiayaKirim() {
        return (int) Math.ceil(getMassaKg()) * 2000;
    }

    public void printInfo() {
        System.out.printf("Volume          : %.2f\n", getVolume());
        System.out.printf("Luas permukaan  : %.2f\n", getLuasPermukaan());
        System.out.printf("Massa           : %.2f\n", getMassa());
        System.out.printf("Massa dalam kg  : %.2f\n", getMassaKg());
        System.out.printf("Biaya kirim     : Rp%d\n", getBiayaKirim());
    }
}
