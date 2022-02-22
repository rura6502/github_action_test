package io.github.rura6502.github_action_test;

public class GithubActionTestApplication {


	public static boolean test(int v) {
		if (v % 2 == 0) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
			System.out.println(5);
			System.out.println(6);
			System.out.println(7);
			return true;
		} else {
			System.out.println(8);
			System.out.println(9);
			System.out.println(10);
			return false;
		}
	}
}