package RPG;

public class Hero extends Character {

	public Hero(String name, int hp) {
		super(name, hp);
	}

	@Override
	public void attack(Monster m) {
		System.out.println("Heroの攻撃");
		System.out.println("Heroは5ダメージ与えた");
		m.setHp(m.getHp() - 5);
	}

	@Override
	public void introduce() {
		System.out.println("--- Heroステータス ---");
		System.out.println("名前：" + this.getName());
		System.out.println("HP：" + this.getHp());
		System.out.println("レベル：" + this.getLevel());
	}
}
