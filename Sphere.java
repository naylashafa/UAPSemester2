// SPHERE (RUMUS BOLA)
package uap.models;

import uap.bases.CetakanDonat;

public class Sphere extends CetakanDonat {
    private double jari_donat;

    public Sphere(double jari_donat) {
        this.jari_donat = jari_donat;
    }

    @Override
    public double getVolume() {
        double pi = (double) pi_num / pi_deno;
        return (4.0 / 3.0) * pi * Math.pow(jari_donat, 3);
    }

    @Override
    public double getLuasPermukaan() {
        double pi = (double) pi_num / pi_deno;
        return 4 * pi * Math.pow(jari_donat, 2);
    }
}
