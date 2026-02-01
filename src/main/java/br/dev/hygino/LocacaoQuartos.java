package br.dev.hygino;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.out;
import java.util.stream.IntStream;

public class LocacaoQuartos {

    public static void main(String[] args) {
        final int totalDeQuartos = 10;

        final int hospedes[] = new int[totalDeQuartos];

        try (Scanner diskScanner = new Scanner(new File("ListaHospedes.txt"))) {

            for (int numeroQuarto = 0; numeroQuarto < totalDeQuartos; numeroQuarto++) {
                hospedes[numeroQuarto] = diskScanner.nextInt();
            }

            out.println("Quarto\tHóspedes");

            IntStream.range(0, totalDeQuartos)
                    .forEach(q -> out.printf("%d\t%d\n", q, hospedes[q]));
        } catch (IOException e) {
            out.println("Erro ao ler o arquivo!");

        }
    }
}
