package mastermind.models;

import java.util.Random;

import mastermind.Const;

import java.util.Arrays;
import java.util.Collections;

class SecretCombination extends Combination {

	SecretCombination() {
		for (Color color : Color.values()) {
			this.colors.add(color);
		}
		Random random = new Random(System.currentTimeMillis());
		final int erased = colors.size() - Const.WIDTH;
		for (int i = 0; i < erased; i++) {
			this.colors.remove(random.nextInt(this.colors.size()));
		}
		Collections.shuffle(this.colors);
	}

	Result getResult(ProposedCombination proposedCombination) {
		int blacks = 0;
		for (int i = 0; i < this.colors.size(); i++) {
			if (proposedCombination.contains(this.colors.get(i), i)) {
				blacks++;
			}
		}
		int whites = 0;
		for (Color color : this.colors) {
			if (proposedCombination.contains(color)) {
				whites++;
			}
		}
		return new Result(blacks, whites - blacks);
	}

	String getCombination() {
		char[] secret = new char[colors.size()];
		Arrays.fill(secret, Message.SECRET.getMessage().charAt(0)); //chapuzilla
		return new String(secret);
	}

}
