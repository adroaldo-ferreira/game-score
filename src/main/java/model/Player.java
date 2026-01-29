package model;

import java.text.DecimalFormat;

public class Player {
	private String name;
	private double media;

	public Player(String name, double media) {
		this.name = name;
		this.media = media;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public String getMediaString() {
		DecimalFormat decimalFormat = new DecimalFormat();
		decimalFormat.setMinimumIntegerDigits(0);
		decimalFormat.setMaximumFractionDigits(3);
		decimalFormat.setMinimumFractionDigits(3);
		return decimalFormat.format(media);
	}

	@Override
	public String toString() {
		return String.format("%s: %.3f", name, media);
	}
}
