package RPG;

public abstract class Character {

	// 名前
	private String name;
	// HP
	private int hp;
	// レベル
	private int level;

	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
		this.level = 1;
	}

	public abstract void attack(Monster m);
	public abstract void introduce();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
