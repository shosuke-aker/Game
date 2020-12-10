package 配列;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ゲームを開始します");
		
		int number=0;
		int num=0;
		
		Random rand =new Random();
		num =rand.nextInt(10);
		//System.out.println(num);
		for(int i=0;i<5;i++) {
			System.out.print("0~9の整数を入力してください：");
			Scanner scanner=new Scanner(System .in);
			number=scanner.nextInt();
			
		if(number==num) {
			System.out.println("あたり");
		}else {
			System.out.println("ハズレ");
		
		
		}
		}System.out.println("ゲームを終了します");

	}

}
