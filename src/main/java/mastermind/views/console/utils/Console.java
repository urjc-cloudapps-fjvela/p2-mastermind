package mastermind.views.console.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import mastermind.models.Color;
import mastermind.models.Error;
import mastermind.models.Message;

public class Console {

	private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	public String readString(String title) {
		String input = null;
		boolean ok = false;
		do {
			this.write(title);
			try {
				input = this.bufferedReader.readLine();
				ok = true;
			} catch (Exception ex) {
				this.writeError("characte string");
			}
		} while (!ok);
		return input;
	}

	public String readString() {
		return this.readString("");
	}

	public int readInt(String title) {
		int input = 0;
		boolean ok = false;
		do {
			try {
				input = Integer.parseInt(this.readString(title));
				ok = true;
			} catch (Exception ex) {
				this.writeError("integer");
			}
		} while (!ok);
		return input;
	}

	public char readChar(String title) {
		char charValue = ' ';
		boolean ok = false;
		do {
			String input = this.readString(title);
			if (input.length() != 1) {
				this.writeError("character");
			} else {
				charValue = input.charAt(0);
				ok = true;
			}
		} while (!ok);
		return charValue;
	}

	public void writeln() {
		System.out.println();
	}

	public void write(String string) {
		System.out.print(string);
	}

	public void writeln(String string) {
		System.out.println(string);
	}

	public void write(Message message) {
		System.out.print(message.getMessage());
	}

	public void writeln(Message message) {
		write(message);
		writeln();
	}

	public void write(Error error) {
		System.out.print(error.getMessage());
	}

	public void writeln(Error error) {
		write(error);
		writeln();
	}

	public void write(List<Color> colors) {
		for (Color color : colors) {
			write(color);
		}
	}

	private void write(Color color) {
		write(color.getInitial());
	}

	public void write(char character) {
		System.out.print(character);
	}

	private void writeError(String format) {
		System.out.println("FORMAT ERROR! " + "Enter a " + format + " formatted value.");
	}
}
