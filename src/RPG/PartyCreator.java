package RPG;

import java.util.ArrayList;
import java.util.List;

public class PartyCreator {

	/**
	 * TODO メソッドの作成
	 * メソッド①
	 * ＜Heroクラスのインスタンスを生成し、返却する＞
	 * アクセス修飾子：自クラスのみ参照可能
	 * 戻り値の型：Characterクラス
	 * メソッド名：createHero
	 * 引数リスト：名前(文字列)、HP(整数)
	 * 処理内容：
	 * 　Heroクラスのインスタンスを生成し、返却する。
	 * 　インスタンス生成時、名前とHPのデータを渡す。
	 */
	private Character createHero(String name,int hp){
		Character hero = new Hero(name, hp);
		return hero;
	}

	/**
	 * TODO メソッドの作成
	 * メソッド②
	 * ＜Wizardクラスのインスタンスを生成し、返却する＞
	 * アクセス修飾子：自クラスのみ参照可能
	 * 戻り値の型：Characterクラス
	 * メソッド名：createWizard
	 * 引数リスト：名前(文字列)、HP(整数)
	 * 処理内容：
	 * 　wizardクラスのインスタンスを生成し、返却する。
	 * 　インスタンス生成時、名前とHPのデータを渡す。
	 */
	private Character createWizard(String name,int hp){
		Character wizard = new Wizard(name, hp);
		return wizard;
	}


	/**
	 * TODO メソッドの作成
	 * メソッド③
	 * ＜パーティーを生成し、返却する＞
	 * アクセス修飾子：全クラス参照可能
	 * 戻り値の型：List<Character>
	 * メソッド名：createParty
	 * 引数リスト：Heroの名前(文字列)、HeroのHP(整数)、Wizardの名前(文字列)、WizardのHP(整数)
	 * 処理内容：
	 * 　・メソッド①を利用してHeroインスタンスを生成
	 * 　　メソッド呼び出し時、引数リストのHeroの名前とHeroのHPを渡す
	 * 　・メソッド②を利用してWizardインスタンスを生成
	 * 　　メソッド呼び出し時、引数リストのWizardの名前とWizardのHPを渡す
	 * 　・↑で作成したHeroインスタンスとWizardインスタンスを
	 * 　　ArrayListインスタンスに保管する。
	 * 　・↑のArrayListインスタンスを返却する
	 */

	public List<Character> createParty (String heroName, int heroHp, String wizardName, int wizardHp){
		Character hero = new Hero(heroName,heroHp);
		Character wizard = new Wizard(wizardName,wizardHp);
		List<Character> list = new ArrayList<>();
		list.add(hero);
		list.add(wizard);
		return list;
	}
}
