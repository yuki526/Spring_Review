package demo;

import java.util.ArrayList;

import entity.Member;
import service.MemberService;
import service.MemberServiceImpl;

public class Main {

	public static void main(String[] args) {
//		MemberServiceImpl service = new MemberServiceImpl();
//		単体テストで擬似クラスを作って代替インスタンスを格納するため、インターフェース型で呼び出す
		MemberService service = MemberServiceImpl.getInstance();

		System.out.println(service.greet(2));
		System.out.println(service.getAll());

		ArrayList<Member> list = service.getAll();
		for(Member mem : list ) {
			System.out.println(mem.getId() + ", " + mem.getName() + ", " + mem.getEmail());
		}

		System.out.println(service.sumOf(3, 5));

	}

}
