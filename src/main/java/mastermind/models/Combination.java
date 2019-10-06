package mastermind.models;

import java.util.List;

import mastermind.Const;

import java.util.ArrayList;

abstract class Combination {

	protected List<Color> colors;

	protected Combination() {
		this.colors = new ArrayList<Color>(Const.WIDTH);
	}

	public List<Color> getColors() {
		return colors;
	}
}
