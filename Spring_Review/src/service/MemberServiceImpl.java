package service;

import java.util.ArrayList;

import entity.Member;

public class MemberServiceImpl implements MemberService {

//	シングルトン：そのクラスのインスタンスが必ず1つであることを保証するデザインパターン

//	インスタンスをnewする
	private static MemberServiceImpl singleton = new MemberServiceImpl();
//	コンストラクタをprivateに設定（外からnewできない）
	private MemberServiceImpl () {};
//	インスタンスを呼び出すメソッドを作る
	public static MemberServiceImpl getInstance() {
		return singleton;
	}

	@Override
	public String greet(int i) {
		String[] greetings = {"Good Morning", "Hello", "Good Evening"};
		return greetings[i];
	}

	@Override
	public ArrayList<Member> getAll() {
		ArrayList<Member> list = new ArrayList<>();
		Member mem1 = new Member(1, "Linda", "linda@example.com");
		Member mem2 = new Member(2, "James", "james@example.com");

		list.add(mem1);
		list.add(mem2);

		return list;
	}

	@Override
	public int sumOf(int x, int y) {
		int total = x;
		x += 1;
		while (x <= y) {
			total += x;
			x += 1;
		}

		return total;
	}

}
