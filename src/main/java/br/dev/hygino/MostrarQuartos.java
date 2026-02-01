package br.dev.hygino;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MostrarQuartos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        final int numeroQuartos = 10;
        Quarto quartos[] = new Quarto[numeroQuartos];
        try (Scanner diskScanner = new Scanner(new File("Quartos.txt"))) {
            IntStream.range(0, numeroQuartos)
                    .forEach(q -> {
                        quartos[q] = new Quarto();
                        quartos[q].lerQuarto(diskScanner);
                    });

            new Reservas(quartos);

            escreverQuartos(quartos);
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao ler o arquivo!");
        }
    }

    private static void escreverQuartos(Quarto[] quartos) {
        System.out.printf("Quarto\tHóspedes\tTarifa\tFumante?\n");
        for (int i = 0; i < quartos.length; i++) {
            System.out.print(i + "\t");
            quartos[i].escreverQuarto();
        }
    }
}
