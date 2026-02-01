package br.dev.hygino;

import java.io.Serial;
import java.util.stream.IntStream;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;

public final class Reservas extends JFrame {
    @Serial
    private static final long serialVersionUID = 1L;

    public Reservas(Quarto[] quartos) {
        super("Sistema de Reservas de Quartos");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 4, 20, 3));

        adicionarCabecalhos();

        IntStream.range(0, quartos.length)
                .forEach(q -> addRoom(q, quartos[q]));
        pack();
        setVisible(true);
    }

    private void adicionarCabecalhos() {
        add(new JLabel("Quarto"));
        add(new JLabel("Hóspedes"));
        add(new JLabel("Tarifa"));
        add(new JLabel("Fumante?"));
    }

    private void addRoom(int posicao, Quarto quarto) {
        add(new JLabel(Integer.toString(posicao)));
        add(new JLabel(Integer.toString(quarto.getHospedes())));
        add(new JLabel(String.format("R$ %.2f", quarto.getTarifa())));
        var labelFumante = new JLabel(quarto.isFumante() ? "SIM" : "NÃO");
        labelFumante.setForeground(quarto.isFumante() ? java.awt.Color.RED : java.awt.Color.GREEN);
        add(labelFumante);
    }
}
