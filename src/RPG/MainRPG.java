package RPG;

import java.util.List;

public class MainRPG {

	public static void main(String[] args) {
		// TODO ①PartyCreatorクラスのインスタンスを生成
		PartyCreator partyCreator= new PartyCreator();

		/*
		 *  TODO ②①で生成したインスタンスからCreatePartyメソッドを呼び出す。
		 *  　　　 引数の値は任意とする。
		 *  　　　 戻り値は変数に保管すること。
		 *  　　　 ここで生成した変数を「N」と仮称する。
		 */
		 List<Character> N = partyCreator.createParty("勇者", 30, "魔女", 15);
		//CreateParty メソッドの型 は List<Character>


		/*
		 * TODO ③変数Nに保管されているHeroインスタンスとWizardインスタンスの
		 * 　　　 introduceメソッドを呼び出す。
		 * 　　　 繰り返し文を利用すること。
		 */
		 for( Character S : N){ //Heroインスタンスたちの共通型はCharacter
			 S.introduce();
			 //Heroでも Wizardでもintroduceメソッドの引数は入ってないのでここでも空
		 }

		/*
		 * TODO ④スライムを1体生成する。//→インスタンス生成
		 * 　　　 保管する変数のデータ型はMonsterクラスとすること。
		 */
		 Monster slime = new Slime();

		// TODO ⑤④で生成したスライムインスタンスのintroduceメソッドを呼び出す。
		 slime.introduce();
		/*
		 * TODO ⑥変数Nに保管されているHeroインスタンスとWizardインスタンスの
		 * 　　　 attackメソッドを呼び出し、④で生成したスライムインスタンスに攻撃する。
		 * 　　　 繰り返し文を利用すること。
		 */
		 for(Character A : N){
			 A.attack(slime);
		 }


		/*
		 *  TODO ⑦④で生成したスライムのattackメソッドを呼び出し、
		 *  　　　 変数Nに保管されているHeroインスタンスとWizardインスタンスに
		 *  　　　 攻撃
		 */
		 slime.attack(N);

	}
}
