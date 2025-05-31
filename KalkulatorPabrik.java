package uap.mains;

import uap.models.Torus;
import uap.models.Sphere;
import java.util.Scanner;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String garis = "=============================================";

        System.out.println(garis);
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("Nayla Shafa Khairunnisa");
        System.out.println("245150707111028");
        System.out.println(garis);

        System.out.println("Donat dengan lubang");
        System.out.println(garis);
        System.out.print("Isikan radius   : ");
        double jari_jarak = input.nextDouble();
        System.out.print("Isikan radius   : ");
        double jari_lubang = input.nextDouble();
        Torus torus = new Torus(jari_jarak, jari_lubang);
        torus.printInfo();
        System.out.println(garis);

        System.out.println("Donat tanpa lubang");
        System.out.println(garis);
        System.out.print("Isikan radius   : ");
        double jari_donat = input.nextDouble();
        Sphere sphere = new Sphere(jari_donat);
        sphere.printInfo();
        System.out.println(garis);
    }
}
