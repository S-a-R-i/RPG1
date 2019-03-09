package RPG;

public class Wizard extends Character {

	private int mp;

	public Wizard(String name, int hp) {
		super(name, hp);
		this.mp = 10;
	}

	@Override
	public void attack(Monster m) {
		System.out.println("Wizardの攻撃");
		System.out.println("Wizardは3与えた");
		m.setHp(m.getHp() - 3);
	}

	@Override
	public void introduce() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("--- Wizardステータス ---");
		System.out.println("名前：" + this.getName());
		System.out.println("レベル：" + this.getLevel());
		System.out.println("HP：" + this.getHp());
		System.out.println("MP：" + this.getMp());

	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

}
