/**
 * クラス Prog12 の注釈をここに書きます.
 * 
 * @author 喜多優介
 * @version Prog12
 */
public class Prog12 {

	public static void main(String[] args) {
		final double PI = 3.14; //変更しない
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);

		System.out.println("パイの半径を倍にします");
		pie = 10;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
	}

}

