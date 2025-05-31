// TORUSSS (RUMUS DONAT)
package uap.models;

import uap.bases.CetakanDonat;

public class Torus extends CetakanDonat {
    private double jari_jarak;
    private double jari_lubang;

    public Torus(double jari_jarak, double jari_lubang) {
        this.jari_jarak = jari_jarak;
        this.jari_lubang = jari_lubang;
    }

    @Override
    public double getVolume() {
        double pi = (double) pi_num / pi_deno;
        return 2 * Math.pow(pi, 2) * jari_jarak * Math.pow(jari_lubang, 2);
    }

    @Override
    public double getLuasPermukaan() {
        double pi = (double) pi_num / pi_deno;
        return 4 * Math.pow(pi, 2) * jari_jarak * jari_lubang;
    }
}
