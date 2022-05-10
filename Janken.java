package mygame;

import java.util.Randam;
import java.util.Scanner;

public class JankenIf {

    public static void main(String[] args) {
        // ユーザの手をキーボードから入力してもらう
		int user = getUser();
		// コンピュータの手を乱数で作成する
		int pc = getPc();
		// 勝敗の判定を行う
		String result = judgeJanken(user,pc);
		// 結果を表示する
		showResult(user,pc,result);
	}

	public static int getUser() {
		// キーボード入力の準備
		Scanner stdin = new Scanner(System.in);
		// ループ
		while(true) {
			// メッセージの表示
			System.out.println("あなたのじゃんけんの手を入力して下さい");
			System.out.print("(グー：1，チョキ：2、パー：3)　--> ");

			
	}
        
    }

