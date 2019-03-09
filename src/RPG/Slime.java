package RPG;

import java.util.List;

public class Slime extends Monster {

	public Slime() {
		super(10);
	}

	@Override
	public void attack(List<Character> chars) {
		System.out.println("スライムの攻撃");
		for(Character c : chars) {
			System.out.println("スライムは"+ c.getName() + "に2与えた");
			c.setHp(c.getHp() - 2);
		}
	}

	@Override
	public void introduce() {
		System.out.println("スライムがあらわれた！");
	}
}
