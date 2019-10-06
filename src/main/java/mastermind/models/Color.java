package mastermind.models;

public enum Color {
	RED('r'), BLUE('b'), YELLOW('y'), GREEN('g'), ORANGE('o'), PURPLE('p');

	private char initial;

	private Color(char initial) {
		this.initial = initial;
	}

	static String allInitials() {
		String result = "";
		for (Color color : Color.values()) {
			result += color.initial;
		}
		return result;
	}

	public static Color getInstance(char character) {
		for (Color color : Color.values()) {
			if (color.initial == character) {
				return color;
			}
		}
		return null;
	}

	public char getInitial() {
		return this.initial;
	}

}
