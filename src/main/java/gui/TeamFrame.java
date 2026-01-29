package gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serial;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Player;

public class TeamFrame extends JFrame {

	@Serial
	private static final long serialVersionUID = 1L;

	public TeamFrame(List<Player> players) {
		setTitle("Brasil 1994");
		setLayout(new GridLayout(0, 2, 20, 3));
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		players.forEach(this::addPlayer);

		JButton btnSair = new JButton("SAIR");
		btnSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		add(btnSair);

		pack();
		setVisible(true);
	}

	void addPlayer(Player player) {
		add(new JLabel(" " + player.getName()));
		JLabel score = new JLabel(player.getMediaString());
		score.setForeground(Color.RED);
		add(score);
	}
}
