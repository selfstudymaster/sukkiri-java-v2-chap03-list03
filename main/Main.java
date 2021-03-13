package main;

// chap03
// list03-01
//public class Main {
//
//	public static void main(String[] args) {
//		boolean weather = true;
//		if (weather == true) {
//			System.out.println("洗濯をします");
//			System.out.println("散歩にいきます");
//		} else {
//			System.out.println("DVDを見ます");
//		}
//	}
//}


//list03-02
// 実行すると無限ループになるのでCtrl C で強制終了
//public class Main {
//
//	public static void main(String[] args) {
//		boolean doorClose = true;
//		while (doorClose == true) {
//			System.out.println("ノックする");
//			System.out.println("1分待つ");
//			break; // 書き忘れると無限ループでエラーになる
//		}
//	}
//}


//list03-03は省略(内容は{}の省略)

// 文字列の比較を行う際は下記の書き方をする if(String型の変数.equals("文字列")){}
// if (s.equals("夕陽") {}

//list03-04 冗長でスッキリしないif else if if 文
//public class Main {
//	public static void main(String[] args) {
//		System.out.println("あなたの運勢を占います");
//		int fortune = new java.util.Random().nextInt(4) + 1;
//
//		if (fortune == 1) {
//			System.out.println("大吉");
//		} else if (fortune == 2) {
//			System.out.println("中吉");
//		} else if (fortune == 3) {
//			System.out.println("小吉");
//		} else {
//			System.out.println("凶");
//		}
//	}
//}

// list03-05 if文をwhile文に書き換え
//public class Main {
//	public static void main(String[] args) {
//		System.out.println("あなたの運勢を占います");
//		int fortune = 1;
//		switch (fortune) {
//		case 1:
//		System.out.println("大吉");
//		break;
//		case 2:
//			System.out.println("中吉");
//			break;
//		case 3:
//			System.out.println("小吉");
//			break;
//		case 4:
//			System.out.println("凶");
//			break;
//		}
//
//	}
//}

//list03-06 if文をwhile文に書き換え
//public class Main {
//	public static void main(String[] args) {
//		System.out.println("あなたの運勢を占います");
//		int fortune = new java.util.Random().nextInt(5) + 1;
//		switch (fortune) {
//		case 1:
//		case 2:
//			System.out.println("いいね");
//			break;
//		case 3:
//			System.out.println("普通です");
//			break;
//		case 4:
//		case 5:
//			System.out.println("うーん...");
//			// break;を書かないことで次のcaseまで実行してしまう特徴を逆手にとる
//		}
//
//	}
//}

//list03-07 for文
//public class Main {
//	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("こんにちは");
//		}
//	}
//}

//list03-08 for文
//public class Main {
//	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("現在" + (i + 1) + "周目");
//		}
//	}
//}

// list03-09 for文で九九の表を出力
//public class Main {
//	public static void main(String[] args) {
//		// i = 1, 2, 3, 4, 5, 6, 7, 8, 9と増えていく
//		for (int i = 1; i < 10; i++) {
//
//			// j = 1, 2, 3, 4, 5, 6, 7, 8, 9まで来た後に上のfor文に戻る
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i * j);
//				System.out.println(" "); // 空白を出力するためのコード
//			}
//			System.out.println(""); // 改行を出力するためのコード
//		}
//	}
//}


// break文, continue文, 無限ループ

// practice03-01
// weight == 60;
// (age1 + age2) * 2 > 60;
// age % 2 = 1;
// name.equals("湊");

// practice03-02
// C, D, E

// practice03-03
//public class Main {
//	public static void main(String[] args) {
//		int seibetu = 0;
//		int age = 3;
//		System.out.println("こんにちは");
//		if (seibetu == 0) {
//			System.out.println("私は男です。");
//			System.out.println(age + "歳です。");
//		} else {
//			System.out.println("私は女です。");
//		}
//		System.out.println("よろしくおねがいします。");
//	}
//}

// practice03-04
//public class Main {
//	public static void main(String[] args) {
//		boolean weather = false;
//		if (weather == true) {
//			System.out.println("洗濯をします");
//			System.out.println("散歩にいきます");
//		} else {
//			System.out.println("DVDを見ます");
//			System.out.println("寝ます");
//		}
//	}
//}

//practice03-05
//public class Main {
//	public static void main(String[] args) {
//		System.out.println("[メニュー]1:検索 2:登録 3:削除 4:変更>");
//		int selected = new java.util.Scanner(System.in).nextInt();
//		switch (selected) {
//			case 1:
//				System.out.println("検索します");
//				break;
//			case 2:
//				System.out.println("登録します");
//				break;
//			case 3:
//				System.out.println("削除します");
//				break;
//			case 4:
//				System.out.println("変更します");
//				break;
//		}
//	}
//}


//practice03-06
public class Main {
	public static void main(String[] args) {
		System.out.println("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(10);

		for (int i = 0; i < 5; i++) {
			System.out.println("0〜9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if (ans == num) {
				System.out.println("アタリ！");
				break;
			} else {
				System.out.println("違います。");
			}
		}
		System.out.println("ゲームを終了します");
	}
}