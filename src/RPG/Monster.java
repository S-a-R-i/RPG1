package RPG;

import java.util.List;

public abstract class Monster {

	private int hp;

	public Monster(int hp) {
		this.hp = hp;
	}

	public abstract void attack(List<Character> chars);
	public abstract void introduce();

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

}
