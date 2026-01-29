package app;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import gui.TeamFrame;
import model.Player;

public class ShowWindow {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		final List<Player> players = getPlayerList("brasil.txt");

		if (players.isEmpty()) {
			System.out.println("Lista vazia!");
			return;
		}

		// players.forEach(System.out::println);

		new TeamFrame(players);

	}

	public static List<Player> getPlayerList(String filename) {
		//System.out.println("Lendo arquivo");
		//System.out.println(new File(filename).getAbsolutePath());

		try (Scanner fileToScan = new Scanner(new File(filename))) {
			List<Player> players = new ArrayList<Player>();

			while (fileToScan.hasNextLine()) {
				String name = fileToScan.nextLine();
				double media = fileToScan.nextDouble();
				fileToScan.nextLine();
				Player player = new Player(name, media);
				players.add(player);
			}

			return players;

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Erro ao ler o arquivo!");
		}
	}
}
