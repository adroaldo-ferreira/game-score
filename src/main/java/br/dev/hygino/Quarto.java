package br.dev.hygino;

import static java.lang.System.out;

import java.util.Scanner;

public class Quarto {

    private int hospedes;
    private double tarifa;
    private boolean fumante;

    public Quarto() {
    }

    public int getHospedes() {
        return hospedes;
    }

    public void setHospedes(int hospedes) {
        this.hospedes = hospedes;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isFumante() {
        return fumante;
    }

    public void setFumante(boolean fumante) {
        this.fumante = fumante;
    }

    public void lerQuarto(Scanner diskScanner) {
        hospedes = diskScanner.nextInt();
        tarifa = diskScanner.nextDouble();
        fumante = diskScanner.nextBoolean();
    }

    public void escreverQuarto() {
        out.printf("%-10d %-10.2f %-5s\n",
                hospedes,
                tarifa,
                fumante ? "SIM" : "NÃO");
    }
}
